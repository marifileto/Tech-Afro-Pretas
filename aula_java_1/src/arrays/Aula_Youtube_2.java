package arrays;

public class Aula_Youtube_2 {

	public static void main(String[] args) {

		int i;
		int[] x = new int[10];
		
		java.util.Arrays.fill(x, 2, 5, 3);
		
		for (i = 0; i < x.length; ++i) {
			System.out.println(x[i]);
		}
		
	
	}

}
