package com.javaTutorials;

public class Student extends Object {

    private Integer rollNumber;
    private String name;
    private String currentLocation;
    private String standard;

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    /**
     *
     * @param rollNumber
     * @param name
     * @param currentLocation
     * @param standard
     */
    public Student(Integer rollNumber, String name, String currentLocation, String standard){

        this.name = name;
        this.rollNumber = rollNumber;
        this.currentLocation = currentLocation;
        this.standard = standard;
    }

    public Integer getRollNumber() {
        return this.rollNumber;
    }

    public String getName() {
        return this.name;
    }

    public String getCurrentLocation() {
        return this.currentLocation;
    }

    public void setCurrentLocation(String currentLocation){
        this.currentLocation = currentLocation;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + " Roll number: " + this.getRollNumber() + " Current Location: " + this.getCurrentLocation();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj instanceof Student){
            Student otherStudent = (Student) obj;
            if (    this.getName().equals(otherStudent.getName())
                  &&  this.getRollNumber().equals(otherStudent.getRollNumber())
                  && this.getCurrentLocation().equals(otherStudent.getCurrentLocation())
                  && this.getStandard().equals(otherStudent.getStandard())
            ) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode(){
        return 17 * (this.name.hashCode() + this.rollNumber.hashCode() + this.currentLocation.hashCode() + this.getStandard().hashCode()) + 37;
        //obj a (name - 1, rollnumber - 2, currentlocation - 7) = 10
        //obj b (name - 2, rollnumber 1, currentlocation - 7) = 10
    }
}
