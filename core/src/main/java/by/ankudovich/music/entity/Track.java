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
    private Long track_id;
    @ManyToOne
    @JoinColumn(name="album_id", nullable=false)
    private Album album;

    @ManyToOne
    @JoinColumn(name="artist_id", nullable=false)
    private Artist artist;

    private String trackName;
    private Date releaseDate;

}
