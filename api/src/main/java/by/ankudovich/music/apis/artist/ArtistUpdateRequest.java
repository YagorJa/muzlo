package by.ankudovich.music.apis.artist;

import lombok.Data;

@Data
public class ArtistUpdateRequest extends ArtistCreateRequest {
    private Long id;
}
