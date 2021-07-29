package org.java;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

    /**
     * Compare employee salary and sorting according to high salary
     * @param o1
     * @param o2
     * @return
     */
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getEmpSalary().compareTo(o2.getEmpSalary()) *-1;
    }
}
