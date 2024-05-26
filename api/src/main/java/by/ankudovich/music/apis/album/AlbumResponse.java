package by.ankudovich.music.apis.album;

import lombok.Data;

import java.time.LocalDate;

@Data
public class AlbumResponse {
    private Long albumId;
    private String albumName;
    private LocalDate releaseDate;
    private String genreName;
    private String artistName;
}
