package Tree;

import java.util.LinkedList;
import java.util.List;

public class Tree {
	
	private static class Node{
		Node leftChild;
		Node rightChild;
		int data;
		
		//定义Node的数据结构
		Node(int data){
			leftChild = null;
			rightChild = null;
			this.data = data;
		}
	}
	private int[] array = {1,2,3,4,5,6,7,8,9};
	private static List<Node> nodeList = null;
	
	/** 
	 * 构造二叉树
	 * 
	 * */
	public void createTree() {
		nodeList = new LinkedList<Node>();
		
		for(int nodeIndex = 0; nodeIndex < array.length; nodeIndex++) {
			nodeList.add(new Node(array[nodeIndex]));
		}
		
		//对前lastParentIndex-1个父节点按照父节点与孩子节点的数字关系建立二叉树
		for(int parentIndex = 0; parentIndex < array.length/2 - 1; parentIndex++) {
			nodeList.get(parentIndex).leftChild = nodeList.get(parentIndex*2 + 1);
			nodeList.get(parentIndex).rightChild = nodeList.get(parentIndex*2 + 2);
		}
		
		//最后一个父节点
		//最后一个父节点没有右孩子，所以单独处理
		int lastParentIndex = array.length/2 - 1;
		//对左孩子进行单独操作
		nodeList.get(lastParentIndex).leftChild = nodeList.get(lastParentIndex*2 + 1);
		//右孩子进行操作
		if(array.length%2 == 1) {
			nodeList.get(lastParentIndex).rightChild = nodeList.get(lastParentIndex*2 + 1);
		}
	}
	
	/**
	 * 先序遍历
	 * 
	 * */
	public void preOrderTra(Node node) {
		if(node == null) {
			return;
		}
		System.out.print(node.data + " ");
		preOrderTra(node.leftChild);
		preOrderTra(node.rightChild);
	}
	
	/**
	 * 中序遍历
	 * 
	 * */
	public void inOrdeTra(Node node) {
		if(node == null) {
			return;
		}
		inOrdeTra(node.leftChild);
		System.out.print(node.data + " ");
		inOrdeTra(node.rightChild);
	}
	
	/**
	 * 后序遍历
	 * 
	 * */
	public void postOrderTra(Node node) {
		if(node == null) {
			return ;
		}
		postOrderTra(node.leftChild);
		postOrderTra(node.rightChild);
		System.out.print(node.data + " ");
	}
	
	/**
	 * 深度优先遍历
	 * 采用非递归方式
	 * 使用的数据结构：栈
	 * 
	 * */
	public void depthOrderTra(Node root) {
		System.out.println("\n深度优先遍历");
		if(root == null) {
			System.out.println("empty tree.");
			return;
		}
	}
}
