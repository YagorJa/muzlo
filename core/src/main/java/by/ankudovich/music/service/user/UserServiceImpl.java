package by.ankudovich.music.service.user;

import by.ankudovich.music.apis.track.TrackResponse;
import by.ankudovich.music.apis.user.UserCreateRequest;
import by.ankudovich.music.apis.user.UserResponse;
import by.ankudovich.music.entity.Track;
import by.ankudovich.music.entity.User;
import by.ankudovich.music.exception.UniversalException;
import by.ankudovich.music.mapper.TrackMapper;
import by.ankudovich.music.mapper.UserMapper;
import by.ankudovich.music.repository.TrackRepository;
import by.ankudovich.music.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final TrackRepository trackRepository;
    private final TrackMapper trackMapper;

    @Override
    public UserResponse register(UserCreateRequest createRequest) {
        var user = userMapper.toEntity(createRequest);
        return userMapper.toResponse(userRepository.save(user));
    }

    @Override
    public Collection<UserResponse> getUsers() {
        return userRepository.findAll().stream().map(userMapper::toResponse).collect(Collectors.toList());
    }


    @Override
    @Transactional
    public TrackResponse addFavoriteSong(Long songId, Long userId) {
        Optional<User> user = userRepository.findById(userId);
        Optional<Track> song = trackRepository.findById(songId);
        user.ifPresent(user1 -> {user1.getFavoriteSongs().stream().
                forEach(x ->
                {if(x == song.get())
                    throw new UniversalException("песня уже есть в списке");
                });
            user1.getFavoriteSongs().add(song.get());}); //дописать проверку на уникальность
        userRepository.saveAndFlush(user.get());
        return trackMapper.toResponse(song.get());
    }
    @Override
    public Collection<TrackResponse> getFavoriteSongs(Long userId) {
        Optional<User> user = userRepository.findById(userId);
        return user.get().getFavoriteSongs().stream().map(trackMapper::toResponse).collect(Collectors.toList());
    }
    @Override
    public void deleteFavoriteSong(Long songId, Long userId) {
        Optional<User> user = userRepository.findById(userId);
        Optional<Track> song = trackRepository.findById(songId);
        user.ifPresent(user1 -> {user1.getFavoriteSongs().remove(song.get());});
        userRepository.save(user.get());
        userRepository.flush();
    }

    @Override
    public UserResponse authorization(String login, String password) {
        var user = userRepository.findByLogin(login);
        if (user == null){
            throw new UniversalException("Пользователь не найден");
        }
        if(user.getPassword().equals(password)){
            return userMapper.toResponse(user);
        }
        throw new UniversalException("неверный пароль");
    }

    @Override
    public UserResponse getUserById(Long userId) {
        return userMapper.toResponse(userRepository.findById(userId).get());
    }
//    сделать exeption и метод должен ее выбрасывать


}