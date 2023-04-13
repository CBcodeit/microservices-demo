package com.cbtutor.departmentservice.controller;

import com.cbtutor.departmentservice.dto.DepartmentDto;
import com.cbtutor.departmentservice.dto.DepartmentIdDto;
import com.cbtutor.departmentservice.modal.Department;
import com.cbtutor.departmentservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    public ResponseEntity<DepartmentIdDto> createDepartment(@RequestBody DepartmentDto departmentDto){
        DepartmentIdDto departmentIdDto = departmentService.save(departmentDto);
        return new ResponseEntity<>(departmentIdDto, HttpStatus.CREATED);
    }
}
