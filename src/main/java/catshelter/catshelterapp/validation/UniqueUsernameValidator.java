package catshelter.catshelterapp.validation;


import catshelter.catshelterapp.service.UserService;
import catshelter.catshelterapp.validation.annotations.UniqueUsername;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;



public class UniqueUsernameValidator implements ConstraintValidator<UniqueUsername, String> {

    private final UserService userService;

    public UniqueUsernameValidator(UserService userService) {
        this.userService = userService;
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return this.userService.findUserByUsername(value) == null;
    }
}