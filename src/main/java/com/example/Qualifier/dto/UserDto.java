package com.example.Qualifier.dto;

import com.example.Qualifier.Constraints.AgeValidator.AgeValid;
import com.example.Qualifier.Constraints.EmailValidator.EmailValid;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
public class UserDto {
    @EmailValid
    private String email;

    @AgeValid(message = "Age is less than 18")
    @NotNull(message = "Age should not be null")
    private Date createdDate;
}
