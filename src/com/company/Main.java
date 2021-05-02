package com.company;

//Collections.sort
// comparable interface in public
// public class has not the override method when making a new class
// object to task
// compare one task to another
// priority or the name
//@override
//public compare int compare to

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<>();

        while (true){

            menu();
            int userChoice = input.nextInt();
            input.nextLine();

            switch (userChoice){
                case 1:
                    addTask(tasks);
                    break;
                case 2:
                    deleteTask(tasks);
                    break;
                case 3:
                    updateTask(tasks);
                    break;
                case 4:
                    listTask(tasks);
                    break;
                case 5:
                    listByPriority(tasks);
                    break;
                case 0:
                    endProgram();




            }
        }



    }

    static void endProgram(){
        System.exit(0);
    }

    public static void menu(){
        System.out.println("Please choose an option");
        System.out.println("(1) Add a task");
        System.out.println("(2) Remove a task");
        System.out.println("(3) Update a task");
        System.out.println("(4) List all tasks");
        System.out.println("(5) List all by priority");
        System.out.println("(0) Exit");
    }
    private static ArrayList<Task> deleteTask(ArrayList<Task> tasks) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number for what task you would like deleted.");
        listTask(tasks);
        int i = input.nextInt();
        tasks.remove(i);
        return tasks;
    }

    private static ArrayList<Task> updateTask(ArrayList<Task> tasks) {
        Scanner input = new Scanner(System.in);
        System.out.println("What task would you like to update?");
        int update = input.nextInt();
        input.nextLine();
        System.out.println("Please name a task");
        String name = input.nextLine();
        System.out.println("Please describe a task");
        String description = input.nextLine();
        System.out.println("Please give the task a priority from (0-5)");
        int priority = input.nextInt();
        input.nextLine();
        Task a = new Task(name, description, priority);
        tasks.set(update, a);
        return tasks;
    }
    //Collections.comparable goes here
    private static void listTask(ArrayList<Task> tasks) {
        for (int i = 0; i <tasks.size(); i++){
            System.out.println(i + ": " + tasks.get(i));
        }
    }

    private static ArrayList<Task> addTask(ArrayList<Task> tasks) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please name a task");
        String name = input.nextLine();
        System.out.println("Please describe a task");
        String description = input.nextLine();
        System.out.println("Please give the task a priority from (0-5)");
        int priority = input.nextInt();
        input.nextLine();
        Task a = new Task(name, description, priority);
        tasks.add(a);
        return tasks;
    }

    private static void listByPriority(ArrayList<Task> tasks) {
        Scanner input = new Scanner(System.in);
        System.out.println("What priority would you like to view?");
        int priority = input.nextInt();
        input.nextLine();


        //tasks.add(desc);

        for(int i = 0; i < tasks.size();i++){
            if(priority==tasks.get(i).getPriority()){
                System.out.println(tasks.get(i));
            }
        }

    }



}
