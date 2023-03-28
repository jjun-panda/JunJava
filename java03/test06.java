public class test06 {
    public static void main (String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int m = 1; m < 10; m++) {
                System.out.print(i + "*" + m + "=" + i*m);
                System.out.print("\t");
            }
            // System.out.println();
            System.out.print("\n");
        }
    }
}
