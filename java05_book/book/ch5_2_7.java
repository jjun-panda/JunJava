package java05_book.book;

class Point {
    private int x, y;
    public Point(int x, int y) { this.x = x; this.y = y; }
    public int getX() { return x; }
    public int getY() { return y; }
    protected void move(int x, int y) { this.x = x; this.y = y; }
}

class Point3D extends Point {
    private int z;
    public Point3D(int x, int y, int z) { // 생성자
        super(x, y);
        this.z = z;
    }
    public void moveUp(){ // moveUp
        z++; //  z축 위로 이동
    }
    public void moveDown(){ // moveDown
        z--; //  z축 아래로 이동
    }
    public void move(int x, int y, int z) { // move
        move(x, y);
        this.z = z;
    }
    public String toString() { // toString
        return "(" + getX() + ", " + getY() + ", " + z + ")의 점";
    }
}

public class ch5_2_7 {
    public static void main(String[] args) {
        Point3D p = new Point3D(1,2,3); // 1,2,3은 각각 x, y, z축의 값.
        System.out.println(p.toString()+"입니다.");

        p.moveUp(); // z 축으로 위쪽 이동
        System.out.println(p.toString()+"입니다.");

        p.moveDown(); // z 축으로 아래쪽 이동
        p.move(10, 10); // x, y 축으로 이동
        System.out.println(p.toString()+"입니다.");

        p.move(100,  200, 300); // x, y, z축으로 이동
        System.out.println(p.toString()+"입니다.");
    }
}