package java05_book.book;

class Point {
    private int x, y;
    public Point(int x, int y) { this.x = x; this.y = y; }
    public int getX() { return x; }
    public int getY() { return y; }
    protected void move(int x, int y) { this.x = x; this.y = y; }
}

class ColorPoint extends Point {
    private String color;
    public ColorPoint() { // 생성자
        super(0, 0);
        this.color = "BLACK";
    }
    public ColorPoint(int x, int y) { // 생성자
        super(0, 0);
        this.color = "BLACK";
    }
    public void setXY(int x, int y){ // setXY
        move(x, y);
    }
    public void setColor(String color){ // setColor
        this.color = color;
    }
    public String toString() { // toString
        return color + "색의" + "(" + getX() + ", " + getY() + ")의 점";
    }
}

public class ch5_2_6 {
    public static void main(String[] args) {
        ColorPoint zeroPoint = new ColorPoint(); // (0,0) 위치의 BLACK 색 점
        System.out.println(zeroPoint.toString() + "입니다.");
        
        ColorPoint cp = new ColorPoint(10, 10); // (10,10) 위치의 BLACK 색 점
        cp.setXY(5,5);
        cp.setColor("RED");
        System.out.println(cp.toString()+"입니다.");
    }
}