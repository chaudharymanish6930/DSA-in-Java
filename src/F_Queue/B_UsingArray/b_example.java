package F_Queue.B_UsingArray;

public class b_example {
    int f =-1;
    int r =-1;
    int[]  arr = new int[100];
    int size=0;

    public void add(int data){
        if(f == -1){
            f=0;
            r=0;
            arr[0]=data;
        }
        else{
            arr[++r] = data;
        }
        size++;
    }

    public int remove(){
        if(size == 0){
            System.out.println("Queue is empty");
            return -1;
        }
        f++;
        size--;
        return arr[f-1];
    }

    public int peek(){
        if(size == 0){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[f];
    }

    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public void Display(){
        if(size==0){
            System.out.println("Queue is Empty");
        }
        else{
            for(int i=f; i<=r; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        b_example queue = new b_example();
        queue.Display();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.Display();
        queue.remove();
        queue.Display();
        queue.peek();
    }
}
