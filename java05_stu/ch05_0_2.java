package java05_stu;

abstract class TV {
    public abstract void powerON();
}
class SamsungTV extends TV {
    public void powerON() {
        System.out.println("삼성 TV 켜기");
    }
}
class LgTV extends TV {
    public void trunOn() {
        System.out.println("LG TV 켜기");
    }

    @Override
    public void powerON() {
        trunOn();
    }
}
public class ch05_0_2 {
    // 업캐스팅
    public static void TvRunner(TV tv) {
        tv.powerON();
    }
    public static void main(String[] args) {
        TvRunner(new SamsungTV());
        TvRunner(new LgTV());        
    }
}
