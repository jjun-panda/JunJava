
package java04_book.book.classA;

class Power {
    private int kick = 0;
    private int punch = 0;

    // 생성자
    public Power() {
        this(0,0);
    }
    public Power(int kick) {
        this(kick, 0);
    }
    public Power(int kick, int punch) {
        this.kick = kick;
        this.punch = punch;
    }
    // getters, setters 추가
    public void setKick(int kick) {
        this.kick = kick;
    }
    public void setPunch(int punch) {
        this.punch = punch;
    }
    // toString 추가
    public String toString() {
        return kick + " : " + punch;
    }
}

public class ch04_8_3 {
    public static void main(String[] args) {
        Power robot = new Power();
        robot.kick = 10;
        robot.punch = 20;
    }
}

