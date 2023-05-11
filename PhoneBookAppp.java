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

    @Override
    public String toString() {
        return "[" + no + "]" + name + " | " + phone + " | " + email + " | " + region;
    }
}

public class PhoneBookAppp {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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
            map.put("users", "user" + i);
            map.put("phone", phone);
            map.put("email", email);
            map.put("region", region);
            Saram saram = new Saram(i, "user" + i, phone, email, region);
			saramList.add(saram);
		}
		Iterator<Saram> iterator = saramList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}	
}