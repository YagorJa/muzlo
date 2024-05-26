package by.ankudovich.music.apis.artist;

import by.ankudovich.music.apis.album.AlbumResponse;
import by.ankudovich.music.apis.track.TrackResponse;
import lombok.Data;

import java.util.Collection;

@Data
public class ArtistResponse {
    private Long artistId;
    private String artistName;
    private String description;
    private Collection<AlbumResponse> albums;
    private Collection <TrackResponse> songs;

}
