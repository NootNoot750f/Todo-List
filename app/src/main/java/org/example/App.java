package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskList taskList = new TaskList();
        
        while (true) {
            System.out.println("\n===== TODO LIST MENU =====");
            System.out.println("1. Add Task");
            System.out.println("2. Mark Task as Complete");
            System.out.println("3. View All Tasks");
            System.out.println("4. View Completed Tasks");
            System.out.println("5. View Incomplete Tasks");
            System.out.println("6. Clear All Tasks");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String taskDescription = scanner.nextLine().trim();
                    if (!taskDescription.isEmpty()) {
                        taskList.addTask(taskDescription);
                    } else {
                        System.out.println("Task description cannot be empty!");
                    }
                    break;

                case 2:
                    System.out.print("Enter task to mark as complete: ");
                    String completeTask = scanner.nextLine().trim();
                    taskList.completeTask(completeTask);
                    break;

                case 3:
                    taskList.printAll();
                    break;

                case 4:
                    taskList.printCompleted();
                    break;

                case 5:
                    taskList.printIncomplete();
                    break;

                case 6:
                    taskList.clearAll();
                    break;

                    
                case 7:System.out.println("Exiting... Go Wash your pet cow!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 7.");
            }
        }
    }
}
