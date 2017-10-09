package linkList;

/**
 * 节点类
 * 
 * */
public class Node {
	
	public int data;
	public Node next;
	
	public Node(int data) {
		this.data = data;
	}
	
	public void displayNode() {
		System.out.println(data + " ");
	}
}
