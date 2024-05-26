package by.ankudovich.music.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
@Table(schema = "muzlo", name = "artists")
public class Artist {
    @Id
    @GeneratedValue
    private Long artistId;
    private String artistName;
    private String description;

    @OneToMany(mappedBy = "artist", cascade = CascadeType.ALL)
    private Collection<Album> albums;
    @OneToMany(mappedBy = "artist", cascade =CascadeType.ALL )
    private Collection<Track> songs;

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

    public Collection<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(Collection<Album> albums) {
        this.albums = albums;
    }

    public Collection<Track> getSongs() {
        return songs;
    }

    public void setSongs(Collection<Track> songs) {
        this.songs = songs;
    }
}
