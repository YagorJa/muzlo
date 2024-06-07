package by.ankudovich.music.controller;

import by.ankudovich.music.apis.track.TrackResponse;
import by.ankudovich.music.apis.user.UserCreateRequest;
import by.ankudovich.music.apis.user.UserResponse;
import by.ankudovich.music.exception.UniversalException;
import by.ankudovich.music.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RequiredArgsConstructor
@RestController
@RequestMapping("user")
public class UserRestController {
    private final UserService userService;

    @Transactional
    @PostMapping
    public UserResponse register(@RequestBody UserCreateRequest createRequest) {
        return userService.register(createRequest);
    }
    @Transactional
    @PostMapping("/favorite")
    public TrackResponse addFavorite(@RequestParam Long userId, @RequestParam Long songId) {
        return userService.addFavoriteSong(songId, userId);
    }
    @PostMapping("/auth")
    public UserResponse auth(@RequestParam String login, @RequestParam String password) {
        return userService.authorization(login, password);
    }


    @GetMapping
    private Collection<UserResponse> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/favorite")
    public Collection<TrackResponse> getFavoriteSongs(@RequestParam Long userId) {
        return userService.getFavoriteSongs(userId);
    }
    @GetMapping("/user/{id}")
    public UserResponse getUser(@PathVariable Long id) {
        var user = userService.getUserById(id);
        if(user == null) {
            throw new UniversalException("пльзователь не существует");
        }
        return user;
    }


    @DeleteMapping("/favorite")
    public void removeFavorite(@RequestParam Long userId, @RequestParam Long songId) {
        userService.deleteFavoriteSong(songId, userId);
    }


}
