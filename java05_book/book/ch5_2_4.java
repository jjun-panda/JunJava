package java05_book.book;

import java.util.Scanner;

abstract class Converter {
    abstract protected double convert(double src); // 추상 메소드
    abstract protected String getSrcString(); // 추상 메소드
    abstract protected String getDestString(); // 추상 메소드
    protected double ratio; // 비율
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getSrcString() + "을 "+getDestString() + "로 바꿉니다.");
        System.out.print(getSrcString() + "을 입력하세요>> ");
        double val = scanner.nextDouble();
        double res = convert(val);
        System.out.println("변환 결과: " +  String.format("%.2f", res) + getDestString() + "입니다");
        scanner.close();
    }
}
class Km2Mile extends Converter {
    public Km2Mile(double ratio) { this.ratio = ratio; }
    protected double convert(double src) { return src/ratio; }
    protected String getSrcString() { return "km"; }
    protected String getDestString() { return "mile"; }
}
public class ch5_2_4 {
    public static void main(String args[]) {
        Km2Mile toMile = new Km2Mile(1.6);
        toMile.run();
    }
}