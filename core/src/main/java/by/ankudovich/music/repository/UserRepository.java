package by.ankudovich.music.repository;

import by.ankudovich.music.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface UserRepository extends JpaRepository<User,Long> {
    List<User> findAllByNameAndSurname(String name, String surname);
}
