package com.javaTutorials;

public class AppMain {
    public static void main(String [] args) throws InterruptedException {
        Integer [] array = {1, 2, 3};
        Integer i = 0;
        try {
            System.out.println(array[5]);
            i = getNum(i);

        } catch(ArrayIndexOutOfBoundsException | NullPointerException ex){
            System.out.println("One " + ex.getMessage());

            ex.printStackTrace();

            System.out.println("Two - "+ ex);
            //Recovery logic
            i = 0;
        }
        System.out.println(i);
        System.out.println("Finished main program");
    }

    private static Integer getNum(Integer i) throws InterruptedException {
        Thread.currentThread().sleep(3000);

        i = null;
        System.out.println(i.toString());
        return i;
    }
}
