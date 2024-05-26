package by.ankudovich.music.apis.artist;

import lombok.Data;

import java.util.Collection;

@Data
public class ArtistCreateRequest {
    private String artistName;
    private String description;
    private Collection<Long> albumsID;
    private Collection<Long> tracksID;
}
