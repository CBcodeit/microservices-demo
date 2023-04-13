package com.cbtutor.departmentservice.Utility;

import com.cbtutor.departmentservice.dto.DepartmentDto;
import com.cbtutor.departmentservice.dto.DepartmentIdDto;
import com.cbtutor.departmentservice.modal.Department;

public class Mapper {
    public static Department toDepartment(DepartmentDto departmentDto){
        return new Department(departmentDto.getDepartmentName(),
                departmentDto.getDepartmentDescription(),
                departmentDto.getDepartmentCode(),
                departmentDto.getDepartmentCapacity());
    }

    public static DepartmentIdDto toDepartmentIdDto(Department department){
        return new DepartmentIdDto(department.getId());
    }
}
