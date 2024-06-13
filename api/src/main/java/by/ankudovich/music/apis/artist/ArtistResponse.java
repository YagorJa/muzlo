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

    public Long getArtistId() {
        return artistId;
    }

    public void setArtistId(Long artistId) {
        this.artistId = artistId;
    }

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

    public Collection<AlbumResponse> getAlbums() {
        return albums;
    }

    public void setAlbums(Collection<AlbumResponse> albums) {
        this.albums = albums;
    }

    public Collection<TrackResponse> getSongs() {
        return songs;
    }

    public void setSongs(Collection<TrackResponse> songs) {
        this.songs = songs;
    }
}
