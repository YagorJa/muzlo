package by.ankudovich.music.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
@Table(schema = "muzlo", name = "albums")
public class Album {
    @Id
    @GeneratedValue
    private Long album_id;
    @ManyToOne
    @JoinColumn(name="genre_id", nullable=false)
    private Genres genre;
    @ManyToOne
    @JoinColumn(name="artist_id", nullable=false)
    private Artist artist;
    private String albumName;
    private LocalDate  releaseDate;
}
