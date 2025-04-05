package com.test.test05.repository;

import com.test.test05.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {
    
    public List<EmployeeEntity> findByOrderByFirstNameAsc();

    public List<EmployeeEntity> findByFirstNameStartingWithIgnoreCase(String prefix);

    public Optional<EmployeeEntity> findByEmpNo(int empNo);

    public List<EmployeeEntity> findByHireDateGreaterThan(Date date);
}
