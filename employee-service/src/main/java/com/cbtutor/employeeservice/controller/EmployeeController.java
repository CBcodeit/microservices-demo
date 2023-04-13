package com.cbtutor.employeeservice.controller;

import com.cbtutor.employeeservice.dto.EmployeeDto;
import com.cbtutor.employeeservice.dto.EmployeeIdDto;
import com.cbtutor.employeeservice.modal.Employee;
import com.cbtutor.employeeservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @PostMapping
    public ResponseEntity<EmployeeIdDto> createEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeIdDto employeeIdDto = employeeService.save(employeeDto);
        return new ResponseEntity<>(employeeIdDto, HttpStatus.CREATED);
    }

    @GetMapping("{mobile}")
    public ResponseEntity<EmployeeIdDto> getEmployeeByMobile(@PathVariable String mobile){
        EmployeeIdDto employeeIdDto = employeeService.getEmployeeByMobile(mobile);
        return new ResponseEntity<>(employeeIdDto,HttpStatus.OK);
    }
}
