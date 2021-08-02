package org.example;

public class Student extends Object {

    private Integer studentRollNum = 1;
    private String studentName = "Vidyadhar";
    private String studentLocation = "Bangalore";

    public Student()
    {
        super();
    }

    public Student(Integer studentRollNum,String studentName,String Location)
    {
        this.studentRollNum = studentRollNum;
        this.studentName = studentName;
        this.studentLocation = studentLocation;
    }

    public Integer getStudentRollNum()
    {
        return this.studentRollNum;
    }

    public String getStudentName()
    {
        return this.studentName;
    }

    public String getStudentLocation()
    {
        return this.studentLocation;
    }

    public void setLocation(String Location)
    {
        this.studentLocation=Location;
    }

    @Override
    public String toString()
    {
        return "Name: "+ this.studentName +"RollNum: "+ this.getStudentRollNum() +"Location: "+this.getStudentLocation();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj instanceof Student){
            Student otherStudent = (Student) obj;
            if (this.getStudentName().equals(otherStudent.getStudentName()) == false)
                return false;

            if (this.getStudentRollNum().equals(otherStudent.getStudentRollNum()) == false)
                return false;

            if (this.getStudentLocation().equals(otherStudent.getStudentLocation()) == false)
                return false;

            return true;
        }
        return false;
    }

}
