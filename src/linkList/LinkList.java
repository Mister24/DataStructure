package linkList;

/**
 * 单链表
 * 
 * */
public class LinkList {

	public Node first;
	public int pos = 0;
	
	public LinkList() {
		this.first = null;
	}
	
	/**
	 * 插入一个头结点
	 * 
	 * @param data 插入的节点的数值
	 * 
	 * */
	public void addFirstNode(int data) {
		Node node = new Node(data);
		node.next = first;
		first = node;
	}
	
	/**
	 * 删除一个头结点
	 * 
	 * @return 删除的头结点
	 * 
	 * */
	public Node deleteFirstNode() {
		
		Node tempNode = first;
		first = first.next;
		return tempNode;
	}
	
	/**
	 * 在index的后面插入一个节点
	 * 
	 * @param index  要在index之后插入
	 * @param data   要插入的节点的数值
	 * 
	 * */
	public void add(int index, int data) {
		
		Node node = new Node(data);
		Node current = first;
		Node previous = first;
		//在相等之前，previous和pos在同一个位置
		while(pos != index) {
			previous = current;
			current = current.next;
			pos++;
		}
		
		/**
		 * 将node放在previous和current之间
		 * 由于pos和previous位置相同，判断条件成立的时候，也就是index的位置
		 * 所以previous的位置也就是index的位置，只需要插入即可
		 * 
		 * */
		node.next = current;
		previous.next = node;
		pos = 0;
	}
	
	/**
	 * 删除任意位置的节点
	 * 
	 * */
	public Node deleteByPos(int index) {
		
		Node current = first;
		Node previous = first;
		
		while (pos != index) {
			
		}
		
		return null;
	}
	
}
