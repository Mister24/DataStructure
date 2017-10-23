package binarySearch;

/**
 * 二分查找（折半查找）
 * 如果找到，则返回元素在数组中的位置，否则，返回-1
 * 
 * */
public class BianrySearch {

	public static void main(String[] args) {
		
		int[] array = {1, 21, 30, 32, 43, 51, 62};
		
		System.out.println(binarySearch(array, 43));
		
		System.out.println(binarySearch1(array, 0, array.length - 1, 43));
	}
	
	/**
	 * 二分查找（普通循环）
	 *
	 * @param array 待查找的数字
	 * @param goal  要查找的数值
	 * 
	 * @return      位置（若查找失败，返回-1）
	 * 
	 * */
	public static int binarySearch(int array[], int goal) {
		
		int low = 0;
		int high = array.length - 1;
		
		while  (low <= high) {
			
			int middle = (low + high)/2;
			
			if (array[middle] == goal) {
				
				return middle;
			} else if (array[middle] > goal) {
					
					high = middle - 1;
				} else {
				
				low = middle + 1;
			}
		}
		
		return -1;
	}
	
	/**
	 * 二分查找（递归法）
	 * 
	 * @param array 带查找的数组
	 * @param low   查找的起始位置
	 * @param high  查找的结束位置
	 * @param goal  要查找的数值
	 * 
	 * @return      位置（若查找失败，返回-1）
	 * 
	 * */
	public static int binarySearch1(int[] array, int low, int high, int goal) {
		
		int middle = (low + high)/2;
		
		while (low <= high) {
			
			if (goal == array[middle]) {
				
				return middle;
			} else if (goal < array[middle]) {
				
				return binarySearch1(array, low, middle - 1, goal);
			} else if (goal > array[middle]) {
				
				return binarySearch1(array, middle + 1, high, goal);
			}
			
		}
		return -1;
	}
}
