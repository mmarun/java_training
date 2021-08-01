package org.example;

import java.util.Comparator;

public class ComparatorOnSalary implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp2.getEmpSalary() - emp1.getEmpSalary();
    }
}
