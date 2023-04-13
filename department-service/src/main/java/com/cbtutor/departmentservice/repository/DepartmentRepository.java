package com.cbtutor.departmentservice.repository;

import com.cbtutor.departmentservice.modal.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
    public Department findByDepartmentCode(String departmentCode);
}
