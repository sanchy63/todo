package Main.Stack;
import java.util.Stack;

public class Stack_First_ele {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(5);
        st.push(8);
        st.push(0);
        System.out.println(st.firstElement());
    }
}
