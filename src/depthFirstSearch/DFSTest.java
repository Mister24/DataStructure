package depthFirstSearch;

/**
 * 深度优先搜索（递归法）
 * 
 * */
public class DFSTest {

	//存储节点信息
	private char[] nodes;
	
	//存储边信息（如果节点连接，为1，否则为0）
	private int[][] edges;
	
	//节点个数
	private int nodesNum;
	
	//边是否被遍历过
	private boolean[] visited;
	
	/**
	 * 初始化
	 * 1. 节点个数
	 * 2. 节点连接信息
	 * 3. 节点是否被遍历过
	 * 
	 * */
	public DFSTest(int num) {
		
		nodesNum = num;
		nodes = new char[num];
		edges = new int[num][num];
		visited = new boolean[num];
		
		for (int i = 0; i < nodesNum; i++) {
			for (int j = 0; j < nodesNum; j++) {
				
				edges[i][j] = 0;
			}
		}
	}
	
	/**
	 * 添加边信息（节点连接则设置为1，否则为0）
	 * 
	 * @param num1 通过边连接的节点1
	 * @param num2 通过边连接的节点2
	 * 
	 * */
	public void addEdge(int num1, int num2) {
		
		if (num1 == num2) {
			
			return;
		} else {
			
			edges[num1][num2] = 1;
			edges[num2][num1] = 1;
		}
	}
	
	/**
	 * 设置节点集
	 * @param nodes 节点
	 * 
	 * */
	public void setNodes(char[] nodes) {
		
		this.nodes = nodes;
	}
	
	/**
	 * 设置节点访问标记
	 * @param visited 访问标记
	 * 
	 * */
	public void setVisited(boolean[] visited) {
		
		this.visited = visited;
	}
	
	/**
	 * 打印遍历节点
	 * @param num 节点
	 * 
	 * */
	public void visit(int i) {
		
		System.out.print(nodes[i] + " ");
	}
	
	/**
	 * 从第i个节点开始深度优先遍历
	 * 
	 * @param i 第i个节点
	 * 
	 * */
	private void travel(int i) {
		
		visited[i] = true;
		
		visit(i);
		
		for (int j = 0; j < nodesNum; j++) {
			
			if (1 == edges[i][j] && false == visited[j]) {
				
				travel(j);
			}
		}
	}
	
	//图的深度优先遍历（递归法）
	public void DFSTravel() {
		
		//初始化节点遍历标记
		for (int i = 0;  i < nodesNum; i++) {
			
			visited[i] = false;
		}
		
		//从没有遍历过的节点开始遍历
		for (int i = 0; i < nodesNum; i++) {
			
			if (visited[i] == false) {
				
				travel(i);
			}
		}
	}
	
	public static void main(String[] args) {
		
		DFSTest dfsTest = new DFSTest(8);
		
		char[] nodes = {'1', '2', '3', '4', '5', '6', '7', '8'};
		dfsTest.setNodes(nodes);
		
		dfsTest.addEdge(0, 1);
		dfsTest.addEdge(0, 2);
		dfsTest.addEdge(1, 0);
		dfsTest.addEdge(1, 3);
		dfsTest.addEdge(1, 4);
		dfsTest.addEdge(2, 0);
		dfsTest.addEdge(2, 5);
		dfsTest.addEdge(2, 6);
		dfsTest.addEdge(3, 1);
		dfsTest.addEdge(3, 7);
		dfsTest.addEdge(4, 1);
		dfsTest.addEdge(4, 7);
		dfsTest.addEdge(5, 2);
		dfsTest.addEdge(5, 6);
		dfsTest.addEdge(6, 2);
		dfsTest.addEdge(6, 5);
		dfsTest.addEdge(7, 3);
		dfsTest.addEdge(7, 4);
		
		dfsTest.DFSTravel();
	}
}
