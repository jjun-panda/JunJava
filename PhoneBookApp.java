import java.util.*;

class Saram {
	private int no;
	private String name;
	private String phone;
	private String email;
	private String region;

	public Saram(int no, String name, String phone, String email, String region) {
		this.no = no;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.region = region;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return "[" + no + "]" + name + " | " + phone + " | " + email + " | " + region;
	}
}

public class PhoneBookApp {
	ArrayList<Saram> saramList = new ArrayList<Saram>();
	static Scanner sc = new Scanner(System.in);
	
	public PhoneBookApp() {
		saramList = new ArrayList<Saram>();
	}

	public void randomList() {
		Random r = new Random();
		ArrayList<Saram> saramList = new ArrayList<Saram>();
		String[] mails = {"gmail", "naver", "yahoo", "kakao", "daum"};
		String[] regions = {"부산", "서울", "경기", "인천", "대구", "광주", "대전", "제주", "경남", "경북", "전북", "전남", "강원", "세종"};
		System.out.print("주소록에 몇 명을 랜덤으로 추가 하시겠습니까>> ");
		int numSarams = sc.nextInt();

		for (int i = 1; i <= numSarams; i++) {
			int num1 = r.nextInt(1000, 9999);
			int num2 = r.nextInt(1000, 9999);
			String phone = "010-" + num1 + "-" + num2;
			String email = "name" + i + "@" + mails[r.nextInt(mails.length)] + ".com";
			String region = regions[r.nextInt(regions.length)];
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("no", i);
			map.put("username", "user" + i);
			map.put("phone", phone);
			map.put("email", email);
			map.put("region", region);
			Saram saram = new Saram(i, "user" + i, phone, email, region);
			saramList.add(saram);
		}
		System.out.println("-".repeat(20) + " 주소록 관리 " + "-".repeat(20));
		for (Saram s : saramList) {
			System.out.println(s);
		}
		System.out.println("\n>>사용자가 입력하신 " + numSarams + "명을 주소록에 랜덤 추가했습니다");
	}

	// 1.추가
	public void addSaram() {
		// System.out.print("이름을 입력해주세요>> ");
		// String name = sc.nextLine();
		// System.out.print("휴대폰을 입력해주세요('-'포함)>> ");
		// String phone = sc.nextLine();
		// System.out.print("이메일을 입력해주세요('@'포함)>> ");
		// String email = sc.nextLine();
		// System.out.print("지역을 입력해주세요>> ");
		// String region = sc.nextLine();
		// int no = saramList.size() + 1;
		// Saram saram = new Saram(no, name, phone, email, region);
		// saramList.add(saram);
		// System.out.println(name + "님이 주소록에 추가되었습니다.");
	}
	
	// 2.뷰어
	public void viewAllSarams() {
		// System.out.println("-".repeat(20) + " 주소록 관리 " + "-".repeat(20));
		// for (Saram s : saramList) {
		//     System.out.println(s);
		// }
	}

	// 3.검색
	public void searchSaram() {
		// System.out.print("검색할 이름>> ");
		// String searchName = sc.nextLine();
		// boolean found = false;
		// for (Saram s : saramList) {
		//     if (s.getName().equals(searchName)) {
		//         System.out.println(s);
		//         found = true;
		//     }
		// }
		// if (!found) {
		//     System.out.println(searchName + "님은 주소록에 없습니다.");
		// }
	}

	// 4. 수정
	public void modifySaram() {
		// int modifyNo = sc.nextInt();
		// for (Saram s : saramList) {
		// 	if (s.getNo() == modifyNo) {
		// 		System.out.println("수정하실 내용을 선택하세요 ");
		// 		System.out.println("[ 1. 이름 2. 전화번호 3. 이메일 4. 지역 ]");
		// 		int modifyOption = sc.nextInt();
		// 		switch (modifyOption) {
		// 			case 1:
		// 				System.out.print("새로운 이름을 입력하세요.");
		// 				String modifyName = sc.next();
		// 				s.setName(modifyName);
		// 				System.out.println("이름이 변경되었습니다.");
		// 				break;
		// 			case 2:
		// 				System.out.print("새로운 전화번호를 입력하세요.");
		// 				String modifyPhone = sc.next();
		// 				s.setPhone(modifyPhone);
		// 				System.out.println("전화번호가 변경되었습니다.");
		// 				break;
		// 			case 3:
		// 				System.out.print("새로운 이메일을 입력하세요.");
		// 				String modifyEmail = sc.next();
		// 				s.setEmail(modifyEmail);
		// 				System.out.println("이메일이 변경되었습니다.");
		// 				break;
		// 			case 4:
		// 				System.out.print("새로운 지역을 입력하세요.");
		// 				String modifyRegion = sc.next();
		// 				s.setRegion(modifyRegion);
		// 				System.out.println("지역이 변경되었습니다.");
		// 				break;
		// 			default:
		// 				System.out.println("해당 번호가 없습니다.");
		// 				break;
		// 		}
		// 		break;
		// 	}
		// }
		// System.out.println("수정이 완료되었습니다.");
	}

	// 5. 종료
	public void stop() {
		System.out.println("-".repeat(40));
		System.out.println(" ".repeat(10) + " 주소록을 종료합니다 " + " ".repeat(10));
		System.out.println("-".repeat(40));

		System.exit(0);
	}

	public void menu() {
		Random r = new Random();
		ArrayList<Saram> saramList = new ArrayList<Saram>();
		String[] mails = {"gmail", "naver", "yahoo", "kakao", "daum"};
		String[] regions = {"부산", "서울", "경기", "인천", "대구", "광주", "대전", "제주", "경남", "경북", "전북", "전남", "강원", "세종"};
		System.out.print("주소록에 몇 명을 랜덤으로 추가 하시겠습니까>> ");
		int numSarams = sc.nextInt();

		for (int i = 1; i <= numSarams; i++) {
			int num1 = r.nextInt(1000, 9999);
			int num2 = r.nextInt(1000, 9999);
			String phone = "010-" + num1 + "-" + num2;
			String email = "name" + i + "@" + mails[r.nextInt(mails.length)] + ".com";
			String region = regions[r.nextInt(regions.length)];
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("no", i);
			map.put("username", "user" + i);
			map.put("phone", phone);
			map.put("email", email);
			map.put("region", region);
			Saram saram = new Saram(i, "user" + i, phone, email, region);
			saramList.add(saram);
		}
		System.out.println("-".repeat(20) + " 주소록 관리 " + "-".repeat(20));
		for (Saram s : saramList) {
			System.out.println(s);
		}
		System.out.println("\n>>사용자가 입력하신 " + numSarams + "명을 주소록에 랜덤 추가했습니다");
		while (true) {
			System.out.println("\n[ 1.추가 2.뷰어 3.검색 4.수정 5.종료 ]");
			System.out.print("선택지를 입력해주세요>> ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.print("이름을 입력해주세요>> ");
				String name = sc.nextLine();
				System.out.print("휴대폰을 입력해주세요('-'포함)>> ");
				String phone = sc.nextLine();
				System.out.print("이메일을 입력해주세요('@'포함)>> ");
				String email = sc.nextLine();
				System.out.print("지역을 입력해주세요>> ");
				String region = sc.nextLine();
				int no = saramList.size() + 1;
				Saram saram = new Saram(no, name, phone, email, region);
				saramList.add(saram);
				System.out.println(name + "님이 주소록에 추가되었습니다.");
				break;
			case 2:
				System.out.println("-".repeat(20) + " 주소록 관리 " + "-".repeat(20));
				for (Saram s : saramList) {
					System.out.println(s);
				}
				break;
			case 3:
				System.out.print("검색할 이름>> ");
				String searchName = sc.nextLine();
				boolean found = false;
				for (Saram s : saramList) {
					if (s.getName().equals(searchName)) {
						System.out.println(s);
						found = true;
					}
				}
				if (!found) {
					System.out.println(searchName + "님은 주소록에 없습니다.");
				}
				break;
			case 4:
				int modifyNo = sc.nextInt();
				for (Saram s : saramList) {
					if (s.getNo() == modifyNo) {
						System.out.println("수정하실 내용을 선택하세요 ");
						System.out.println("[ 1. 이름 2. 전화번호 3. 이메일 4. 지역 ]");
						int modifyOption = sc.nextInt();
						switch (modifyOption) {
							case 1:
								System.out.print("새로운 이름을 입력하세요.");
								String modifyName = sc.next();
								s.setName(modifyName);
								System.out.println("이름이 변경되었습니다.");
								break;
							case 2:
								System.out.print("새로운 전화번호를 입력하세요.");
								String modifyPhone = sc.next();
								s.setPhone(modifyPhone);
								System.out.println("전화번호가 변경되었습니다.");
								break;
							case 3:
								System.out.print("새로운 이메일을 입력하세요.");
								String modifyEmail = sc.next();
								s.setEmail(modifyEmail);
								System.out.println("이메일이 변경되었습니다.");
								break;
							case 4:
								System.out.print("새로운 지역을 입력하세요.");
								String modifyRegion = sc.next();
								s.setRegion(modifyRegion);
								System.out.println("지역이 변경되었습니다.");
								break;
							default:
								System.out.println("해당 번호가 없습니다.");
								break;
						}
						break;
					}
				}
				System.out.println("수정이 완료되었습니다.");
				break;
			case 5:
				stop();	
				break;
			}
		}
	}

	public static void main(String[] args) {
		PhoneBookApp book = new PhoneBookApp();
		book.menu();
	}
}
