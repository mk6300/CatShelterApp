package catshelter.catshelterapp.model.dto;

import catshelter.catshelterapp.model.entity.UserRole;

import java.util.List;
import java.util.UUID;

public class UserDTO {
    private UUID id;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    private String username;
    private String password;

    private String email;
    private String firstName;

    private String lastName;
    private String phone;

    private List<UserRole> roles;
}
