package java05_book.book;
class Point {
    private int x, y;
    public Point(int x, int y) { this.x = x; this.y = y; }
    public int getX() { return x; }
    public int getY() { return y; }
    protected void move(int x, int y) { this.x = x; this.y = y; }
}

class PositivePoint extends Point {
    public PositivePoint() { // 생성자
        super(0, 0);
    }
    public PositivePoint(int x, int y) { // 생성자
        super(x, y);
        if(x < 0 || y < 0) {
            super.move(0, 0);
        }
    }
    public void move(int x, int y) { // move
        if(x > 0 && y > 0) {
            super.move(x, y);
        }
    }
    public String toString() { // toString
        return "(" + getX() + ", " + getY() + ")의 점";
    }
}

public class ch5_2_8 {
    public static void main(String[] args) {
        PositivePoint p = new PositivePoint();
        p.move(10, 10);
        System.out.println(p.toString()+"입니다.");

        p.move(-5,5); // 객체 p는 음수 공간으로 이동되지 않음
        System.out.println(p.toString()+"입니다.");

        PositivePoint p2 = new PositivePoint(-10, -10);
        System.out.println(p2.toString()+"입니다.");
    }
}