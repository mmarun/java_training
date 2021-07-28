package org.example;

import java.util.*;

public class App {

    public static void main(String[] args)
    {
        Queue<String> pq = new PriorityQueue<>();

        pq.add("Arjun");
        pq.add("Mali");
        pq.add("Arya");
        pq.add("Moon");
        System.out.println("Initial Queue " + pq);


        pq.remove("Mali");
        pq.remove("Arya");
        pq.remove("Moon");
        System.out.println("After Remove " + pq);

        System.out.println("Poll Method " + pq.poll());

    }
}