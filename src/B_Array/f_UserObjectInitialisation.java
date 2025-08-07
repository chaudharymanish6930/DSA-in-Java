package B_Array;

import java.util.Scanner;

class Student {
    String name;
    int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Display method
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class f_UserObjectInitialisation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take size of the array
        System.out.print("Enter number of students: ");
        int size = sc.nextInt();
        sc.nextLine();

        // Create array of Student objects
        Student[] students = new Student[size];

        for (int i = 0; i < size; i++) {
            System.out.println("\nEnter details for student " + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine(); // Clear buffer
            students[i] = new Student(name, age); // Store object in array
        }

        // Display all students
        System.out.println("\n--- Student Details ---");
        // for each loop
        for (Student s : students) {
            s.display();
        }
        sc.close();
    }
}
