package linkList;

/**
 * 测试节点操作的方法
 * 
 * */
public class Test {
	public static void main(String[] args) {
		
		LinkList linkList = new LinkList();
		linkList.addFirstNode(20);
		linkList.addFirstNode(21);
		linkList.addFirstNode(19);
		
		linkList.add(2, 99);
		
		linkList.displayAllNodes();
		
		linkList.deleteByData(19);
		linkList.displayAllNodes();
		
		Node node1 = linkList.findByData(21);
		System.out.println("node1: " + node1.data);
		
		Node node2 = linkList.findByPos(0);
		System.out.println("node2 : " + node2.data);
		
	}
}
