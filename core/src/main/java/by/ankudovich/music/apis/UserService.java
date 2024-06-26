package by.ankudovich.music.apis;

import by.ankudovich.music.entity.User;
import by.ankudovich.music.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class UserService {
    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public List <User> findAll(){
        return userRepository.findAll();
    }
    public User findOne(long id){
       Optional<User>  foundUser = userRepository.findById(id);
        return foundUser.orElse(null);
    }
    @Transactional
    public void save(User user){
        userRepository.save(user);
    }
    @Transactional
    public void update(long id, User updatedUser){
        updatedUser.setUserId(id);
        userRepository.save(updatedUser);
    }
    @Transactional
    public void delete (long id){
        userRepository.deleteById(id);
    }
}
