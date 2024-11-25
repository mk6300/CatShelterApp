package catshelter.catshelterapp.service.implementation;

import catshelter.catshelterapp.model.dto.RegisterUserDTO;
import catshelter.catshelterapp.model.dto.UserDTO;
import catshelter.catshelterapp.model.entity.User;
import catshelter.catshelterapp.model.entity.UserRoleEnum;
import catshelter.catshelterapp.repository.UserRepository;
import catshelter.catshelterapp.repository.UserRoleRepository;
import catshelter.catshelterapp.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

   private final UserRepository userRepository;
   private final ModelMapper modelMapper;
   private final PasswordEncoder encoder;

   private final UserRoleRepository userRoleRepository;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper, PasswordEncoder encoder, UserRoleRepository userRoleRepository) {
         this.userRepository = userRepository;
        this.modelMapper = modelMapper;
        this.encoder = encoder;
        this.userRoleRepository = userRoleRepository;
    }

    @Override
    public User findUserByEmail(String email) {
        return this.userRepository.findByEmail(email).orElse(null);
    }

    @Override
    public User findUserByUsername(String username) {
        return this.userRepository.findByUsername(username).orElse(null);
    }

    @Override
    public void register(RegisterUserDTO registerUserDTO) {
        User user = this.mapUser(registerUserDTO);
        user.setPassword(encoder.encode(registerUserDTO.getPassword()));
        user.getRoles().add(userRoleRepository.findByRole(UserRoleEnum.USER).orElse(null));
        this.userRepository.save(user);
        //this.sendRegistrationConfirmationEmail(user.getEmail(), user.getFirstName(), user.getLastName());

    }

    private User mapUser(RegisterUserDTO registerUserDTO) {
        return this.modelMapper.map(registerUserDTO, User.class);
    }

    private UserDTO mapUserDTO(User user) {
        return modelMapper.map(user, UserDTO.class);
    }

}
