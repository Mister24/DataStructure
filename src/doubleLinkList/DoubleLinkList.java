package doubleLinkList;

public class DoubleLinkList<T> {

	private Node first;
	private Node last;
	private int length = 0;
	
	/**
	 * 节点类
	 * 
	 * */
	class Node{
	
		private Node previous;
		private Node next;
		private T data;
		
		public Node(Node previous, Node next, T data) {
			
			this.previous = previous;
			this.next = next;
			this.data = data;
		}
	}
	
	
	/**
	 * 向头节点添加元素
	 * @param data 待插入节点的泛型值
	 * 
	 * */
	public void addFirst(T data) {
		
		//如果原链表为空，创建新的链表
		if (first == null) {
			
			//指定该节点为链表的头节点
			Node node = new Node(null, null, data);
			this.first = node;
			this.last = node;
			length++;
		} else {
			
			/**
			 * 涉及到的指针变化：
			 * 	(1) node.previous
			 *  (2) node.next
			 *  (3) this.first.previous
			 * 
			 * */
			
			//创建一个新的节点，当前first节点的previous指向这个新节点
			Node node = new Node(null, first, data);
			//原链表的头节点的previous“指针”指向该节点
			this.first.previous = node;
			//将first的“指针”指向这个新的节点
			this.first = node;
			length++;
		}
	}
	
	/**
	 * 向尾节点添加元素
	 * @param data 待插入节点的范型值
	 * 
	 * */
	public void addLast(T data) {
		
		//如果原链表为空，创建新的链表
		if (last == null) {
			
			//指定该节点为链表的尾节点
			Node node = new Node(null, null, data);
			this.first = node;
			this.last = node;
			length++;
		} else {
			
			/**
			 * 涉及到的指针变化：
			 * 	(1) node.previous
			 * 	(2) node.next
			 *  (3) this.last.next
			 * 
			 * */
			//创建一个新的节点，当前last节点的next指向这个新节点
			Node node = new Node(last, null, data);
			//原链表的尾节点的next“指针”指向该节点
			this.last.next = node;
			//将last的“指针”指向这个新的节点
			this.last = node;
			length++;
		}
	}
	
	/**
	 * 在节点前边插入
	 * 
	 * @param baseElement 在该节点前插入
	 * @param value       待插入的节点
	 * 
	 * */
	public void insertPrevious(T baseElement, T value) {
		
		Node index = this.first;
		while (index != null) {
			
			if (index.data == baseElement) {
				break;
			}
			index = index.next;
		}
		
		/**
		 * 涉及到的指针变化：
		 * 	(1) index.previous.next
		 * 	(2) index.previous
		 * 	(3) insertValue.previous
		 * 	(4) insertValue.next
		 * 
		 * */
		Node insertValue = new Node(index.previous, index, value);
		index.previous.next = insertValue;
		index.previous = insertValue;
		length++;
	}
	
	/**
	 * 在节点后面插入
	 * 
	 * @param baseElement 在该节点后面插入
	 * @param value       待插入的节点
	 * 
	 * */
	public void insertNext(T baseElement, T value) {
		
		Node index = this.first;
		while (first != null) {
			
			if (index.data == baseElement) {
				break;
			}
			index = index.next;
		}
		
		/**
		 * 涉及到的指针变化：
		 * 	(1) index.next
		 * 	(2) index.next.previous
		 * 	(3) insertValue.previous
		 * 	(4) insertValue.next
		 * 
		 * */
		Node insertValue = new Node(index, index.next, value);
		index.next = insertValue;
		index.next.previous = insertValue;
		length++;
	}
	
	/**
	 * 删除某个节点
	 * 
	 * @param data 待删除的节点
	 * 
	 * */
	public void removeElement(T data) {
		
		Node index = this.first;
		while (first.data == data) {
			break;
		}
		index = index.next;
		
		/**
		 * 涉及到的指针变化：
		 * 	(1) index.previous.next
		 * 	(2) index.next.previous
		 * 
		 * */
		index.previous.next = index.next;
		index.next.previous = index.previous;
		length--;
	}
	
	/**
	 * 获取链表的长度
	 * 
	 * */
	public int getLength() {
		return length;
	}

	@Override
	public String toString() {
		
		StringBuffer stringBuffer = new StringBuffer();
		Node current = this.first;
		while (current != null) {
			
			if (current.next != null) {
				stringBuffer.append(current.data + "->");
			} else {
				stringBuffer.append(current.data);
			}
			
			current = current.next;
		}
		return stringBuffer.toString();
	}

}
