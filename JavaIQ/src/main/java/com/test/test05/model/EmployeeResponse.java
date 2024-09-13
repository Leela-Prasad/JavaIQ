package com.test.test05.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class EmployeeResponse {
    private long count;
    private int pages;
    private String next;
    private List<EmployeeDTO> data;
}
