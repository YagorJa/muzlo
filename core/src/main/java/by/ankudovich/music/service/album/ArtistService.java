package by.ankudovich.music.service.album;

import by.ankudovich.music.apis.artist.ArtistCreateRequest;
import by.ankudovich.music.apis.artist.ArtistResponse;

public interface ArtistService {
    public ArtistResponse add(ArtistCreateRequest request);
    public ArtistResponse getArtist(Long id);
    public ArtistResponse deleteById(Long id);
}
