package by.ankudovich.music.service;

import lombok.Data;

//@Data
public class ArtistResponse {
    private Long artistId;
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
}
