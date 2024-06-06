package by.ankudovich.music.service.album;

import by.ankudovich.music.apis.genres.GenreCreateRequest;
import by.ankudovich.music.apis.genres.GenreResponse;

public interface GenreService {
    public GenreResponse addGenre(GenreCreateRequest request);
    public GenreResponse getGenre(Long id);
}