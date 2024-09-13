package com.test.test05.controller;

import com.test.test05.model.EmployeeResponse;
import com.test.test05.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/unsecured")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public EmployeeResponse employees(@RequestParam(value = "page", defaultValue = "1") int pageNumber) {
        return employeeService.getEmployees(pageNumber);
    }
}
