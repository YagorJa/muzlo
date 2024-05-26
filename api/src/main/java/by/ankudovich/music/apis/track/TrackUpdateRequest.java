package by.ankudovich.music.apis.track;

import lombok.Data;

@Data
public class TrackUpdateRequest extends TrackCreateRequest {
    private Long id;
}
