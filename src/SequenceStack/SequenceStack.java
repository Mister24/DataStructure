package SequenceStack;

public class SequenceStack  implements Stack{

	final int  MIN_SIZE = 10;
	private Object[] stackArray;
	private int top;
	
	public SequenceStack() {
		
		top = -1;
		stackArray = new Object[MIN_SIZE];
	}
	
	public SequenceStack(int size) {
		
		if (size < MIN_SIZE) {
			
			size = MIN_SIZE;
		}
		
		top = -1;
		stackArray = new Object[size];
	}
	
	/**
	 * 向栈顶插入一个元素
	 * 
	 * @param object 向栈顶插入的元素
	 * 
	 * */
	public void push(Object object) {

		if (top == stackArray.length - 1) {
			
			Object[] objects = new Object[top * 2];
			for (int i = 0; i <= top; i++) {
				objects[i] = stackArray[i];
			}
			stackArray = objects;
		}
		
		top++;
		stackArray[top] = object;
	}

	/**
	 * 删除栈顶元素并返回
	 * 
	 * @return 新的栈顶元素 
	 * 
	 * */
	public Object pop() {

		if (top == -1) {
			
			return null;
		}
		
		top--;
		
		return stackArray[top + 1];
	}

	/**
	 * 返回栈顶元素的值
	 * 
	 * */
	public Object peek() {

		if (top == -1) {
			
			return null;
		}
		
		return stackArray[top];
		
	}

	/**
	 * 判断栈是否为空
	 * 
	 * @return 是否为空
	 * 
	 * */
	public boolean isEmpty() {

		return (top == -1);
	}

	@Override
	public void clear() {

		top = -1;
	}

	
}
