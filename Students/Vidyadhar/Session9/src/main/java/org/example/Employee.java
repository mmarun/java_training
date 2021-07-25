package org.example;

public class Employee extends Object{

    private String Emp_fname = "Varun";
    private String Emp_lname = "HR";
    private Integer Emp_Id = 101;
    private String  Dept_Id = "CSE123";

    public Employee()
    {
        super();
    }

    public Employee(String Emp_fname,String Emp_lname,Integer Emp_Id,String Dept_Id)
    {
        this.Emp_fname = Emp_fname;
        this.Emp_lname = Emp_lname;
        this.Emp_Id = Emp_Id;
        this.Dept_Id = Dept_Id;
    }

    public String getEmp_fname()
    {
        return this.Emp_fname;
    }

    public String getEmp_lname()
    {
        return this.Emp_lname;
    }

    public Integer getEmp_Id()
    {
        return this.Emp_Id;
    }

    public String getDept_Id()
    {
        return this.Dept_Id;
    }

    public void setDept_Id(String Dept_Id)
    {
        this.Dept_Id=Dept_Id;
    }

    @Override
    public String toString()
    {
        return "EmpFirstName: "+this.getEmp_fname() +"EmpLastname: " + this.getEmp_lname()+
                "EmpId: "+ this.getEmp_Id() + "DeptId: "+this.getDept_Id();
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj)
            return true;

        if(obj instanceof Employee)
        {
            Employee otherEmp = (Employee) obj;

            if(this.getEmp_fname().equals(otherEmp.getEmp_fname()) == false)
                return false;

            if(this.getEmp_lname().equals(otherEmp.getEmp_lname()) == false)
                return false;

            if(this.getEmp_Id().equals(otherEmp.getEmp_Id()) == false)
                return false;

            if(this.getDept_Id().equals(otherEmp.getDept_Id()) == false)
                return false;

            return true;
        }
        return false;
    }
}
