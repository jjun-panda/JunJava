package java03_book;
public class test09 {

    // for

	// public static void main(String[] args) {
	// 	int i;
    //     for(i = 5; i>0; i--){
    //         for(int j=0; j<i; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
	// }

    // while
    public static void main(String[] args) {
		int i;
        i = 5;
        while (i > 0) {
            int j = 0;
            while (j++ < i) {
                System.out.print("*");
            }
            System.out.println();
            i--;
        }
	}
}
