package catshelter.catshelterapp.repository;

import catshelter.catshelterapp.model.entity.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriberRepository extends JpaRepository<Subscriber, Long> {
    boolean existsBySubsEmail(String email);
}
