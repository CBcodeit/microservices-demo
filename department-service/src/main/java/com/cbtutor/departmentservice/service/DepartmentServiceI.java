package com.cbtutor.departmentservice.service;

import com.cbtutor.departmentservice.dto.DepartmentDto;
import com.cbtutor.departmentservice.dto.DepartmentIdDto;

public interface DepartmentServiceI {
    public DepartmentIdDto save(DepartmentDto departmentDto);
    public DepartmentIdDto getDepartmentByCode(String departmentCode);
}
