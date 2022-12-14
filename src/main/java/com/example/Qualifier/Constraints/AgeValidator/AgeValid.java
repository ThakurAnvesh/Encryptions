package com.example.Qualifier.Constraints.AgeValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Constraint(validatedBy = AgeValidator.class)
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AgeValid {
    String message() default "{com.example.Qualifier.constraints.AgeValidator.AgeValid.message}";

    Class<?> [] groups() default{};
    Class<? extends Payload> [] payload() default {};
}
