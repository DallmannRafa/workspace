package Arrays;

public class Array3 {

	public static void main(String[] args) {
		
		int[] num = {3,6,2,6,7};
		double media = 0;
		
		for (int i = 0; i < num.length; i++) {
			media += num[i];
		}
		media = media / num.length;
		System.out.println(media);
		
	}

}
