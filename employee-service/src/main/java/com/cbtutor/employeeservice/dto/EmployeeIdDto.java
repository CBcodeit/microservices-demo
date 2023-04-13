package com.cbtutor.employeeservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeIdDto {
    private long id;

    @Override
    public String toString() {
        return "EmployeeIdDto{" +
                "id=" + id +
                '}';
    }
}
