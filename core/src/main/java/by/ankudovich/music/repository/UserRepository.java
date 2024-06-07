package by.ankudovich.music.repository;

import by.ankudovich.music.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface UserRepository extends JpaRepository<User,Long> {
    @Query("select u from User u where u.username =:username")
    User findByLogin(@Param("username") String username);
//    List<User> findAllByNameAndSurname(String name, String surname);
}
