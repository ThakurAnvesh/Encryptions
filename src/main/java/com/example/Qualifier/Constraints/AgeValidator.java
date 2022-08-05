package com.example.Qualifier.Constraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Calendar;
import java.util.Date;

public class AgeValidator implements ConstraintValidator<AgeValid, Date> {

    @Override
    public boolean isValid(Date date, ConstraintValidatorContext constraintValidatorContext) {
        Calendar dateInCal = Calendar.getInstance();
        dateInCal.setTime(date);
        return Calendar.getInstance().get(Calendar.YEAR) - dateInCal.get(Calendar.YEAR) >= 18;
    }
}
