package I_Stacks.A_CollectionFrameWork;

import java.util.Stack;

public class e_DeleteStackElement {
    public static void main(String[] args) {
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
        while(gt.size()>0){
            int x = gt.pop();
            System.out.println(x +" ");
            st.push(x);
        }

        // creating the array
        int n = st.size();
        int[] arr = new int[n];
        for(int i=n-1; i>=0; i--){
            arr[i] = st.pop();
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
            st.push(arr[i]);
        }
    }
}
