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
}
