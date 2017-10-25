package greedyAlgorithm_change;

/**
 * 贪心算法（找零问题）
 * 
 * */
public class Main {

	public static void main(String[] args) {
		
		int[] kinds = {10, 5, 2, 1};
		
		int sum = 38;
		
		System.out.println("总额为： " + sum);
		
		int[] result = new int[kinds.length];
		
		result = count(kinds, sum);
		
		for (int i = 0; i < result.length; i++) {
			
			System.out.println(result[i] + "张" + kinds[i] + "元");
		}
		
		
	}
	
	/**
	 * 计算所需各个面值的数量
	 * 
	 * @param kinds 货币面值的数组（从大到小排列）
	 * @sum         要求找零的总量
	 * 
	 * @return      返回各个面值货币的数量
	 * 
	 * */
	public static int[] count(int[] kinds, int sum) {
		
		int[] result = new int[kinds.length];
		
		for (int i = 0; i < result.length; i++) {
			
			result[i] = sum / kinds[i];
			
			sum = sum % kinds[i];
		}
		
		return result;
	}
}
