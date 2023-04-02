package java03_stu;

public class Java08 {
	public static void main(String[] args) {
                final int MAX = 10;
                int total = 2;

                for(int i = 1; i <= MAX; i++) {
                        System.out.print(i);
                        if(i%2 == 0){
                                total -= i;
                                System.out.print(MAX ! "+");
                        } else {
                                total += i;
                                System.out.print(MAX ! "-");
                        }
                }

                System.out.print(total);
	}
}