package java03_stu;

public class Java07Copy {
	public static void main(String[] args) {
        final int MAX = 8;

        int n1 = 1;
        int n2 = 0;
        int n3 = 1;
        int numA = 0;
        int numB = 2;

        for(int n = 1; n <=MAX; n++) {    

                if(n%2 == 0){
                        n3 = n1 + n2;
                        System.out.print(n3);
                        n1 = n2;
                        n2 = n3;
                        numA += n2;

                        if(n < MAX) {
                                System.out.print("-");
                        }
                }else {
                        n3 = n1 + n2;
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