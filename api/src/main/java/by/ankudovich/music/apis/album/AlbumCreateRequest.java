package by.ankudovich.music.apis.album;

import lombok.Data;
import java.time.LocalDate;

@Data
public class AlbumCreateRequest {
    private Long genreId;
    private Long artistId;
    private String albumName;
    private LocalDate releaseDate;
}
