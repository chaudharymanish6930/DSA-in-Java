package Project.StudentManagementSystems;

import java.util.*;

public class Student {
    private String id;
    String name;
    int age;
    String course;

    Student(){
        id = "";
        name = "";
        age = 0;
        course = "";
    }
    public void setId(String Id){
        this.id = Id;
    }

    public String getId(){
        return id;
    }

    void setDetails(String id, String name, int age, String course) {
        setId(id);     //  setId(String.valueOf(id));
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void display() {
        System.out.println("ID: " + getId() + ", Name: " + name + ", Age: " + age + ", Course: " + course);
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Student[] students = new Student[100];
        int count =0;
        int choice;

        do{
            System.out.println("\n--- Student Record Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch(choice){
                case 1:
                    if(count >= students.length){
                        System.out.println("No more Students are added");
                    }
                    else{
                        System.out.print("Enter Id :");
                        String id = scanner.nextLine();
                        System.out.println();
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Age: ");
                        int age = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter Course: ");
                        String course = scanner.nextLine();

                        students[count] = new Student(); // default constructor
                        students[count].setDetails(id, name, age, course);
                        count++;
                        System.out.println("Student added successfully!");
                    }
                    break;
                case 2:
                    if (count == 0) {
                        System.out.println("No records found.");
                    } else {
                        System.out.println("\n--- Student Records ---");
                        for (int i = 0; i < count; i++) {
                            students[i].display();
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Student ID to search: ");
                    String searchId = scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (students[i].getId() == searchId) {  // using getter
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
                    String updateId = scanner.nextLine();
                    scanner.nextLine();
                    boolean updated = false;
                    for (int i = 0; i < count; i++) {
                        if (students[i].getId() == updateId) {  // using getter
                            System.out.print("Enter new Name: ");
                            String newName = scanner.nextLine();
                            System.out.print("Enter new Age: ");
                            int newAge = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter new Course: ");
                            String newCourse = scanner.nextLine();

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
                    String deleteId = scanner.nextLine();
                    boolean deleted = false;
                    for (int i = 0; i < count; i++) {
                        if (students[i].getId() == deleteId) {  // using getter
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
        scanner.close();
            }
        }
