package org.example;

import java.util.Comparator;

public class ComparatorExample implements Comparator<Employee> {


    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getEmpId()-emp2.getEmpId() ;
    }

}
