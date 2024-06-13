package by.ankudovich.music.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
@Table(schema = "muzlo", name = "genres")
public class Genres {
    @Id
    @GeneratedValue
    private Long genreId;
    private String genreName;
    private String genreDescription;
    @OneToMany(mappedBy = "genre")
    private Collection<Album> albums;
    @OneToMany(mappedBy = "genre")
    private Collection<Track> songs;

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
