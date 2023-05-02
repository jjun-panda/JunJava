package java04_book.book.classA;

class Power {
    private int kick = 0;
    private int punch = 0;

    public Power(int j, int k) {
        this.kick = j;
        this.punch = k;
    }
}

public class Example2_2 {
    public static void main(String[] args) {
        Power robot = new Power();
        robot.set(10, 20);
    }
}

