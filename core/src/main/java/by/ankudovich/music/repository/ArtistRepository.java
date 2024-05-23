package by.ankudovich.music.repository;

import by.ankudovich.music.entity.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtistRepository extends JpaRepository<Artist,Long> {
 List<Artist> findByArtistName(String artist_name);
}
