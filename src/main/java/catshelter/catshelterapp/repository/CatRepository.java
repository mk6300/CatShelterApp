package catshelter.catshelterapp.repository;

import catshelter.catshelterapp.model.entity.Cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface CatRepository extends JpaRepository<Cat, Long> {

    Optional<Cat> findByName(String name);
}
