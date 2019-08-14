package comm.example.stack;

import java.util.Stack;

public class TesterArrayStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stack<Integer> stack = new Stack<>();
        System.out.println("Empty stack : "  + stack);
        System.out.println("Empty stack : "  + stack.isEmpty());
        // Exception in thread "main" java.util.EmptyStackException
        // System.out.println("Empty stack : Pop Operation : "  + stack.pop());
        stack.push(1001);
        stack.push(1002);
        stack.push(1003);
        stack.push(1004);
        System.out.println("Non-Empty stack : "  + stack);
        System.out.println("Non-Empty stack: Pop Operation : "  + stack.pop());
        System.out.println("Non-Empty stack : After Pop Operation : "  + stack);

	}

}
