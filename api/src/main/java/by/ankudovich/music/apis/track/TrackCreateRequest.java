package by.ankudovich.music.apis.track;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
@Data
public class TrackCreateRequest {
    private String trackName;
    private Long artistId;
    private Long albumId;
    private Long genreId;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date releaseDate;

}
