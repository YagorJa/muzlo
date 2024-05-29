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
}
