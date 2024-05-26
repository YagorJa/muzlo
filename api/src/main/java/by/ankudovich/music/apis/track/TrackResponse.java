package by.ankudovich.music.apis.track;

import by.ankudovich.music.apis.album.AlbumResponse;
import by.ankudovich.music.apis.artist.ArtistResponse;
import by.ankudovich.music.apis.genres.GenreResponse;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
@Data
public class TrackResponse {
    private Long id;
    private String trackName;
    private ArtistResponse artist;
    private AlbumResponse album;
    private GenreResponse genre;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date releaseDate;
}
