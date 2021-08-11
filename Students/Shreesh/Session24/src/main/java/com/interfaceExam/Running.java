package com.interfaceExam;

public interface Running {

    //Static method
    static Integer accelerate(Integer speed)
    {
        return speed*10;
    }
    //default
    default Integer stopBreak()
    {
        return 0;
    }

    //abstract
    void startVehicle();
}

