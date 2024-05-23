package by.ankudovich.music.repository;

import by.ankudovich.music.entity.Album;
import by.ankudovich.music.entity.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlbumRepository extends JpaRepository<Album,Long> {
    List<Album> findByArtist(Artist artist);
}
