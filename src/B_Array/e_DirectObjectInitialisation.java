package B_Array;
class Students {
    String name;
    int age;

    // Constructor
    Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Display method
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class e_DirectObjectInitialisation {
    public static void main(String[] args) {
        // Step 1: Declare an array of Student with size 3
        Students[] students = new Students[3];

        // Step 2: Assign each Student object to the array
        students[0] = new Students("Alice", 20);
        students[1] = new Students("Bob", 22);
        students[2] = new Students("Charlie", 21);

        // Step 3: Display student details
        System.out.println("--- Student Details ---");
        for (int i = 0; i < students.length; i++) {
            students[i].display();
        }
    }
}
