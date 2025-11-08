package I_Stacks.B_UsingArray;

public class Stack {
    private int maxSize;   // maximum size of stack
    private int[] stack;   // array to store elements
    private int top;       // index of top element

    public  Stack(int size){
        maxSize = size;
        stack = new int[maxSize];
        top = -1;
    }

    public void push(int data){
        if(isFull()){
            System.out.println("stack is overflow! can't push"+data);
        }
        else {
            stack[++top] = data;
            System.out.println(data+" pushed into stack");
        }
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Stack underflow! cannot pop");
        }else{
            System.out.println(stack[top--]+ " popped from stack");
        }
    }

    public void peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Top element: "+stack[top]);
        }
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == maxSize-1);
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Stack elemnts: ");
            for(int i=0; i<=top; i++){
                System.out.print(stack[i]+" ");
            }
            System.out.println( );
        }
    }
}
