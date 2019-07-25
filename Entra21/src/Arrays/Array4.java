package Arrays;

public class Array4 {

	public static void main(String[] args) {
		
		int[] Num = {3,6,2,6,7,2,9};
		int MaiorNumero = 0;
		
		
		for (int i = 0; i < Num.length; i++) {
			
			if (MaiorNumero < Num[i]) {
				MaiorNumero = Num[i];
			}
			
			System.out.println(MaiorNumero);
		}

	}

}
