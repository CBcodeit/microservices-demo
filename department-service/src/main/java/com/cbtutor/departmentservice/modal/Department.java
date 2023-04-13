package com.cbtutor.departmentservice.modal;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
@Table(name="departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String departmentName;
    private String departmentDescription;
    private String departmentCode;

    public Department(String departmentName, String departmentDescription, String departmentCode) {
        this.departmentName = departmentName;
        this.departmentDescription = departmentDescription;
        this.departmentCode = departmentCode;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setDepartmentDescription(String departmentDescription) {
        this.departmentDescription = departmentDescription;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                ", departmentDescription='" + departmentDescription + '\'' +
                ", departmentCode='" + departmentCode + '\'' +
                '}';
    }
}
