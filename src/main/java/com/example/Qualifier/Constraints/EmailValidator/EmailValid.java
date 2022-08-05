package com.example.Qualifier.Constraints.EmailValidator;

import org.hibernate.validator.internal.constraintvalidators.bv.EmailValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Constraint(validatedBy = EmailValidator.class)
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EmailValid {

    String message() default "{com.example.Qualifier.Constraints.EmailValidator.EmailValid.message}";

    Class<?> [] groups() default {};
    Class<? extends Payload> [] payload() default {};
}
