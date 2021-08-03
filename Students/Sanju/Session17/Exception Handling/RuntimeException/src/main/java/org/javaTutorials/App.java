package org.javaTutorials;

/**
 * Hello world!
 *
 */
public class App {
    static int size = 5;

    public static void main(String[] args) {

        int[] arr_elements = {4, 6, 3, 7, 1};

        // ArrayIndexOutOfBoundsException
        try {
            for (int i = 0; i <= size; i++) {
                System.out.println(arr_elements[i]);
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Size should not exceed 5");
        }

        System.out.println("------ArrayIndexOutOfBound Exception Done-------");


        //StringIndexOutOfBound Exception
        String str="Sanju";
        try{
            char ch=str.charAt(10);
        }catch (StringIndexOutOfBoundsException ex){
            System.out.println("String Index is Out of Bound");
        }
        System.out.println("--------StringOutOfBoundException Done---------");

        //Demonstration of NullPointerException
        Queue<String> queue=new Queue<>(5);

        queue.add_Queue("Sanju");
        queue.add_Queue("Rose");
        queue.add_Queue("Varun");

        System.out.println("Queue elements are ");
        queue.printQueue(queue);

        queue.remove_Queue();
        queue.remove_Queue();
        queue.remove_Queue();

        System.out.println("Queue elements are ");
        queue.printQueue(queue);

        System.out.println("---------NullpointerException Done---------");

        //ArithmeticException
        int remainder=0;
        for(int a=3;a>=0;a--){
           try{
               remainder=12%a;
               System.out.println("12 /" + a+ " = "+ remainder);
              // System.out.println("Dividing by 0 is not possible");
            }catch(ArithmeticException ex){
               System.out.println("Dividing by 0 is not possible");
           }

        }
        System.out.println("--------ArithmeticException Done---------");

        //Classcast Exception

       Object grade=new Integer(98);
       try{
           System.out.println((String) grade);
       }catch(ClassCastException ex){
         System.out.println("Cannot  do typecasting");
       }
        System.out.println("--------ClassCastException Done---------");

        //Error Thrown for Array Index out of Bound
        System.out.println("Array Elements are");
        for (int i = 0; i <= size; i++) {
            System.out.println(arr_elements[i]);
        }
        System.out.println("Throwing Error----");
    }
}
