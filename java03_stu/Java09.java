package java03_stu;

import java.io.PrintStream;

public class Java09 {
	// public static void main(String[] args) {
        //         int total = 0;
        //         int i = 1;
                
        //         while(i <= 9){
        //                 for(i = 1; i <= 10; i++){
        //                         if(i%2 == 1) {
        //                                 System.out.print(i);
        //                                 total += i;
        //                                 System.out.print(i<9?"+": "=");
        //                         }
        //                 }
        //                 System.out.print(total);
        //         }
		
	// }
        // public static void main(String[] args) {
                // final int total = 10;
        //         int total = 0;
        //         int i = 1;
                
        //         while(i <= 9){
        //                 i++;
        //                 if(!(i%2 == 0)) {
        //                         System.out.print(i);
        //                         total += i;
        //                         System.out.print(i<MAX?"+": "=");
        //                 }
        //         }
        //         System.out.print(total);
	// }
        // public static void main(String[] args) {
        //         final int MAX = 10;
        //         int total = 0;
        //         int i = 1;
                
        //         while(i <= 9){
        //                 // i++;
        //                 System.out.print(i);
        //                 i += 2;
        //                 total += i;
        //                 System.out.print(i<MAX?"+": "=");
        //         }
        //         System.out.print(total);
	// }
        // public static void main(String[] args) {
        //         final int MAX = 10;
        //         int total = 0;
        //         int count = 1; // 홀짝구분
        //         int num = 1;
        //         while(num <= 9){
        //                 System.out.print(num);

        //                 if (count%2!=0){
        //                         System.out.print(num<MAX?"-": "=");
        //                 } else {
        //                         System.out.print(num<MAX?"+": "=");
        //                 }
        //                 num += 2;
        //                 count++;
        //         }
        //         total += num;
        //         System.out.print(total);
        // }
        // public static void main(String[] args) {
        //         final int MAX = 9; // 최대값인 9까지 인출하는 조건
        //         int total = 0;
        //         int num = 1;
        //         boolean flag = true; // flag가 참이다. 정의
        //         while(num <= MAX){ 
        //                 // MAX는 9이므로 num가 9에 도달할 경우
        //                 // 반복문 계속 실행되는데, 10 도달하면 반복 중단하고
        //                 // 제일 밑에 토탈에서 최종 끝
        //                 System.out.print(num);

        //                 if (flag){ // 홀수
        //                         System.out.print(num<MAX?"-": "=");
        //                         flag = false;
        //                 } else { // 짝수
        //                         System.out.print(num<MAX?"+": "=");
        //                         flag = true;
        //                 }
        //                 num += 2; // 2씩 더한 값 (1, -3, 5, -7, 9)
        //         }

        //         total += num; // 위의 num 값을 각각 대입해서 총합 계산
        //         System.out.print(total);
        // }

        // 피보나치 수열 - while문 활용
        // public static void main(String[] args) {
        //         final int MAX = 21;
        //         int total = 0;
                
        //         int n1 = 0; // 이전항
        //         int n2 = 1; // 현재항
        //         int n3; // 다음항

        //         while(n2 <= MAX) {
        //                 System.out.print(n2);
        //                 n3 = n2 + n1;
        //                 n1 = n2;
        //                 n2 = n3;
        //                 total += n2;
        //                 System.out.print(n2<MAX?"+": "="); 
        //         }
        //         System.out.print(total);
        // }

        // 피보나치 수열 - for문 활용
//         public static void main(String[] args) {
//                 final int MAX = 21;
//                 int total = 0;
//                 for(int n1 = 0, n2 = 1, n3 = 0;n2 <= 21; n3 = n2 + n1, n1 = n2, n2 = n3) {
//                         System.out.print(n2);
//                         total += n2;
//                         System.out.print(n2<MAX?"+": "=");                        
//                 }
//                 System.out.print(total);
//         }
        // 스타위즈 - 5개씩 출력
        public static PrintStream printf(String format, Object ... args) {
                return System.out.format(format, args);
            }
        // public static void printfTest(String[] args) {
        //         printf("Hello, %s!", "김코딩");
        // }
        // public static void seb(String[] args) {
        //         for(int i = 0; i < 25; i++) {
        //                 printf("*");
        //                 if((i+1)%5 == 0){
        //                         printf("\n");
        //                 }
        //         }
                
        // }

        // 스타위즈 - 첫 줄은 1개로 시작하여 1줄마다 1개씩 증가
        // public static void main(String[] args) {
        //         for(int i = 0; i < 5; i++) {
        //                 for(int j = 0; j < i+1; j++){
        //                         printf("*");
        //                 }
        //                 printf("\n");

        //         }
        // }

        // 스타위즈 - 첫 줄은 5개로 시작하여 1줄마다 1개씩 감소
        // public static void main(String[] args) {
        //         for(int i = 0; i < 5; i++) {
        //                 for(int j = 5; j >= i+1; j--){
        //                         printf("*");
        //                 }
        //                 printf("\n");
        //         }
        // }

        // 스타위즈 - 첫 줄은 1개로 시작하여 1줄마다 1개씩 증가, 우측정렬
        // public static void main(String[] args) {
        //         for (int i = 0; i < 5; i++) {

        //             for (int k = 4; k >= i + 1; k--) {
        //                 System.out.print(" ");
        //             }
        //             for (int j = 0; j < i + 1; j++) {
        //                 System.out.print("*");
        //             }
        //             System.out.print("\n");
        //         }
        //     }

        // 스타위즈 - 첫 줄은 1개로 시작하여 1줄마다 1개씩 증가 (변수 바꿔서 응용)
        // public static void main(String[] args) {
        //         final int MAX = 5;
        //         for(int row = 0; row < MAX;  row++) {
        //                 for(int col = 0; col < row + 1;  col++) {
        //                         printf("*");
        //                 }
        //         System.out.print("\n");

        //         }
        // }

        // 스타위즈 - 다이아몬드 절반
//         public static void main(String[] args) {
//                 final int MAX = 10;
//                 for(int row = 0; row < MAX;  row++) {
//                         for(int col = 0; col < row + 1;  col++) {
//                                 printf("*");
//                         }
//                         System.out.print("\n");

//                         for(int col2 = MAX; col2 >= row + 1;  col2--) {
//                                 printf("*");
//                         }
//                 System.out.print("\n");

//                 }
//         }

        // 스타위즈 - 다이아몬드 절반(강사) = 좌측정렬
        // public static void main(String[] args) {
        //         final int MAX = 9;
        //         int end = 1;
        //         for(int i = 0; i < MAX;  i++) {
        //                 for(int k=0; k<end; k++) {
        //                         printf("*");
        //                 }
        //                 printf("\n");
        //                 end = i<4? end+1 : end-1;

        //         }
        // }

        // 스타위즈 - 다이아몬드 절반 = 우측정렬
        // public static void main(String[] args) {
        //         final int MAX = 9;
        //         int end = 1;
        //         for(int i = 0; i < MAX;  i++) {

        //                 for(int j=4; j>=end; j--) {
        //                         printf(" ");
        //                 }
        //                 for(int k=0; k<end; k++) {
        //                         printf("*");
        //                 }
        //                 printf("\n");
        //                 end = i<4? end+1 : end-1;

        //         }
        // }

        // 스타위즈 - 피라미드
        // 과제
        // 0 : *****
        // 1 :  ****
        // 2 :   ***
        // 3 :    **
        // 4 :     *
        // public static void main(String[] args) {
        //         for (int i = 0; i < 5; i++) {
        //                 for (int j = 0; j < i + 1; j++) {
        //                         System.out.print("*");
        //                 }
        //                 for (int k = 0; k < i + 1; k++) {
        //                         System.out.print("*");
        //                 }
        //                 System.out.print("\n");
        //         }
        // }

         // 스타위즈 - 피라미드(순))
        // public static void main(String[] args) {
        //         for (int i = 0; i < 5; i++) {
        //                 for (int j = 0; j < 4-i; j++) {
        //                         System.out.print(" ");
        //                 }
        //                 for (int j = 0; j <= i*2; j++) {
        //                         System.out.print("*");
        //                 }
        //                 System.out.print("\n");
        //         }
        // }

        // 스타위즈 - 피라미드(역))
        // public static void main(String[] args) {
        //         for (int i = 0; i < 5; i++) {
        //                 for (int j = 5; j >= 4-i; j--) {
        //                         System.out.print("-");
        //                 }
        //                 for (int j = 8; j >= i*2; j--) {
        //                         System.out.print("*");
        //                 }
        //                 System.out.print("\n");
        //         }
        // }

        // 스타위즈 - 다이아몬드
        // public static void main(String[] args) {
        //         int end = 0;
        //         for (int i = 0; i < 11; i++) {
        //                 for (int j = 0; j < 5-end; j++) {
        //                         System.out.print(" ");
        //                 }
        //                 for (int j = 0; j <= end*2; j++) {
        //                         System.out.print("*");
        //                 }
        //                 System.out.print("\n");
        //                 end = i<5? end+1 : end-1;
        //         }
        // }
        // 스타위즈 - 역다이아몬드
        // public static void main(String[] args) {
        //         int end = 0;
        //         for (int i = 0; i < 9; i++) {
        //                 for (int j = 0; j <= 4-end; j++) {
        //                         System.out.print("*");
        //                 }
        //                 for (int j = 0; j < end*2-1; j++) {
        //                         System.out.print("-");
        //                 }
        //                 for (int j = 0; j <= 4-end; j++) {
        //                         if()
        //                         System.out.print("*");
        //                 }
        //                 System.out.print("\n");
        //                 end = i<4? end+1 : end-1;
        //         }
        // }

        // 스타위즈 - 역다이아몬드(강사님)
// 0       000000000       5    <4 어떤의미 어디부터 어디까지가 공백인가를 쳐놓은거
// 1       0000 0000       4    <5
// 2       000   000       3    <6
// 3       00     00       2    <7
// 4       0       0       1    <8
// 5       00     00       2    <7
// 6       000   000       3    <6
// 7       0000 0000       4    <5
// 8       000000000       5    <4
        // public static void main(String[] args) {
        //         for (int i = 0; i < 9; i++) { // 행
        //                 int s = 0, e=0;
        //                 if(i<5) {
        //                         s=5-i; e=4+i;
        //                 } else {
        //                         s=i-3; e=9-(i-3);
        //                 }
        //                 for (int j = 0; j < 9; j++) {  // 열
        //                         if(j>=s && j<e){
        //                                 System.out.print(" ");
        //                         }else {
        //                         System.out.print("0");
        //                 }
        //                 }
        //                 System.out.print("\n");

        //         }
        // }

// 0       000000000       5    <4
// 1       0  0 0  0       1    <5
// 2       0 0   0 0       1 <2    <6
// 3       00     00       2    <7
// 4       0       0       1    <8
// 5       00     00       2    <7
// 6       0 0   0 0       3    <6
// 7       0  0 0  0       4    <5
// 8       000000000       5    <4
        // public static void main(String[] args) {
        //         for (int i = 0; i < 9; i++) { // 행
        //                 // int s = 0, e=0;
        //                 // int m = 0;
        //                 // if(i<5) {
        //                 //         s=4-i; e=4+i;
        //                 // } else {
        //                 //         s=i-3; e=9-(i-3);
        //                 // }
        //                 for (int j = 0; j < 9; j++) {  // 열
        //                         if(j!=0 && j!=8 && i != 0 && i!= 8) {
        //                                 System.out.print(" ");
        //                         }else {
        //                         System.out.print("0");
        //                         }
        //                 }
        //                 System.out.print("\n");

        //         }
        // }
        public static void main(String[] args) {
                for (int i = 0; i < 9; i++) { // 행
                        for (int j = 0; j < 9; j++) {  // 열
                                if(j>0 && j<8 && i!=0 && i!=8 && j==i) {
                                        System.out.print(" ");
                                }else {
                                System.out.print("0");
                                }
                        }
                        System.out.print("\n");

                }
        }
        // public static void main(String[] args) {
        //         int end = 4;
        //         for (int i = 0; i <= 9; i++) {
        //                 for (int j = 9; j > end; j--) {
        //                         System.out.print("*");
        //                 }
        //                 for (int j = 0; j < end*2-4; j++) {
        //                         System.out.print("-");
        //                 }
        //                 for (int j = 9; j > end; j--) {
        //                         System.out.print("*");
        //                 }
        //                 System.out.print("\n");
        //                 end = i<4? end+1 : end-1;
        //         }
        // }
        // // public static void main(String[] args) {
        //         int end = 4;
        //         for (int i = 0; i < 9; i++) {
        //                 for (int j = 0; j < end-3; j++) {
        //                         System.out.print("*");
        //                 }
        //                 for (int j = 0; j < 2*(8-end); j++) {
        //                         System.out.print(" ");
        //                 }
        //                 for (int j = 0; j < end-3; j++) {
        //                         System.out.print("*");
        //                 }
        //                 System.out.print("\n");
        //                 end = i<4? end+1 : end-1;
        //         }
        // }
}