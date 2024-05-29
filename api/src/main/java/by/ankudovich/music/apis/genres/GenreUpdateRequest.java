package by.ankudovich.music.apis.genres;

import lombok.Data;

@Data
public class GenreUpdateRequest extends GenreCreateRequest {
    private Long id;
}
