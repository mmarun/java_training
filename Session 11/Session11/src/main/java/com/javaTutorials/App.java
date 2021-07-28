package com.javaTutorials;

//String, All number wrapper classes,
public class App 
{
    public static void main( String[] args )
    {
        //Array is fixed in size and elements are indexed
        //Elements  can be accessed randomly
        //Array can be of any type but once you define an array all elements must be of same type..

        //Collections
        //Array /
        //Link List -> Head
        //Node {
        //    Object value
//            Node next;

        //Queue ->  First In First out...

        //Stack -> Last In First out.

        //Priority Queue -> Based on your priority you will be processed..

        //Set -> No duplicates are allowed, sorting is done based on comparator..

        //

        int[] array2 = new int[4];
        array2[0] = 1;
        array2 [1] = 2;
        String option = args[0];
        switch (option){
            case "Hello":
                System.out.println("Hello Arun");
                break;
            case "Hi":
                System.out.println("Hi Arun");
                break;
            default:
                System.out.println("Hello User");
                break;
        }
        //String it contains character array.


        //OR
        Double [] array = {2.0, 3.9, 4.8, 5.88};
        System.out.println(array.getClass().getName());
        System.out.println(array);
        for(int index =0; index <= array.length; index++){
            System.out.println(array[index]);
        }



        Object[] objArray = {"Arun", 12, 2.3 };
        for(Object obj : objArray ){
            System.out.println(obj);
        }
        //OR
        int [] array3;

        //Two dimensional array
        //Table or a matrix -
        //tabular format
        int[][] twoDimensional = new int [3] [4];

        // 1 2  3  4
        // 5 6  7  8
        // 9 10 11 12

        //Two dimensional other example
        int [] [] twoDimensionalOther = new int [3][];
        twoDimensionalOther[0] = new int[4];
        twoDimensionalOther[1] = new int[1];
        //Java has array of arrays
        // 1 2 3 4
        // 5
        // 6 7

    }
}
