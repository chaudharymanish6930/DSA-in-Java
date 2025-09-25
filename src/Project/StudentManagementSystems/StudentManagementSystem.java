package Project.StudentManagementSystems;

import java.util.*;

class Students {
    private String Id;
    String Name;
    int Age;
    String Course;

    // Default constructor
    Students() {
        Id = "";
        Name = "";
        Age = 0;
        Course = "";
    }

    public void setId(String id){
        this.Id=id;
    }

    protected String getId(){
        return Id;
    }

    protected void setDetail(String Id, String Name, int Age, String Course){
        setId(Id);
        this.Name= Name;
        this.Age= Age;
        this.Course=Course;
    }

    void Display(){
        System.out.println("Id :"+Id);
        System.out.println("Name :"+ Name);
        System.out.println("Age :"+Age);
        System.out.println("Course :"+Course);
    }
}

public class StudentManagementSystem{
    private static Students[] students = new Students[100];
    private static int count = 0;
    private static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {

        do{
            System.out.println("---welcome to the my Student Management---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice= scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    if(count >= students.length){
                        System.out.println("Not Added");
                    }
                    else {
                        System.out.print("Enter id :");
                        String id = scanner.nextLine();
                        System.out.println("Enter Name :");
                        String name = scanner.nextLine();
                        System.out.println("Enter age :");
                        int age = scanner.nextInt();
                        System.out.println("Enter Course :");
                        String course = scanner.nextLine();

                        students[count] = new Students();
                        students[count].setDetail(id,name,age,course);
                        count++;
                        System.out.println("Successfully Completed");
                    }
                    break;

                case 2:
                    if(count ==0){
                        System.out.println("Empty Array!!");
                    }
                    else {
                        System.out.println("Students Records...");
                        for (int i = 0; i < count; i++) {
                            students[count].Display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Search Student ID :");
                    String searchId = scanner.nextLine();
                    boolean found = false;
                    for(int i =0; i<count; i++) {
                        if (students[i].getId().equalsIgnoreCase(searchId)) {
                            System.out.println("---Student found---");
                            students[i].Display();
                            found = true;
                            break;
                        }
                    }
                    if(found){
                        System.out.println("Student is not found");
                    }
                    break;
                case 4:
                    System.out.println("Update Students....");
                    System.out.println("Enter Id to Update :");
                    String updateId= scanner.nextLine();
                    for(int i=0; i<count; i++){
                        if(students[i].getId().equalsIgnoreCase(updateId)){
                            System.out.println("enter New detailed :");
                            System.out.println("Enter new Name :");
                            String name = scanner.nextLine();
                            System.out.println("Enter new age :");
                            int age = scanner.nextInt();
                            System.out.println("Enter new Course :");
                            String course = scanner.nextLine();

                            students[i].setDetail(updateId, name, age, course);
                            System.out.println("Successfully Update!!");
                            break;
                        }
                    }
                    System.out.println("Not Found");
                case 5:
                    System.out.println("Enter deleted Student id :");
                    String delId = scanner.nextLine();
                    boolean deleted = false;
                    for(int i=0; i<count; i++){
                        if(students[i].getId().equalsIgnoreCase(delId)){
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
            }

        }
        while();

    }
}
