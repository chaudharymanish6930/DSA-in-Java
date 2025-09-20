package F_Queue.E_PracticeQuestions;

import java.util.*;

public class c_ImplementStackUsingQueues {
    Queue<Integer> q= new LinkedList<>();
    public void push(int x) {
        q.add(x);
    }

    public int pop() {
        for(int i=1; i<=q.size()-1; i++){
            q.add(q.remove());
        }
        int val = q.peek();
        q.remove();
        return val;
    }

    //  1,2,3,4
    public int top() {  // peek
        for(int i=1; i<=q.size()-1; i++){
            q.add(q.remove());
        }
        int val = q.peek();
        q.add(q.remove());
        return val;
    }

    public boolean empty() {
        if(q.size()==0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        c_ImplementStackUsingQueues stack = new c_ImplementStackUsingQueues();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.top()); // 30
        System.out.println("Popped element: " + stack.pop()); // 30
        System.out.println("Top after pop: " + stack.top()); // 20
        System.out.println("Is stack empty? " + stack.empty()); // false

        stack.pop(); // removes 20
        stack.pop(); // removes 10
        System.out.println("Is stack empty now? " + stack.empty()); // true
    }
}
