package by.ankudovich.music.service.artist;

import by.ankudovich.music.apis.artist.ArtistCreateRequest;
import by.ankudovich.music.apis.artist.ArtistResponse;
import by.ankudovich.music.mapper.ArtistMapper;
import by.ankudovich.music.repository.ArtistRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ArtistServiceImpl implements ArtistService {
    private final ArtistRepository artistRepository;
    private final ArtistMapper artistMapper;

    public ArtistResponse add(ArtistCreateRequest request) {
        var artist = artistMapper.toEntity(request);
        return artistMapper.toResponse(artistRepository.save(artist));
    }

    @Override
    public ArtistResponse getArtist(Long id) {
        return artistMapper.toResponse(artistRepository.findById(id).orElse(null));
    }

    public ArtistResponse deleteById(Long id) {
        var artist = artistRepository.findById(id).orElse(null);
        artistRepository.deleteById(id);
        return artistMapper.toResponse(artist);
    }
}
