package com.cbtutor.employeeservice.service;

import com.cbtutor.employeeservice.dto.EmployeeDto;
import com.cbtutor.employeeservice.dto.EmployeeIdDto;
import com.cbtutor.employeeservice.modal.Employee;

public interface EmployeeServiceI {
    public EmployeeIdDto save(EmployeeDto employeeDto);
    public EmployeeIdDto getEmployeeByMobile(String mobile);
}
