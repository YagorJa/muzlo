package by.ankudovich.music.repository;

import by.ankudovich.music.entity.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackRepository extends JpaRepository<Track,Long>, JpaSpecificationExecutor<Track> {
}
