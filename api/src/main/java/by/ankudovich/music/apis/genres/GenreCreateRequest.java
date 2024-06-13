package by.ankudovich.music.apis.genres;

import lombok.Data;

import java.util.Collection;

@Data
public class GenreCreateRequest {
    private String genreName;
    private String genreDescription;
//    private Collection <Long> albumsID;
//    private Collection<Long> songsID;

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

    public String getGenreDescription() {
        return genreDescription;
    }

    public void setGenreDescription(String genreDescription) {
        this.genreDescription = genreDescription;
    }
}
