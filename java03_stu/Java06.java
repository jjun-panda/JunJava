package java03_stu;

public class Java06 {
    
	public static void main(String[] args) {
        final int MAX = 100;
        for(int i = 1, total=0; i <=MAX; i++) {
            System.out.print(i);
            total += i;
            System.out.print(i<MAX?"+":"="+total);
        }
	}

    


}
