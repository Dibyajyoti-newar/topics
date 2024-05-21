//.............some operation.........//
import java.util.*;
public class DSA_stack {
    public static void main(String[] args) {
        Stack<Integer>stack1=new Stack<>();
        //******push function-->>use to insert the element in stack//
        stack1.push(2);
        stack1.push(4);
        stack1.push(6);
        stack1.push(9);
        //******peek function--->>use to display the top most element of the stack//
        int t=stack1.peek();
        System.out.println(t); 
        //******pop function-->>use to delete the topmost element from the stack//
        stack1.pop();
        //******search function-->>use to search the element of the stack,here top element of the stack consider as index 1//
        //if searched element is not there then it will return -1//
        int s=stack1.search(2);
        System.out.println(s);
        //******empty function---->>use to check whether the stack is empty or not//
        //it return the boolean value(true/false)//
        boolean e=stack1.empty();
        System.out.println(e);
    }    
}
