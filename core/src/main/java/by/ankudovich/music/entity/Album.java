package by.ankudovich.music.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Collection;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
@Table(schema = "muzlo", name = "albums")
public class Album {
    @Id
    @GeneratedValue
    private Long albumId;
    private String albumName;
    @ManyToOne
    @JoinColumn(name="genreId", nullable=false)
    private Genres genre;
    @ManyToOne
    @JoinColumn(name="artistId", nullable=false)
    private Artist artist;

    @OneToMany(mappedBy = "album", cascade = CascadeType.ALL)
    private Collection<Track> songs;

    private LocalDate  releaseDate;

    public Long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public Genres getGenre() {
        return genre;
    }

    public void setGenre(Genres genre) {
        this.genre = genre;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Collection<Track> getSongs() {
        return songs;
    }

    public void setSongs(Collection<Track> songs) {
        this.songs = songs;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
}
