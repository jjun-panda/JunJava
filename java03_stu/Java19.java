package java03_stu;
import java.util.Arrays;

public class Java19 {

	public static int[] concatArr(int[] a1, int[] a2) {
		int[] result = new int[a1.length + a2.length];
		for(int i = 0; i < result.length; i++) {
			// if(i < 3) {
			// 	result[i] = a1[i];
			// } else {
			// 	result[i] = a2[i-3];
			// }

			if(i < a1.length) {
				result[i] = a1[i];
			} else {
				result[i] = a2[i-a1.length];
			}
			
		}
		
		return result;
	}

	public static int[] sum(int[] a1, int[] a2) {
		int[] result = new int[a2.length];
		for(int i = 0; i < result.length; i++) {
			if(i < a1.length) {
				result[i] = a1[i]+a2[i];
			} else {
				result[i] = a2[i];
			}
			
		}
		
		return result;
	}
	public static void main(String[] args) {
		int[] a1 = {10,20,30};
		int[] a2 = {40,50,60,70};

		int[] a3 = concatArr(a1, a2);
		int[] a4 = sum(a1, a2);

		System.out.println(Arrays.toString(a3));
		System.out.println(Arrays.toString(a4));
	}
}
