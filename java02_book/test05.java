public class test05 {
    public static void main(String[] args) {
        char a = 'A';
        char b = '글';
        char c = '\u0041'; // 유니코드 값(0041) = 문자 A
        char d = '\uae00'; // 유니코드 값(ae00) = 문자 글

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}