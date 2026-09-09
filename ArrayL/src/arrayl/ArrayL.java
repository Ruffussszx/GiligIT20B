package arrayl;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayL {
    
    public static void main(String[] args) {
        java.util.ArrayList<String> students = new java.util.ArrayList<>();
        Scanner scanner = new Scanner(System.in);
       
        int choice;

        do {
            System.out.println("\nSTUDENT MANAGEMENT SYSTEM");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
           

            switch (choice) {
               
               
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    students.add(name);
                    System.out.println(name + " added.");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No students yet.");
                    } else {
                        System.out.println("Student List:");
                        for (int i = 0; i < students.size(); i++) {
                            System.out.println((i + 1) + ". " + students.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    String search = scanner.nextLine();
                    if (students.contains(search)) {
                        System.out.println(search + " found.");
                    } else {
                        System.out.println(search + " not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter name to remove: ");
                    String remove = scanner.nextLine();
                    if (students.remove(remove)) {
                        System.out.println(remove + " removed.");
                    } else {
                        System.out.println(remove + " not found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);
       
        System.out.println("\n  =================================");
        System.out.println("        FINAL STUDENT RECORDS");
        System.out.println("  =================================");
       
        if (students.isEmpty()){
            System.out.println("\t No students recorded");
        }else{
            for (int i = 0; i < students.size(); i++){
                System.out.println((i + 1 + ". " + students.get(i)));
            }
        }
       
        System.out.println("  ==================================");
       

        scanner.close();
    }

    }
    

