package fibonacci;

/**
 * 方法三：递归方法
 * 
 * */
public class Fibonacci3 {

	public static void main(String[] args) {
	
		for (int i = 1; i <= 20; i++) {
			
			System.out.println(getFib(i));
		}
	}
	
	/**
	 * 返回Fibonacci数列的值
	 * 
	 * @param i 数列的第i个位置
	 * @return  返回的Fibonacci数列的值
	 * 
	 * */
	public static int getFib(int i) {
		
		if (i == 1 || i == 2) {
			
			return 1;
		} else {
			
			return getFib(i - 1) + getFib(i - 2);
		}
	}
}
