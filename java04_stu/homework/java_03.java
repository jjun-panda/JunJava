// 1   2   3   4   5
//     4   5   6
//         7
//     8   9   10
// 11  12  13  14  15
// 1   2   3   4   5   
//     4   5   6   
//         7   
//     8   9   10  
// 11  12  13  14  15 
package java04_stu.homework;

public class java_03 {
	public static void main(String[] args) {      
		// int n[][] = {{1,2,3,4,5}, {4, 5, 6}, {7}, {8, 9, 10}, {11, 12, 13, 14, 15}};
		// int end = 1;
		// for(int i=0; i<n.length; i++) {
		// 	for (int k = 1; k < end; k++) {
		// 		System.out.print(" ");
		// 	}

		// 	for(int j=0; j<n[i].length; j++) {
		// 		if (n[i][j] < 10){
		// 			System.out.print(n[i][j]+ "   ");
		// 		} else {
		// 			System.out.print(n[i][j]+ "  ");
		// 		}
		// 	}
		// 	System.out.println();
		// 	end = i < 2? end + 4: end - 4;
		// }
		int n[][] = {{1,2,3,4,5}, {4, 5, 6}, {7}, {8, 9, 10}, {11, 12, 13, 14, 15}};
		int end = 1;
		for(int i=0; i<n.length; i++) {
			for (int k = 1; k < end; k++) {
				System.out.print("\t");
			}

			for(int j=0; j<n[i].length; j++) {
				if (n[i][j] < 10){
					System.out.print(n[i][j]+ "\t");
				} else {
					System.out.print(n[i][j]+ "\t");
				}
			}
			System.out.println();
			end = i < 2? end + 1: end - 1;
		}
	}
}

