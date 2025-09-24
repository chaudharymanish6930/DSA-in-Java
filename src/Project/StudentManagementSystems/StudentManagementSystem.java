package Project.StudentManagementSystems;

import java.util.*;

class Students {
    private String Id;
    String Name;
    int Age;
    String Course;

    Students(String Id, String Name, int Age, String Course){
        this.Id =Id;
        this.Name= Name;
        this.Age= Age;
        this.Course=Course;
    }
    void Display(){
        System.out.println("Id :"+Id+"Name :"+Name+"Age :"+Age+"Course :"+Course);
    }
}

public class StudentManagementSystem{
    private static Students[] students = new Students[100];
    private static int count = 0;
    private static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println();
    }
}
