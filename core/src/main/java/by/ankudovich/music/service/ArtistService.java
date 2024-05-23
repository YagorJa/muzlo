package by.ankudovich.music.service;

import by.ankudovich.music.entity.Artist;
import by.ankudovich.music.mapper.ArtistMapper;
import by.ankudovich.music.repository.ArtistRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

@Service
@Transactional
public class ArtistService implements ArtistInterService {
    @Autowired
    private ArtistRepository artistRepository;
    @Autowired
    private ArtistMapper artistMapper;

    @Autowired
    public ArtistService(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

//    public List<Artist> findByArtistName(String artist_name){
//        return artistRepository.findByArtist_name(artist_name);
//    }

    @Override
    public ArtistResponse addArtist(ArtistCreateRequest createRequest) {
      var artist = artistMapper.toEntity(createRequest);
      return artistMapper.toResponse(artistRepository.save(artist));
    }

    @Override
    public ArtistResponse getArtistById(Long id) {
        return null;
    }

    @Override
    public Collection<ArtistResponse> getArtists() {
        return artistRepository.findAll().stream().map(artistMapper::toResponse).toList();
    }

    @Override
    public void deleteArtist(Long id) {

    }

    @Override
    public ArtistResponse updateArtist(ArtistUpdateReqeust updateRequest) {
        return null;
    }
}
