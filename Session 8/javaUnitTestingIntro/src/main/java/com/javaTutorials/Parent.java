package com.javaTutorials;

import com.javaTutorials.interfaces.IHelper;
import com.javaTutorials.interfaces.IParent2;

public abstract class  Parent implements IParent2, IHelper {
    @Override
    public void help() {
        System.out.println("Help called.");
        System.out.println("Help called.");
    }

    public abstract void printMessage(Integer value );

    public final void showObjectClass(){
        System.out.println("Showing message from " + this.getClass());
    }

    @Override
    public String parent2Message() {
        return "Implemented Parent 2 Message";
    }
}
