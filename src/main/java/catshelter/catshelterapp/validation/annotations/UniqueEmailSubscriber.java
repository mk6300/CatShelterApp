package catshelter.catshelterapp.validation.annotations;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import catshelter.catshelterapp.validation.UniqueEmailSubscriberValidator;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = UniqueEmailSubscriberValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface UniqueEmailSubscriber {
    String message() default "Email already exist in subscribers";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
