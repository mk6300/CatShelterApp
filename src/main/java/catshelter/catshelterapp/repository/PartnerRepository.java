package catshelter.catshelterapp.repository;

import catshelter.catshelterapp.model.entity.Partner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PartnerRepository extends JpaRepository<Partner, Long> {

    Optional<Partner> findByName(String name);
}
