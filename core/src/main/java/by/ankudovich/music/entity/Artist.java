package by.ankudovich.music.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
//@Data
@Inheritance(strategy = InheritanceType.JOINED)
@Table(schema = "muzlo", name = "artists")
public class Artist {
    @Id
    @GeneratedValue
    private Long artistId;
    @Column(name = "artist_name")
    private String artistName;

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

    //    public Long getArtist_id() {
//        return artist_id;
//    }
//
//    public void setArtist_id(Long artist_id) {
//        this.artist_id = artist_id;
//    }
//
//    public String getArtist_name() {
//        return artist_name;
//    }
//
//    public void setArtist_name(String artist_name) {
//        this.artist_name = artist_name;
//    }
}
