package java03_stu;

public class Java16 {
	public static void main(String[] args) {
		int arr[] = new int[7];
		System.out.println("arr.length => " + arr.length);

		arr[0] = 231;
		arr[1] = 21;
		arr[2] = 541;
		arr[3] = 61;
		arr[4] = 41;
		arr[5] = 10;
		arr[6] = 122;

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Max => " + max);
		System.out.println("Min => " + min);
	}
}
