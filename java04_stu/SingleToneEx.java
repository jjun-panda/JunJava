package java04_stu;
class SingleTone {
    private static SingleTone instance; 

    private SingleTone() {}

    public static SingleTone getInstance() {
        if(instance == null) {
            instance = new SingleTone();
        }
        return instance;
    }

    public void run() {
        System.out.println("실행");
    }
}
public class SingleToneEx {
    // 인스턴스가 오직 1개뿐인 클래스
    public static void main(String[] args) {
        // SingleTone st = new SingleTone();
        SingleTone st = SingleTone.getInstance(); // 클리스 이름으로 접근(Static)
        st.run();
    }
}
