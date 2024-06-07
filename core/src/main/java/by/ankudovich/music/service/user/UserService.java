package by.ankudovich.music.service.user;

import by.ankudovich.music.apis.track.TrackResponse;
import by.ankudovich.music.apis.user.UserCreateRequest;
import by.ankudovich.music.apis.user.UserResponse;

import java.util.Collection;

public interface UserService {
    public UserResponse register(UserCreateRequest user);
    public Collection<UserResponse> getUsers();
    public TrackResponse addFavoriteSong(Long songId, Long userId);
    public Collection<TrackResponse> getFavoriteSongs(Long userId);
    public void deleteFavoriteSong(Long songId, Long userId);
    public UserResponse authorization(String login, String password);
    public UserResponse getUserById(Long userId);
}
