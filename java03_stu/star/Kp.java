public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	final int size = 9;   // 패턴 크기 설정
	int num = 4;    // 기준점
	int add = 8;    // 더할 부분
	

	int row, col;
	System.out.print("세로(row)의 개수 입력해주세요\n>> ");
	row = scan.nextInt();
	System.out.print("가로(col)의 개수 입력해주세요\n>> ");
	col = scan.nextInt();
	
	for (int i = 0; i < size*row-(row-1); i++) {		// 세로(row)
		for (int j = 0; j < size*col-(col-1); j++) {	// 가로(col)
				
				int n = 1;
				// 직사각형 그리기
				if (i == 0 || j == 0 || i == size*(n+0)-(n+0) || j == size*(n+0)-(n+0) || i == size*(n+1)-(n+1) || j == size*(n+1)-(n+1) || i == size*(n+2)-(n+2) || j == size*(n+2)-(n+2)) {
					System.out.print("*"); // 별 출력
				}

				// 대각선 그리기
				else if ((i == (num+(add*(-1)))-j) || (j == (num-(add*(2)))+i)) {
					System.out.print("0"); // 별 출력
				} else if ((i == (num+(add*(0)))-j) || (j == (num-(add*(1)))+i)) {
					System.out.print("0"); // 별 출력
				} else if ((i == (num+(add*(1)))-j) || (j == (num-(add*(0)))+i)) {
					System.out.print("0"); // 별 출력
				} else if ((i == (num+(add*(2)))-j) || (j == (num-(add*(-1)))+i)) {
					System.out.print("0"); // 별 출력
				} else if ((i == (num+(add*(3)))-j) || (j == (num-(add*(-2)))+i)) {
					System.out.print("0"); // 별 출력
				} else if ((i == (num+(add*(4)))-j) || (j == (num-(add*(-3)))+i)) {
					System.out.print("0"); // 별 출력
				} else {
					System.out.print(" "); // 공백 출력
				}
		}
		System.out.println(); // 줄바꿈
	}
	scan.close();
}