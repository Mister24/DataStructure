package depthFirstSearch;

/**
 * 深度优先搜索（递归法）
 * 
 * */
public class DFSTest {

	//存储节点
	private char[] vertices;
	
	//存储边信息（邻接矩阵）
	private int[][] arcs;
	
	//图的节点数
	private int vexnum;
	
	//记录节点是否被遍历过
	private boolean[] visited;
	
	//初始化
	public DFSTest(int num) {
		
		vexnum = num;
		vertices = new char[num];
		arcs = new int[num][num];
		visited = new boolean[num];
		
		for (int i = 0; i < vexnum; i++) {
			for (int j = 0; j < vexnum; j++) {
				
				arcs[i][j] = 0;
			}
		}	
	}
	
	//添加边（无向图）
	public void addEdge(int i, int j) {
		
		if (i == j) {
			
			return;
		}
		
		arcs[i][j] = 1;
		arcs[j][i] = 1;
	}
	
	//设置节点集
	public void setVertices(char[] vertices) {
		
		this.vertices = vertices;
	}
	
	//设置节点访问标记
	public void setVisited(boolean[] visted) {
		
		this.visited = visted;
	}
	
	//打印遍历节点
	public void visit(int i) {
		
		System.out.print(vertices[i] + " ");
	}
	
	//从第i个节点开始深度优先遍历
	private void travel(int i) {
		
		//标记第i个节点已遍历
		visited[i] = true;
		
		//打印当前遍历的节点
		visit(i);
		
		//遍历邻接矩阵中第i个节点的直接连通关系
		for (int j = 0; j < vexnum; j++) {
			
			if (arcs[i][j] == 1 && visited[j] == false) {
				
				travel(j);
			}
		}
	}
	
	//图的深度优先遍历（递归法）
	public void DFSTravel() {
		
		//初始化节点遍历标记
		for (int i = 0; i < vexnum; i++) {
			
			visited[i] = false;
		}
		
		//从没有被遍历的节点开始遍历
		for (int i = 0; i < vexnum; i++) {
			
			if (visited[i] == false) {
				
				//如果是连通图，只会执行一次
				travel(i);
			}
		}
	}
	
	public static void main(String[] args) {
		
		DFSTest dfsTest = new DFSTest(9);
		char[] vertices = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
		dfsTest.setVertices(vertices);
		
		dfsTest.addEdge(0, 1);
		dfsTest.addEdge(0, 5);
		dfsTest.addEdge(1, 0);
		dfsTest.addEdge(1, 2);
		dfsTest.addEdge(1, 6);
		dfsTest.addEdge(1, 8);
		dfsTest.addEdge(2, 1);
		dfsTest.addEdge(2, 3);
        dfsTest.addEdge(2, 8);
        dfsTest.addEdge(3, 2);
        dfsTest.addEdge(3, 4);
        dfsTest.addEdge(3, 6);
        dfsTest.addEdge(3, 7);
        dfsTest.addEdge(3, 8);
        dfsTest.addEdge(4, 3);
        dfsTest.addEdge(4, 5);
        dfsTest.addEdge(4, 7);
        dfsTest.addEdge(5, 0);
        dfsTest.addEdge(5, 4);
        dfsTest.addEdge(5, 6);
        dfsTest.addEdge(6, 1);
        dfsTest.addEdge(6, 3);
        dfsTest.addEdge(6, 5);
        dfsTest.addEdge(6, 7);
        dfsTest.addEdge(7, 3);
        dfsTest.addEdge(7, 4);
        dfsTest.addEdge(7, 6);
        dfsTest.addEdge(8, 1);
        dfsTest.addEdge(8, 2);
        dfsTest.addEdge(8, 3);
        
        System.out.println("深度遍历的递归法的处理结果是：");
        dfsTest.DFSTravel();
        
	}
	
}
