package com.test.test05.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "employees")
@Data
public class EmployeeEntity {
    @Id
    private int empNo;
    private Date birthDate;
    private String firstName;
    private String lastName;
    private Character gender;
    private Date hireDate;
}
