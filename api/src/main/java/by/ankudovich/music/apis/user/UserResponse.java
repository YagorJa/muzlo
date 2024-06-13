package by.ankudovich.music.apis.user;

import by.ankudovich.music.apis.role.UserRole;
import by.ankudovich.music.apis.subscriptions.SubscriptionResponse;
import by.ankudovich.music.apis.track.TrackResponse;
import lombok.Data;

import java.util.Collection;

@Data
public class UserResponse {
    private Long id;
    private String name;
    private String username;
    private String password;
    private String email;
    private String surname;
    private SubscriptionResponse subscription;
    private Collection<TrackResponse> favoriteSongs;
    private UserRole role;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public SubscriptionResponse getSubscription() {
        return subscription;
    }

    public void setSubscription(SubscriptionResponse subscription) {
        this.subscription = subscription;
    }

    public Collection<TrackResponse> getFavoriteSongs() {
        return favoriteSongs;
    }

    public void setFavoriteSongs(Collection<TrackResponse> favoriteSongs) {
        this.favoriteSongs = favoriteSongs;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }
}
