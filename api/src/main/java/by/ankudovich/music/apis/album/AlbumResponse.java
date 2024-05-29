package by.ankudovich.music.apis.album;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AlbumResponse {
    private Long albumId;
    private String albumName;
    private String artistName;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate releaseDate;
    private String genreName;
}
