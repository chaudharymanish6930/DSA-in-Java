package F_Queue.D_Circular_Queue;

public class b_ArrayImplementationEx {
    public static class QueueArray{
        int front =-1;
        int rear = -1;
        int[] arr = new int[5];
        int size =0;

        public void add(int data){
            if(size==0){
                front = rear =0;
                arr[0]=data;
            }
            else if (size == arr.length) {
                System.out.println("queue is full not more added!!");
            }
            else if(rear < arr.length-1){
                arr[++rear] =data;
            }
            else if(rear == arr.length-1){
                rear =0;
                arr[0]=data;
            }
            size++;
        }

        public int remove(){
            if(size ==0){
                System.out.println("Queue is empty");
                size--;
                return -1;
            }
            else if(front == arr.length-1){
                int val = arr[front];
                front =0;
                size--;
                return val;
            }
            else{
                int val = arr[front];
                front++;
                size--;
                return val;
            }

        }

        public int  peek(){
            if(size==0) return -1;
            return arr[rear];
        }

        public void Display(){
            if(size==0){
                System.out.println("Queue is empty!!");
            }
            else if(front<=rear){
                for(int i=front; i<=rear; i++){
                    System.out.print(arr[i]+" ");
                }
            }
            else{ // rear < front
                for(int i=front; i<=arr.length; i++){
                    System.out.print(arr[i]+" ");
                }
                for(int i=0; i<=rear; i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        a_ImplementationInArray.QueueArray queue = new a_ImplementationInArray.QueueArray();
        queue.Display();
        queue.add(10);
        queue.Display();
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.Display();
        queue.add(60);
        queue.remove();
        queue.remove();
        queue.Display();
        queue.add(60);
//        queue.add(70);
        queue.Display();

    }
}
