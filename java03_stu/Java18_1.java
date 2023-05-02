package java03_stu;
import java.util.Arrays;

public class Java18_1 {
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5};

		System.out.println(Arrays.toString(arr));

		int[] arr2 = arr;
		arr2[0] *= 100;
		arr2[1] *= 100;
		arr2[2] *= 100;
		arr2[3] *= 100;
		arr2[4] *= 100;

		System.out.println(Arrays.toString(arr));
	}
}
