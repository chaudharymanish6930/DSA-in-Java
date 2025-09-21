package F_Queue.E_PracticeQuestions;

import java.util.*;

class MyStack {
    Queue<Integer> q=new LinkedList<>();

    public void push(int x) {
        if(q.size()==0) q.add(x);
        else{
            q.add(x);
            for(int i=1; i<=q.size()-1; i++){
                q.add(q.remove());
            }
        }
    }

    public int pop() {
        return q.remove();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        if(q.size()==0) return true;
        else{
            return false;
        }
    }
}

public class d_ImplementationStackUsingQueue {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Top element: " + stack.top()); // 30
        System.out.println("Popped element: " + stack.pop()); // 30
        System.out.println("Top after pop: " + stack.top()); // 20
        System.out.println("Is stack empty? " + stack.empty()); // false

        stack.pop(); // removes 20
        stack.pop(); // removes 10
        System.out.println("Is stack empty now? " + stack.empty()); // true

    }
}
