package catshelter.catshelterapp.validation;



import catshelter.catshelterapp.service.UserService;
import catshelter.catshelterapp.validation.annotations.UniqueEmail;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;



public class UniqueEmailValidator implements ConstraintValidator<UniqueEmail, String> {

    private final UserService userService;

    public UniqueEmailValidator(UserService userService) {
        this.userService = userService;
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return this.userService.findUserByEmail(value) == null;
    }
}