package java04_book.book;


public class Rectangle {

    int x, y, width, height;
    // static는 클래스 멤버 내에서만 사용.
    public Rectangle () {
        // Default 생성자
    }

    public Rectangle(int x, int y, int width, int height) {
        // 생성자 오버로딩
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public boolean contains(Rectangle r) {
        // 포함하는지 검사
        if(r.x>=x && r.y>=y){
            if(r.x+r.width <= x+width && r.y+r.height <= y+height){
                return true;
            }
        }
        return false;
    }
    
    public void show() {
        System.out.printf("(%d, %d)의 넓이는 %d\n", x, y, width*height);
    }

    public int square() {

        return width*height;
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2,2,8,7);
        Rectangle s = new Rectangle(5,5,6,6);
        Rectangle t = new Rectangle(1,1,10,10);

        r.show();
        System.out.println("s의 면적은 " + s.square());
        if(t.contains(r)) {
            System.out.println("t는 r을 포함한다.");
        }
        if(t.contains(s)) {
            System.out.println("t는 s을 포함한다.");
        }
    }
}
