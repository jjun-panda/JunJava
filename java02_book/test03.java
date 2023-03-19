public class test03 {
    public static void main(String[] args) {
        int n = 15;
        int m = 015;
        int k = 0x15;
        int b = 0b0101;  
        long g1 = 24L; // 24L은 24l와 동일
        long g2 = 24l; // 24L은 24l와 동일
        long g3 = 24; // 24L은 24l와 동일

        System.out.println("10진수이며" + "10진수 값은 " + n);
        System.out.println("8진수이며" + "10진수 값은 " + m);
        System.out.println("16진수이며" + "10진수 값은 " + k);
        System.out.println("2진수이며" + "10진수 값은 " + b);
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);

    }
}