package com.example.Qualifier.dto;

import com.example.Qualifier.Constraints.AgeValid;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class UserDto {
    private String name;
    @AgeValid(message = "Age is less than 18")
    @NotNull(message = "Age should not be null")
    private Date createdDate;

    public UserDto(String name, Date createdDate) {
        this.name = name;
        this.createdDate = createdDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
