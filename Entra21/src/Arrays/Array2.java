package Arrays;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		
		int[] num = {3,6,2,6,7};
		
		Arrays.sort(num);
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

	}

}
