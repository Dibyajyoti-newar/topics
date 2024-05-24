// Implementation of Queue data structure using Stacks
// Time Complexity enQueue: O(1)
// Time Complexity deQueue: O(n)
// Space Complexity: O(n)
import java.util.*;
public class queueusingStack {
    static Stack<Integer> stake1=new Stack<>();
    static Stack<Integer>stack2=new Stack<>();
    //insertion in queue i.e--> enqueue//
    static void enQueue(int data){
        stake1.push(data);
    }
    //deletion of element from queue i.e--->dequeue//
    static int deQueue(){
        int ele;
        if(stake1.empty() && stack2.empty()){
            System.out.println("Queue is empty");
            System.exit(0);
        }
        if(stack2.empty()){
            while (!stake1.empty()) {
                ele=stake1.pop();
                stack2.push(ele);
            }
        }
        ele=stack2.pop();
        return ele;
    }
    public static void main(String[] args) {
        queueusingStack q=new queueusingStack();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        System.out.println(q.deQueue());
    }
}
