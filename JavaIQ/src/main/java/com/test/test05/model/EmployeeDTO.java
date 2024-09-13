package com.test.test05.model;

import lombok.Data;

import java.util.Date;

@Data
public class EmployeeDTO {

    private Date birthday;
    private String firstName;
    private String lastName;
    private String fullName;
    private Character gender;

}
