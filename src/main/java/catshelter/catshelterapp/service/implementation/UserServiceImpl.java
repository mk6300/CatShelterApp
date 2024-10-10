package catshelter.catshelterapp.service.implementation;

import catshelter.catshelterapp.model.entity.User;
import catshelter.catshelterapp.repository.UserRepository;
import catshelter.catshelterapp.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

   private final UserRepository userRepository;
   private final ModelMapper modelMapper;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
         this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public User findUserByEmail(String email) {
        return this.userRepository.findByEmail(email).orElse(null);
    }

    @Override
    public User findUserByUsername(String username) {
        return this.userRepository.findByUsername(username).orElse(null);
    }
}
