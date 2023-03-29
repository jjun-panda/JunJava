package java03_stu;

public class Java07_1 {
    // 피보나치 수열
	public static void main(String[] args) {
        final int MAX = 8;

        int n1 = 1;
        int n2 = 0;
        int n3 = 1;
        int num = 0;

        for(int n = 1; n <=MAX; n++) {    
                n3 = n1 + n2;
                System.out.print(n3);
                n1 = n2;
                n2 = n3;
                num += n2;
                if(n < MAX) {
                    System.out.print("+");

                }
        }
        System.out.print("=" + num);
	}
}