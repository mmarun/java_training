package org.example;

public class Employee extends Object{

    private String EmployeeFirstName;
    private String EmployeeLastName;
    private Integer EmployeeId;
    private String EmployeeDeptId;

    public Employee()
    {
        super();
    }

    public Employee(String EmployeeFirstName, String EmployeeLastName, Integer EmployeeId, String EmployeeDeptId)
    {
        this.EmployeeFirstName = EmployeeFirstName;
        this.EmployeeLastName = EmployeeLastName;
        this.EmployeeId = EmployeeId;
        this.EmployeeDeptId = EmployeeDeptId;
    }

    public String getEmployeeFirstName()
    {
        return this.EmployeeFirstName;
    }

    public String getEmployeeLastName()
    {
        return this.EmployeeLastName;
    }

    public Integer getEmployeeId()
    {
        return this.EmployeeId;
    }

    public String getEmployeeDeptId()
    {
        return this.EmployeeDeptId;
    }

    public void setEmployeeDeptId(String Dept_Id)
    {
        this.EmployeeDeptId =Dept_Id;
    }

    @Override
    public String toString()
    {
        return "EmpFirstName:"+this.getEmployeeFirstName() +" EmpLastname:" + this.getEmployeeLastName()+
                " EmpId:"+ this.getEmployeeId() + " DeptId:"+this.getEmployeeDeptId();
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj)
            return true;

        if(obj instanceof Employee)
        {
            Employee otherEmp = (Employee) obj;

            if(this.getEmployeeFirstName().equals(otherEmp.getEmployeeFirstName()) == false)
                return false;

            if(this.getEmployeeLastName().equals(otherEmp.getEmployeeLastName()) == false)
                return false;

            if(this.getEmployeeId().equals(otherEmp.getEmployeeId()) == false)
                return false;

            if(this.getEmployeeDeptId().equals(otherEmp.getEmployeeDeptId()) == false)
                return false;

            return true;
        }
        return false;
    }
}
