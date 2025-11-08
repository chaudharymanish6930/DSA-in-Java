package I_Stacks.B_UsingArray;

import java.util.*;

public class b_usingArray {

    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of stack: ");
        int size = scanner.nextInt();

        Stack stack = new Stack(size);

        while(true){
            System.out.println("\n----Stack menu----");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice:");
            int choice = scanner.nextInt();

            switch(choice){
                case 1:
                    System.out.print("enter the data : ");
                    int data = scanner.nextInt();
                    stack.push(data);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.out.print("exiting....");
                    scanner.close();
                    return;
                default:
                    System.out.print("invalid choice");
            }
        }
    }
}
