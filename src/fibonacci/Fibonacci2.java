package fibonacci;

/**
 * 方法二：递归数组
 * 
 * */
public class Fibonacci2 {

	public static void main(String[] args) {
		
		int result[] = new int[20];
		
		result[0] = 1;
		result[1] = 1;
		
		for (int i = 2; i < 20; i ++) {
			
			result[i] = result[i - 1] + result[i - 2];
		}
		
		for (int i = 0; i < 20; i++) {
			
			System.out.println(result[i]);
		}
	}
}
