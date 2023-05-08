package java05_book.book.quiz;

abstract class OddDetector {
    protected int n;
    public OddDetector (int n) {
        this.n = n;
    }
    public abstract boolean isOdd(); // 홀수이면 true 리턴
}
public class ch5_1_10 extends OddDetector {
    public ch5_1_10(int n) {
        super(n);
    }
    public boolean isOdd() {
        if(n%2 == 1) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        ch5_1_10 b = new ch5_1_10(10);
        System.out.println(b.isOdd());
    }
}
