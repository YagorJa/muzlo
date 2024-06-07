package by.ankudovich.music.service.track;

import by.ankudovich.music.apis.track.TrackCreateRequest;
import by.ankudovich.music.apis.track.TrackResponse;
import by.ankudovich.music.entity.Track;
import by.ankudovich.music.mapper.TrackMapper;
import by.ankudovich.music.repository.AlbumRepository;
import by.ankudovich.music.repository.ArtistRepository;
import by.ankudovich.music.repository.GenreRepository;
import by.ankudovich.music.repository.TrackRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class TrackServiceImpl implements TrackService {
    private final TrackRepository trackRepository;
    private final TrackMapper trackMapper;
    private final ArtistRepository artistRepository;
    private final GenreRepository genreRepository;
    private final AlbumRepository albumRepository;
    @Override
    public TrackResponse add(TrackCreateRequest request) {
        var song = trackMapper.toEntity(request);
        song.setArtist(artistRepository.findById(request.getArtistId()).orElse(null));
        song.setGenre(genreRepository.findById(request.getGenreId()).orElse(null));
        song.setAlbum(albumRepository.findById(request.getAlbumId()).orElse(null));
        return trackMapper.toResponse(trackRepository.save(song));
    }

    @Override
    public Collection<TrackResponse> getSongsByArtistId(Long artistId) {
        Specification<Track> spec = Specification.where(((root, query, criteriaBuilder)
                -> criteriaBuilder.equal(root.get("artistId"), artistId)));
        return trackRepository.findAll(spec).stream().map(trackMapper::toResponse).toList();
    }
    @Override
    public TrackResponse getTrackById(Long id) {
        return trackMapper.toResponse(trackRepository.findById(id).orElse(null));
    }
}
