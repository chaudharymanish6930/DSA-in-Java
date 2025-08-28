package E_Stacks.A_CollectionFrameWork;

import java.util.Stack;
import java.util.*;

public class d_InsertAtAnyIndex {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println("Stack: "+st);

        int index = 2;
        int data = 7;

        Stack<Integer> gt = new Stack<>();
        while(st.size()>0){
            gt.push(st.pop());
        }
        st.push(data);
        while(gt.size()>0){
            st.push(gt.pop());
        }
        System.out.println(st);
    }
}
