package by.ankudovich.music.apis.user;

import by.ankudovich.music.apis.role.UserRole;
import by.ankudovich.music.apis.subscriptions.SubscriptionResponse;
import by.ankudovich.music.apis.track.TrackResponse;
import lombok.Data;

import java.util.Collection;

@Data
public class UserResponse {
    private String name;
    private String username;
    private String password;
    private String email;
    private String surname;
    private SubscriptionResponse subscription;
    private Collection<TrackResponse> favoriteSongs;
    private UserRole role;
}
