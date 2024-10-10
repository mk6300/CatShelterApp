package catshelter.catshelterapp.repository;

import catshelter.catshelterapp.model.entity.Adoption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AdoptionRepository extends JpaRepository<Adoption, Long> {

}
