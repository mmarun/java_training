package com.hashMap;
import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString

public class Employee implements Comparable<Employee>
{
    private Integer empid;
    private String empName;
    private String empDept;
    private Double empSalary;
    private String empCity;

    @Override
    public int compareTo(Employee o) {
        return this.getEmpid()-o.getEmpid();
    }

//    @Override
//    public String toString() {
//        return "Employee{" +
//                "empid=" + empid +
//                ", empName='" + empName + '\'' +
//                ", empDept='" + empDept + '\'' +
//                ", empSalary=" + empSalary +
//                ", empCity='" + empCity + '\'' +
//                '}';
//   }
}
