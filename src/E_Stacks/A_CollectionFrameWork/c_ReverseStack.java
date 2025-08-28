package E_Stacks.A_CollectionFrameWork;

import java.util.*;

public class c_ReverseStack {
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println("Stack: "+st);

        Stack<Integer> gt = new Stack<>();
        while(st.size()>0){
            gt.push(st.pop());
        }
        System.out.println("New Stack(reverse): "+gt);
        System.out.println("Old Stack: "+st);

        Stack <Integer> rt = new Stack<>();
        while(gt.size()>0){
            rt.push(gt.pop());
        }
        System.out.println(rt);
    }
}
