package java04_book.book.classA;

class Power {
    private int kick = 0;
    private int punch = 0;

    public Power() {}
    public Power(int kick, int punch) {
        this.kick = kick;
        this.punch = punch;
    }
}

public class ch04_8_1 {
    public static void main(String[] args) {
        Power robot = new Power(10, 20);
    }
}

