package E_Stacks;

import java.util.Stack;

public class a_BasicOfStacks {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();

        System.out.println(stack.size());
        System.out.println(stack.isEmpty());

        stack.push(11);
        stack.push(22);
        stack.push(33);
        stack.push(44);
        stack.push(55);

        System.out.println(stack.peek());
        System.out.println(stack);

        stack.pop();
        System.out.println(stack.pop());

        System.out.println(stack.size());
    }
}
