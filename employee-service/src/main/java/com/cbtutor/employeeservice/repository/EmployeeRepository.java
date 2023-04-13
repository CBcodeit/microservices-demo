package com.cbtutor.employeeservice.repository;

import com.cbtutor.employeeservice.dto.EmployeeDto;
import com.cbtutor.employeeservice.modal.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    public Employee findByMobile(String mobile);
}
