package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.example.Interfaces.IEmployee;

@Setter
@Getter
@AllArgsConstructor
public class Employee implements IEmployee {

    String employName;
    Integer employeId;

    public Employee() {

    }

    @Override
    public String toString() {
        return "EmployName='" + employName + '\'' +
                ", EmployeId=" + employeId;
    }

    @Override
    public Employee getEmployeeId(Integer id) {
        return null;
    }

    @Override
    public void addEmployee(Employee employee) {

    }
}
