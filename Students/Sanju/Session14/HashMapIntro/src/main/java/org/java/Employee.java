package org.java;


import java.util.Objects;

public class Employee {
    private Integer empId;
    private String empName;
    private String empDept;
    private Integer empSalary;

    public Employee(){
        super();
    }

    /**Parameterised Constructor
     * @param i
     * @param empName
     * @param empDept
     * @param i1
     */
    public Employee(int i, String empName, String empDept, int i1) {
        this.empId=i;
        this.empName=empName;
        this.empDept=empDept;
        this.empSalary=i1;
    }


    public Integer getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpDept() {
        return empDept;
    }

    public Integer getEmpSalary() {
        return empSalary;
    }


    @Override
    public String toString() {
        return  this.empName + "========= "+"Employee" +
                "empId=" + empId +

                ", empDept='" + empDept + '\'' +
                ", empSalary=" + empSalary +
                "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getEmpId().equals(employee.getEmpId()) && getEmpName().equals(employee.getEmpName()) && getEmpDept().equals(employee.getEmpDept()) && getEmpSalary().equals(employee.getEmpSalary());
    }

    @Override
    public int hashCode() {
        return 17* (this.getEmpId().hashCode()+this.getEmpName().hashCode()
                +this.getEmpDept().hashCode()+this.getEmpSalary().hashCode())+37;
    }
}
