package com.cbtutor.departmentservice.service;

import com.cbtutor.departmentservice.Utility.Mapper;
import com.cbtutor.departmentservice.dto.DepartmentDto;
import com.cbtutor.departmentservice.dto.DepartmentIdDto;
import com.cbtutor.departmentservice.modal.Department;
import com.cbtutor.departmentservice.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService implements DepartmentServiceI{
    @Autowired
    private DepartmentRepository departmentRepository;


    @Override
    public DepartmentIdDto save(DepartmentDto departmentDto) {
        Department department = Mapper.toDepartment(departmentDto);
        Department savedDepartment = departmentRepository.save(department);
        return Mapper.toDepartmentIdDto(savedDepartment);
    }

    @Override
    public DepartmentIdDto getDepartmentByCode(String departmentCode) {
        Department department = departmentRepository.findByDepartmentCode(departmentCode);
        return Mapper.toDepartmentIdDto(department);
    }
}
