package java05_book.book.quiz;

interface Device {
    void on();
    void off();
}

public class ch5_1_16 implements Device {
    public void on() {
        System.out.println("켜졌습니다.");
    }
    public void watch() {
        System.out.println("방송중입니다.");
    }
    public void off() {
        System.out.println("종료합니다.");
    }

    public static void main(String[] args) {
        ch5_1_16 myTv = new ch5_1_16();
        myTv.on();
        myTv.watch();
        myTv.off();
    }
}