package java03_stu;

public class Java07_2 {
	public static void main(String[] args) {
        final int MAX = 7;

        int n1 = 1;
        int n2 = 0;
        int n3 = 1;
        int numA = 0;
        int numB = 2;

        for(int n = 1; n <=MAX; n++) {    
                n3 = n1 + n2;

                if(n%2 == 0){
                        System.out.print(n3);
                        n1 = n2;
                        n2 = n3;
                        numA += n2;

                        if(n < MAX) {
                                System.out.print("-");
                        }
                }else {
                        System.out.print(n3);
                        n1 = n2;
                        n2 = n3;
                        numB -= n2;

                        if(n < MAX) {
                                System.out.print("+");
                        }
                }
                
        }
        int tol = numB + numA;
        System.out.print("=" + tol);
	}
}