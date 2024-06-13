package by.ankudovich.music.apis.artist;

import lombok.Data;

import java.util.Collection;

@Data
public class ArtistCreateRequest {
    private String artistName;
    private String description;
    private Collection<Long> albumsID;
    private Collection<Long> tracksID;

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<Long> getAlbumsID() {
        return albumsID;
    }

    public void setAlbumsID(Collection<Long> albumsID) {
        this.albumsID = albumsID;
    }

    public Collection<Long> getTracksID() {
        return tracksID;
    }

    public void setTracksID(Collection<Long> tracksID) {
        this.tracksID = tracksID;
    }
}
