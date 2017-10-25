package greedyAlgorithm_change;

import java.util.Scanner;

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
	
	public static int[] count(int[] kinds, int sum) {
		
		int[] result = new int[kinds.length];
		
		for (int i = 0; i < result.length; i++) {
			
			result[i] = sum / kinds[i];
			
			sum = sum % kinds[i];
		}
		
		return result;
	}
}
