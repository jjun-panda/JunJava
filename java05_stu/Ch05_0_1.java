package java05_stu;

// 추상 클래스는 객체 생성 불가능하다.
abstract class Nobee {
    public abstract void Stu();
}

class Sangmin extends Nobee {
    @Override
    public void Stu() {
        System.out.println("노비 아들이 공부한다.");
    }
}


public class Ch05_0_1 {
    public static void main(String[] args) {
        // 추상 메소드로 참조 변수 선언 가능
        Nobee i = new Sangmin();
        i.Stu();
    }
}
