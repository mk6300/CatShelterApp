package catshelter.catshelterapp.validation;

import catshelter.catshelterapp.repository.SubscriberRepository;
import catshelter.catshelterapp.validation.annotations.UniqueEmailSubscriber;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;


public class UniqueEmailSubscriberValidator implements ConstraintValidator<UniqueEmailSubscriber, String> {

        private final SubscriberRepository subscriberRepository;

    public UniqueEmailSubscriberValidator(SubscriberRepository subscriberRepository) {
        this.subscriberRepository = subscriberRepository;
    }


    @Override
        public boolean isValid(String value, ConstraintValidatorContext context) {
            return !this.subscriberRepository.existsBySubsEmail(value);
        }

}
