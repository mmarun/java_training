package org.example;


interface Printable{
    // Static method
    static void show() {
        System.out.println("Printing show...");
    }
    static void show1() {
        System.out.println("Printing show1...");
    }
    // Default Method
    default void show2() {
        System.out.println("Printing show2...");
    }
    // Abstract Method
    void getInfo();
}



public class DefaultStatic implements Printable {

    public void getInfo() {
        System.out.println("This is new style Java 8 Interface");
    }

    public static void main(String[] args){

        DefaultStatic demo = new DefaultStatic();
        // Calling static Methods
        Printable.show();
        Printable.show1();
        // Calling default method
        demo.show2();
        // Calling Abstract Methods
        demo.getInfo();

    }

}