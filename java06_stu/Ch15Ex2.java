package java06_stu;

public class Ch15Ex2 {
    public static void main(String[] args) {
        String str1 = "1|김코딩|프로그래머|29";

      // StringBuffer는 오토박싱 지원 안함.
      // String의 오토박싱 결점을 보완하기 위해 새로 추가된 클래스이다.
      // 오토박싱 대신 new를 이용해서 객체 생성 해야 한다.
        StringBuffer strbf = new StringBuffer();
        strbf.append(str1);
        strbf.append("|coding@work.com");

        String s = "프로그래머";
        int start = strbf.indexOf(s);
        int end = start + s.length();
        strbf.replace(start, end, "개발자");
        System.out.println(strbf);

        strbf.delete(strbf.indexOf("개발자"), strbf.indexOf("개발자")+"개발자|".length());
        System.out.println(strbf);

    }

    public static void test(String[] args) {
        String str1 = "1|김코딩|프로그래머|29";

        int idx = str1.indexOf("프로그래머");
        System.out.println("inx = " + idx);

        str1.replace("프로그래머", "개발자");
        System.out.println(str1);
    }
}
