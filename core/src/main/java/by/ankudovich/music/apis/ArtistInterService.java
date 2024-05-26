package by.ankudovich.music.apis;

import by.ankudovich.music.apis.artist.ArtistCreateRequest;
import by.ankudovich.music.apis.artist.ArtistResponse;
import by.ankudovich.music.apis.artist.ArtistUpdateRequest;

import java.util.Collection;

public interface ArtistInterService {
    ArtistResponse addArtist(ArtistCreateRequest createRequest);
    ArtistResponse getArtistById(Long id);

    Collection<ArtistResponse> getArtists();

    void deleteArtist(Long id);

    ArtistResponse updateArtist(ArtistUpdateRequest updateRequest);
}
