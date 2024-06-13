package by.ankudovich.music.apis.genres;

import by.ankudovich.music.apis.album.AlbumResponse;
import by.ankudovich.music.apis.track.TrackResponse;
import lombok.Data;

import java.util.Collection;

@Data
public class GenreResponse {
    private Long genreId;
    private String genreName;
    private String genreDescription;
    private Collection<AlbumResponse> albums;
    private Collection<TrackResponse> songs;

    public Long getGenreId() {
        return genreId;
    }

    public void setGenreId(Long genreId) {
        this.genreId = genreId;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

    public String getGenreDescription() {
        return genreDescription;
    }

    public void setGenreDescription(String genreDescription) {
        this.genreDescription = genreDescription;
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
