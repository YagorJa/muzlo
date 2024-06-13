package by.ankudovich.music.apis.track;

import by.ankudovich.music.apis.album.AlbumResponse;
import by.ankudovich.music.apis.artist.ArtistResponse;
import by.ankudovich.music.apis.genres.GenreResponse;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;
@Data
public class TrackResponse {
    private Long id;
    private String trackName;
    private ArtistResponse artist;
    private AlbumResponse album;
    private GenreResponse genre;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate releaseDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public ArtistResponse getArtist() {
        return artist;
    }

    public void setArtist(ArtistResponse artist) {
        this.artist = artist;
    }

    public AlbumResponse getAlbum() {
        return album;
    }

    public void setAlbum(AlbumResponse album) {
        this.album = album;
    }

    public GenreResponse getGenre() {
        return genre;
    }

    public void setGenre(GenreResponse genre) {
        this.genre = genre;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
}
