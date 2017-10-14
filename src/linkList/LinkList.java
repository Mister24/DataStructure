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
	 * @param data 待插入节点的数值
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
	 * @return 待删除的结点
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
	 * @param data 待插入节点的数值
	 * @return     待插入的节点
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
	 * @param index 待删除节点的位置
	 * @return     待删除的节点
	 * */
	public Node deleteByPos(int index) {
		
		Node current = first;
		Node previous = first;
		
		while (pos != index) {
			pos++;
			previous = current;
			current = current.next;
		}
		
		//如果指定的index是第一个节点，需要特殊处理
		//如果不是第一个节点，则用“指针”跳过这个节点，同时pos置0
		if (current == first) {
			first = first.next;
		} else {
			pos = 0;
			previous.next = current.next;
		}
		return current;
	}
	
	/**
	 * 根据节点的data删除节点（只删除第一个）
	 * 
	 * @param data 待删除节点的数值
	 * @return     待删除的节点
	 * 
	 * */
	public Node deleteByData(int data) {
		
		Node current = first;
		Node previous = first;
		
		while(current.data != data) {
			if (current.next == null) {
				return null;
			}
			previous = current;
			current = current.next;
		}
		//如果删除的是头节点，需要特殊处理
		if(current == first) {
			first = first.next;
		} else {
			//“指针”跳过当前节点即可
			previous.next = current.next;
		}
		return current;
	}
	
	/**
	 * 显示所有节点
	 * 
	 * */
	public void displayAllNodes() {
		
		Node current = first;
		
		while (current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println();
	}
	
	/**
	 * 根据位置查找节点
	 * 
	 * @param data 待删除节点的位置
	 * @return     待删除的节点
	 * 
	 * */
	public Node findByPos(int index) {
		
		Node current = first;
		if(index < 0) {
			return null;
		} else {
			while (pos != index) {
				current = current.next;
				pos++;
			}
		}
		return current;
	}
	
	
	/**
	 * 根据数据查找节点
	 * 
	 * @param data 待删除节点的数值
	 * @return     待删除的节点
	 * 
	 * */
	public Node findByData(int data) {
		
		Node current = first;
		
		while (current.data != data) {
			if (current.next == null) {
				return null;
			}
			else {
				current = current.next;
			}
		}
		
		return current;
	}
	
	/**
	 * 判断链表是否有环
	 * 
	 * @param node 节点
	 * @return     是否有环
	 * 
	 * */
	public boolean hasLoop(Node node) {
		
		Node node1 = first;
		Node node2 = first.next;
		
		//node2作为结束的标志，如果node2为null，表示链表结束
		while (node2 != null && node2.next != null) {
			
			//node1一次移动1个位置
			//node2一次移动2个位置
			node1 = node1.next;
			node2 = node2.next.next;
			
			if (node2 == null) {
				
				return false;
			}
			
			if (node1.data == node2.data) {
				
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * 翻转链表
	 * 
	 * */
	public Node reverseLinkList() {
		
		//对于空链表，单元素链表，不执行
		if (first == null || first.next == null) {
			
			return first;
		}
		
		Node previous = first;
		Node current = first.next;
		Node temp;
		
		//这里只能处理到最后一个节点之前的，因为尾节点不符合判断条件
		while (current != null && current.next != null) {
			
			temp = current.next;
			current.next = previous;
			
			previous = current;
			current = temp;
		}
		
		//对最后一个节点单独处理，只需要将next指针指向前一个节点即可
		current.next = previous;
		
		//将头节点设置为尾节点
		first.next = null;
		
		//将头节点返回
		return current;
	}
	
}
