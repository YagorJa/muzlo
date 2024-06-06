package by.ankudovich.music.service.album;

import by.ankudovich.music.apis.genres.GenreCreateRequest;
import by.ankudovich.music.apis.genres.GenreResponse;
import by.ankudovich.music.mapper.GenreMapper;
import by.ankudovich.music.repository.GenreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class GenreServiceImpl implements GenreService {

    private final GenreRepository genreRepository;

    private final GenreMapper genreMapper;

    @Override
    public GenreResponse addGenre(GenreCreateRequest request) {
        var genre = genreMapper.toEntity(request);
        return genreMapper.toResponse(genreRepository.save(genre));
    }

    @Override
    public GenreResponse getGenre(Long id) {
        return genreMapper.toResponse(genreRepository.findById(id).orElse(null));
    }
}