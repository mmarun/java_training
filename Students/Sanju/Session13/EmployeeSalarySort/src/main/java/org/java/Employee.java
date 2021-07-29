package org.java;


import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Employee implements Comparable<Employee> {

    private Integer empId;
    private String empName;
    private String empDept;
    private Integer empSalary;


    @Override
    public int compareTo(Employee o) {
        return this.getEmpName().compareTo(o.getEmpName());
    }
}
