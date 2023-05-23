package strings;

import java.util.ArrayList;

public class CodilityPractice {
	
	public static int solution(int[] arr) {
		
		ArrayList<Integer> al= new ArrayList<Integer>();
		for(int i = 0; i<arr.length; i++) {
			int n= arr[i];
			int count= 0;
			for(int j= 0; j<arr.length; j++) {
				if(n == arr[j]) {
					count++;
				}
			}
			if(count == n) {
				al.add(n);
			}
		}
		int max= al.get(0);
		for(int i= 1; i<al.size(); i++) {
			if(al.get(i) > max) {
				max= al.get(i);
				
			}
			return max;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		int[] arr= {5,5,5,5,5};
		System.out.println(solution(arr));
	}
}
