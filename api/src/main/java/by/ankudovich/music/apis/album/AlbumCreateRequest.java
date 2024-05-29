package by.ankudovich.music.apis.album;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.time.LocalDate;

@Data
public class AlbumCreateRequest {
    private String albumName;
    private Long artistId;
    private Long genreId;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate releaseDate;
}
