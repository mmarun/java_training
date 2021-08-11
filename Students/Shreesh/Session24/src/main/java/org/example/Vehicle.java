package org.example;

import lombok.*;
import com.interfaceExam.Running;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor

public class Vehicle implements Running {

    String name;
    Integer wheel;


    @Override
    public void startVehicle() {
        if(wheel==4)
        {
            System.out.println("Insert key in ignition switch ");
        }
        else if(wheel==3)
        {
            System.out.println("pull handleKick to start");
        }
        else {
            System.out.println("Kick start Vehicle");
        }
    }
    @Override
    public Integer stopBreak()
    {
        return 0;
    }


}
