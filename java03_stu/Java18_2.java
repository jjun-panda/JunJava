package java03_stu;
import java.util.Arrays;

public class Java18_2 {

	public static void reverse(int[] arr2) {
		// 리버스 기능 구현
		for(int i = 0; i < arr2.length/2; i++) {
			int tmp = arr2[i];
			arr2[i] = arr2[(arr2.length-1)-i];
			arr2[(arr2.length-1)-i] = tmp;
		}
	}
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5};

		reverse(arr);

		System.out.println(Arrays.toString(arr));
	}
}
