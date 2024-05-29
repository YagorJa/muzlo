package by.ankudovich.music.apis.genres;

import by.ankudovich.music.apis.album.AlbumResponse;
import by.ankudovich.music.apis.track.TrackResponse;
import lombok.Data;

import java.util.Collection;

@Data
public class GenreResponse {
    private Long genreId;
    private String genreName;
    private String genreDescription;
    private Collection<AlbumResponse> albums;
    private Collection<TrackResponse> songs;
}
