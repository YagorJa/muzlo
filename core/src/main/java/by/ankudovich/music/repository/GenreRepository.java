package by.ankudovich.music.repository;

import by.ankudovich.music.entity.Genres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Genres,Long> {
}
