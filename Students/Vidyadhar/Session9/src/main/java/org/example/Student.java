package org.example;

public class Student extends Object {

    private Integer RollNum = 1;
    private String S_name = "Vidyadhar";
    private String Location = "Bangalore";

    public Student()
    {
        super();
    }

    public Student(Integer RollNum,String S_name,String Location)
    {
        this.RollNum = RollNum;
        this.S_name = S_name;
        this.Location = Location;
    }

    public Integer getRollNum()
    {
        return this.RollNum;
    }

    public String getS_name()
    {
        return this.S_name;
    }

    public String getLocation()
    {
        return this.Location;
    }

    public void setLocation(String Location)
    {
        this.Location=Location;
    }

    @Override
    public String toString()
    {
        return "Name: "+ this.getS_name() +"RollNum: "+ this.getRollNum() +"Location: "+this.getLocation();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj instanceof Student){
            Student otherStudent = (Student) obj;
            if (this.getS_name().equals(otherStudent.getS_name()) == false)
                return false;

            if (this.getRollNum().equals(otherStudent.getRollNum()) == false)
                return false;

            if (this.getLocation().equals(otherStudent.getLocation()) == false)
                return false;

            return true;
        }
        return false;
    }

}
