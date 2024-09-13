package com.test.test05.mapper;

import com.test.test05.entities.EmployeeEntity;
import com.test.test05.model.EmployeeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    @Mapping(source = "birthDate", target = "birthday")
    @Mapping(target = "fullName", expression = "java(employeeEntity.getFirstName() + ' ' + employeeEntity.getLastName())")
    EmployeeDTO employeeEntityToEmployeeDTO(EmployeeEntity employeeEntity);

    List<EmployeeDTO> employeeEntityListToEmployeeDTOList(List<EmployeeEntity> employeeEntityList);

}
