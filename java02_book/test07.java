public class test07 {
    public static void main(String[] args) {
        var price = 200; // price는 int 타입으로 결정
        var name = "kitae"; // name은 String 타입으로 결정
        var pi = 3.14; // pi는 double 타입으로 결정
        // var point = new Point(); // point는 Point 타입으로 결정
        // var v = new Vector<Integer>(); // v는 Vector<integer> 타입으로 결정

        // var nameTo; // 컴파일 오류. 변수 name의 타입을 추론할 수 없음

        System.out.println(price);
        System.out.println(name);
        System.out.println(pi);
        // System.out.println(point);
        // System.out.println(v);
        // System.out.println(nameTo);

    }
}