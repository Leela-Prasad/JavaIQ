package com.test.test05.controller;

import com.test.test05.entities.EmployeeEntity;
import com.test.test05.model.EmployeeResponse;
import com.test.test05.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/unsecured")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/paginate/employees")
    public EmployeeResponse employees(@RequestParam(value = "page", defaultValue = "1") int pageNumber) {
        return employeeService.getEmployeesWithPagination(pageNumber);
    }

    @GetMapping("/employees")
    public List<EmployeeEntity> employees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{prefix}")
    public List<EmployeeEntity> employeesWithPrefix(@PathVariable("prefix") String prefix) {
        return employeeService.getEmployeesWithStartPrefix(prefix);
    }

    @GetMapping("/employee/{empNo}")
    public Optional<EmployeeEntity> employee(@PathVariable("empNo") String empNo) {
        return employeeService.getEmployee(Integer.parseInt(empNo));
    }

    @GetMapping("/employees/gt/{date}")
    public List<EmployeeEntity> employeesGreaterThanDate(@PathVariable("date") Date date) {
        return employeeService.getEmployeesGreaterThanDate(date);
    }

}
