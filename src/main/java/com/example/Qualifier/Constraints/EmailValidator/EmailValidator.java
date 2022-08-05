package com.example.Qualifier.Constraints.EmailValidator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<EmailValid, String> {

    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        return email!=null &&  email.matches("^[a-zA-Z0-9+_.-]+@nineleaps.com");
    }
}
