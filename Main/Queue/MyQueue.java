package Main.Queue;

import java.util.Stack;

public class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    int[] queue;
    public MyQueue() {
        stack1=new Stack<>();
        stack2=new Stack<>();
    }
    
    public void push(int x) {
        stack1.push(x);
    }
    
    public int pop() {
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        if(stack2.isEmpty()){
            return -1;
        }
        int x=stack2.pop();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return x;
    }
    
    public int peek() {
        return stack1.firstElement();
    }
    
    public boolean empty() {
        return stack1.isEmpty();
    }
    public static void main(String[] args) {
        MyQueue queue=new MyQueue();
        queue.push(4);
        queue.push(3);
        queue.push(2);
        System.out.println(queue.pop());
        queue.pop();
        queue.pop();
        System.out.println(queue.pop());
    }
}
