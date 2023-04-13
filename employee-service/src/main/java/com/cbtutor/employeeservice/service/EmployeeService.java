package com.cbtutor.employeeservice.service;

import com.cbtutor.employeeservice.dto.EmployeeDto;
import com.cbtutor.employeeservice.dto.EmployeeIdDto;
import com.cbtutor.employeeservice.modal.Employee;
import com.cbtutor.employeeservice.repository.EmployeeRepository;

import com.cbtutor.employeeservice.utility.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements EmployeeServiceI{

    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeIdDto save(EmployeeDto employeeDto) {
        Employee employee = Mapper.toEmployee(employeeDto);
        Employee savedEmployee = (Employee) employeeRepository.save(employee);
        return Mapper.toEmployeeIdDto(savedEmployee);
    }

    @Override
    public EmployeeIdDto getEmployeeByMobile(String mobile) {
        Employee employee = employeeRepository.findByMobile(mobile);
        return Mapper.toEmployeeIdDto(employee);
    }
}
