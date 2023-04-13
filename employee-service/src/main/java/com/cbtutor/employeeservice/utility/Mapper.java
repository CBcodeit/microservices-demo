package com.cbtutor.employeeservice.utility;

import com.cbtutor.employeeservice.dto.EmployeeDto;
import com.cbtutor.employeeservice.dto.EmployeeIdDto;
import com.cbtutor.employeeservice.modal.Employee;

public class Mapper {

    public static Employee toEmployee(EmployeeDto employeeDto){
        return new Employee(employeeDto.getFirstName(), employeeDto.getLastName(), employeeDto.getMobile());
    }
    public static EmployeeIdDto toEmployeeIdDto(Employee employee){
        return new EmployeeIdDto(employee.getId());
    }
}
