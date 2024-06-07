package by.ankudovich.music.service.track;

import by.ankudovich.music.apis.track.TrackCreateRequest;
import by.ankudovich.music.apis.track.TrackResponse;

import java.util.Collection;

public interface TrackService {
    TrackResponse add(TrackCreateRequest trackCreateRequest);
    Collection<TrackResponse> getSongsByArtistId(Long artistId);
    TrackResponse getTrackById(Long id);
}
