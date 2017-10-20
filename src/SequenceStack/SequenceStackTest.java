package SequenceStack;

public class SequenceStackTest {

	public static void main(String[] args) {
		
		Stack stack = new SequenceStack();
		
		int[] arrays = {3, 8, 5, 17, 9, 30, 15, 22};
		
		//入栈
		for (int i = 0; i < arrays.length; i++) {
			
			stack.push(arrays[i]);
		}
		
		System.out.println(stack.pop() + ", " + stack.pop() + ", " + stack.pop());
		
		stack.push(68);
		
		System.out.println(stack.peek() + ", " + stack.pop() + ", " + stack.pop());
		
		while (!stack.isEmpty()) {
			
			System.out.print(stack.pop() + " ");
		}
		
		System.out.println();
		
		stack.clear();
	}
	java.util.Stack<Integer> stack = new java.util.Stack<>();
}
