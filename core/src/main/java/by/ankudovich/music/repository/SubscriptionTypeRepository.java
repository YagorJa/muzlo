package by.ankudovich.music.repository;

import by.ankudovich.music.entity.SubscriptionTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionTypeRepository extends JpaRepository<SubscriptionTypes,Long> {
}
