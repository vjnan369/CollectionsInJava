package com;

import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        System.out.println("Hello World");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Size of Priority Queue: ");
        PriorityQueue pq = new PriorityQueue(s.nextInt());
        int userChoice;
        do {
            System.out.println("Priority Queue operations: ");
            System.out.println("Enter 1 to Insert Elements: ");
            System.out.println("Enter 2 to get Size of Elements: ");
            System.out.println("Enter 3 to Check is queue is empty: ");
            System.out.println("Enter 4 to Check is queue is full: ");
            System.out.println("Enter 5 to clear the queue: ");
            System.out.println("Enter 6 to show all elements: ");
            System.out.println("Enter 0 to Exit:");
            System.out.println("========================");
            System.out.print("Enter your Choice: ");
            userChoice = s.nextInt();
            s.nextLine();
            switch (userChoice) {
                case 1:
                    System.out.print("Enter Job Name: ");
                    String name = s.nextLine();
                    System.out.print("Enter Priority: ");
                    int priority = s.nextInt();
                    s.nextLine();
                    pq.add(name, priority);
                    break;
                case 2:
                    System.out.println("Size of queue is: "+pq.size());
                    break;
                case 3:
                    System.out.println("Is Queue is Empty: " + pq.isEmpty());
                    break;
                case 4:
                    System.out.println("Is Queue is Full: " + pq.isFull());
                    break;
                case 5:
                    System.out.println("To clear the queue: ");
                    pq.clear();
                    break;
                case 6:
                    System.out.println("List of priority elements are");
                    pq.show();
            }
        } while (userChoice != 0);
    }
}
