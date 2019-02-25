import java.util.Stack;

public class Queue1 {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public Queue1(){
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int element){
        stack1.push(element);
    }

    public int dequeue(){
        if(stack2.isEmpty()) move();
        return stack2.pop();
    }

    public int front(){
        if(stack2.isEmpty()) move();
        return stack2.peek();
    }

    private void move(){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
    }
}
