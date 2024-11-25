package catshelter.catshelterapp.service;

import catshelter.catshelterapp.model.dto.RegisterUserDTO;
import catshelter.catshelterapp.model.entity.User;


public interface UserService {
    User findUserByEmail(String mail);

    User findUserByUsername(String username);

    void register(RegisterUserDTO registerDTO);
}
