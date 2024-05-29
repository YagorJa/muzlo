package by.ankudovich.music.apis.genres;

import lombok.Data;

import java.util.Collection;

@Data
public class GenreCreateRequest {
    private String genreName;
    private String genreDescription;
    private Collection <Long> albumsID;
    private Collection<Long> songsID;
}
