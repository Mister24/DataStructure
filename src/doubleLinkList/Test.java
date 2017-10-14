package doubleLinkList;

public class Test {

	public static void main(String[] args) {
		
		DoubleLinkList<String> doubleLinkList = new DoubleLinkList<>();
		
		doubleLinkList.addLast("1");
		doubleLinkList.addLast("2");
		doubleLinkList.addLast("3");
		doubleLinkList.addLast("4");
		System.out.println(doubleLinkList.toString());
		
		doubleLinkList.addFirst("0");
		System.out.println(doubleLinkList.toString());
		
		doubleLinkList.insertNext("3", "3.5");
		System.out.println(doubleLinkList.toString());
		
		doubleLinkList.insertPrevious("3", "2.5");
		System.out.println(doubleLinkList.toString());
		
		System.out.println("链表的长度是： "+ doubleLinkList.getLength());
	}
}
