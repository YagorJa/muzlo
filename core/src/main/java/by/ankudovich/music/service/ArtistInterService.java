package by.ankudovich.music.service;

import java.util.Collection;

public interface ArtistInterService {
    ArtistResponse addArtist(ArtistCreateRequest createRequest);
    ArtistResponse getArtistById(Long id);

    Collection<ArtistResponse> getArtists();

    void deleteArtist(Long id);

    ArtistResponse updateArtist(ArtistUpdateReqeust updateRequest);
}
