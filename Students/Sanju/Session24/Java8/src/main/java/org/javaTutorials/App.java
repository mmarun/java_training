package org.javaTutorials;



/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) {

        StudentInterface studInfo=new Student();

        studInfo.learn();

        //default methods
        System.out.println(studInfo.getStudName());
        System.out.println(studInfo.getStudId());

        //static method-- so call with Interface name
        System.out.println(StudentInterface.getStudClass());

        // Anonymous class
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                int result=0;
                for(int i=0;i<=5;i++){
                   synchronized (this){
                    try{
                        Thread.sleep(1000);
                        result=result+i;
                    }catch (InterruptedException ex){
                        ex.printStackTrace();
                    }
                }}
                System.out.println("Sum of numbers from 1 to 5 -----" +result);
            }
        };

        // Introducing lambda
        Runnable runnable1=() -> {
              System.out.println("Student name is sanju");

        };

        Thread thread1= new Thread(runnable);
        //thread1.setPriority(8);
        Thread thread2= new Thread(runnable1);
       // thread2.setPriority(1);


        thread1.start();
        thread2.start();

    }
}
