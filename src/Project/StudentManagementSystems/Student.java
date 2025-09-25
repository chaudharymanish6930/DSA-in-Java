package Project.StudentManagementSystems;

import java.util.Scanner;

public class Student {
    private String id;   // private field changed to String
    String name;
    int age;
    String course;

    // Default constructor
    Student() {
        id = "";
        name = "";
        age = 0;
        course = "";
    }

    // Getter for id
    public String getId() {
        return id;
    }

    // Setter for id
    public void setId(String id) {
        this.id = id;
    }

    // Method to set details
    void setDetails(String id, String name, int age, String course) {
        setId(id); // using setter
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Method to display details
    void display() {
        System.out.println("ID: " + getId() + ", Name: " + name + ", Age: " + age + ", Course: " + course);
    }

    // Main method with menu-driven program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[100]; // Array to store students
        int count = 0;
        int choice;

        do {
            System.out.println("\n--- Student Record Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1: // Add Student
                    if (count >= students.length) {
                        System.out.println("No more space to add students!");
                    } else {
                        System.out.print("Enter ID: ");
                        String id = sc.nextLine();
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Age: ");
                        int age = sc.nextInt();
                        sc.nextLine(); // consume newline
                        System.out.print("Enter Course: ");
                        String course = sc.nextLine();

                        students[count] = new Student(); // default constructor
                        students[count].setDetails(id, name, age, course);
                        count++;
                        System.out.println("Student added successfully!");
                    }
                    break;

                case 2: // Display Students
                    if (count == 0) {
                        System.out.println("No records found.");
                    } else {
                        System.out.println("\n--- Student Records ---");
                        for (int i = 0; i < count; i++) {
                            students[i].display();
                        }
                    }
                    break;

                case 3: // Search Student
                    System.out.print("Enter Student ID to search: ");
                    String searchId = sc.nextLine();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (students[i].getId().equals(searchId)) {  // using getter and equals for String
                            students[i].display();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4: // Update Student
                    System.out.print("Enter Student ID to update: ");
                    String updateId = sc.nextLine();
                    boolean updated = false;
                    for (int i = 0; i < count; i++) {
                        if (students[i].getId().equals(updateId)) {  // using equals for String
                            System.out.print("Enter new Name: ");
                            String newName = sc.nextLine();
                            System.out.print("Enter new Age: ");
                            int newAge = sc.nextInt();
                            sc.nextLine(); // consume newline
                            System.out.print("Enter new Course: ");
                            String newCourse = sc.nextLine();

                            students[i].setDetails(updateId, newName, newAge, newCourse);
                            System.out.println("Student updated successfully!");
                            updated = true;
                            break;
                        }
                    }
                    if (!updated) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5: // Delete Student
                    System.out.print("Enter Student ID to delete: ");
                    String deleteId = sc.nextLine();
                    boolean deleted = false;
                    for (int i = 0; i < count; i++) {
                        if (students[i].getId().equals(deleteId)) {  // using equals for String
                            for (int j = i; j < count - 1; j++) {
                                students[j] = students[j + 1];
                            }
                            students[count - 1] = null;
                            count--;
                            System.out.println("Student deleted successfully!");
                            deleted = true;
                            break;
                        }
                    }
                    if (!deleted) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 6: // Exit
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 6);

        sc.close();
    }
}
