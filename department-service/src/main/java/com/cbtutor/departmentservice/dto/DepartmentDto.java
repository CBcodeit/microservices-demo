package com.cbtutor.departmentservice.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class DepartmentDto {
    private Long id;
    private String departmentName;
    private String departmentDescription;
    private String departmentCode;

    private int departmentCapacity;

    public DepartmentDto(String departmentName, String departmentDescription, String departmentCode, int departmentCapacity) {
        this.departmentName = departmentName;
        this.departmentDescription = departmentDescription;
        this.departmentCode = departmentCode;
        this.departmentCapacity = departmentCapacity;
    }

    @Override
    public String toString() {
        return "DepartmentDto{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                ", departmentDescription='" + departmentDescription + '\'' +
                ", departmentCode='" + departmentCode + '\'' +
                ", departmentCapacity='" + departmentCapacity + '\'' +
                '}';
    }
}
