package by.ankudovich.music.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
@Table(schema = "muzlo", name = "tracks")
public class Track {
    @Id
    @GeneratedValue
    private Long trackId;

    @ManyToOne
    @JoinColumn(name="albumId", nullable=false)
    private Album album;

    @ManyToOne
    private Genres genre;

    @ManyToOne
    @JoinColumn(name="artisId", nullable=false)
    private Artist artist;

    private String trackName;
    private Date releaseDate;

}
