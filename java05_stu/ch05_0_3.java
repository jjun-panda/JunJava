package java05_stu;

interface TV {
    // 추상메소드, 상수 필수 사용(변수 사용 부라능)
    // public static final 생략 되어도 컴파일러가 추가 한다.
    String name = "TV";
    void powerOn();
}

class SamsungTV implements TV {
    public void powerOn() {System.out.println("삼성 "+ TV.name + " 켜기");}
}

class LgTV implements TV {
    public void turnOn() {System.out.println("LG "+ TV.name +" 켜기");}
    @Override
    public void powerOn() {
        turnOn();
    }
}

public class ch05_0_3 {
    // 업캐스팅
    public static void TvRunner(TV tv) {
        tv.powerOn();
    }

    public static void main(String[] args) {
        TvRunner(new SamsungTV());
        TvRunner(new LgTV());
    }

}