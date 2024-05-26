package by.ankudovich.music.repository;

import by.ankudovich.music.entity.Subscriptions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionRepository extends JpaRepository<Subscriptions,Long> {
}
