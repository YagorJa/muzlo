package by.ankudovich.music.service.album;

import by.ankudovich.music.apis.album.AlbumCreateRequest;
import by.ankudovich.music.apis.album.AlbumResponse;
import by.ankudovich.music.mapper.AlbumMapper;
import by.ankudovich.music.repository.AlbumRepository;
import by.ankudovich.music.repository.ArtistRepository;
import by.ankudovich.music.repository.GenreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AlbumServiceImpl implements AlbumService {
    private final AlbumRepository albumRepository;
    private final AlbumMapper albumMapper;
    private final ArtistRepository artistRepository;
    private final GenreRepository genreRepository;

    @Override
    public AlbumResponse addAlbum(AlbumCreateRequest request) {
        var album = albumMapper.toEntity(request);
        album.setArtist(artistRepository.findById(request.getArtistId()).orElse(null));
        album.setGenre(genreRepository.findById(request.getGenreId()).orElse(null));

        return albumMapper.toResponse(albumRepository.save(album));
    }

    @Override
    public AlbumResponse getAlbum(Long id) {
        return albumMapper.toResponse(albumRepository.findById(id).orElse(null));
    }
}