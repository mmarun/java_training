package org.javaTutorials;

public interface StudentInterface {
    void learn();

    default String getStudName(){
        return "Sanju Rose";
    }

    default Integer getStudId(){
        return 200;
    }
    static String getStudClass(){
        return "X";
    }
}
