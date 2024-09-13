package com.test.test05.service;

import com.test.test05.entities.EmployeeEntity;
import com.test.test05.mapper.EmployeeMapper;
import com.test.test05.model.EmployeeResponse;
import com.test.test05.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private HttpServletRequest request;

    private final int PAGE_SIZE = 1000;

    public EmployeeResponse getEmployees(int pageNumber) {
        Page<EmployeeEntity> page = employeeRepository.findAll(PageRequest.of(pageNumber-1, PAGE_SIZE));

        return EmployeeResponse.builder()
                        .count(page.getTotalElements())
                        .pages(page.getTotalPages())
                        .next(getNextUrl(pageNumber))
                        .data(EmployeeMapper.INSTANCE.employeeEntityListToEmployeeDTOList(page.stream().collect(Collectors.toList())))
                        .build();

    }

    private String getNextUrl(int pageNumber) {
        return new StringBuilder(request.getScheme())
                                .append("://")
                                .append(request.getServerName())
                                .append(":")
                                .append(request.getServerPort())
                                .append(request.getContextPath())
                                .append(request.getServletPath())
                                .append("?page=" + (pageNumber +1))
                                .toString();
    }
}
