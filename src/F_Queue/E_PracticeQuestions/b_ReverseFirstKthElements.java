package F_Queue.E_PracticeQuestions;

import java.util.*;

public class b_ReverseFirstKthElements {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        Queue<Integer> que = new LinkedList<>();
        System.out.print("no of elements: ");
        int num = sc.nextInt();
        System.out.print("Enters the Numbers "+num+" :");
        for(int i=0; i<num; i++){
            que.add(sc.nextInt());
        }
        System.out.println(que);

        System.out.print("Enter the number do you want to reverse:");
        int remove = sc.nextInt();
        Stack<Integer> stc = new Stack<>();
        for(int i=0; i<remove; i++){
            stc.push(que.remove());
        }
        for(int i=0; i<remove; i++){
            que.add(stc.pop());
        }
        for(int i=remove; i<num; i++){
            que.add(que.remove());
        }
        System.out.println(que);
    }
}
