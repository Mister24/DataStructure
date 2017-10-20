package SequenceStack;

public interface Stack {

	//向栈顶插入元素
	void push(Object object);
	
	//从栈顶删除元素
	Object pop();
	
	//返回栈顶元素的值
	Object peek();
	
	//判断栈是否为空，空则返回true，非空则返回false
	boolean isEmpty();
	
	//清除栈中的所有元素
	void clear();
}
