package F_Queue.E_PracticeQuestions;
import java.util.*;
public class e_ImplementQueueByStack {
    Stack<Integer> str = new Stack<>();
    Stack<Integer> helper = new Stack<>();

    public void push(int x) {
        str.push(x);
    }

    public int pop() {
        while(str.size() >1){
            helper.push(str.pop());
        }
        int x =str.pop();
        while(helper.size()>0){
            str.push(helper.pop());
        }
        return x;
    }

    public int peek() {
        while(str.size() >1){
            helper.push(str.pop());
        }
        int x =str.peek();
        while(helper.size()>0){
            str.push(helper.pop());
        }
        return x;
    }

    public boolean empty() {
        if(str.size() ==0) return true;
        else return false;
    }
    public static void main(String[] args) {
        e_ImplementQueueByStack obj = new e_ImplementQueueByStack();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        System.out.println(obj.peek());
    }
}
