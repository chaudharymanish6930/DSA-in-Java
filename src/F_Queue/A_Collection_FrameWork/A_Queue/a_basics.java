package F_Queue.A_Collection_FrameWork.A_Queue;

import java.util.*;
import java.util.LinkedList;

public class a_basics {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        // rear-> 5 4 3 2 1 -> front
        Queue<Integer> helper = new ArrayDeque<>();
        while(q.size()>0){
            System.out.print(q.peek()+" ");
            helper.add(q.poll());
        }
        System.out.println(helper);
    }
}
