package catshelter.catshelterapp.repository;

import catshelter.catshelterapp.model.entity.UserRole;
import catshelter.catshelterapp.model.entity.UserRoleEnum;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {

    Optional<UserRole> findByRole (UserRoleEnum role);
}
