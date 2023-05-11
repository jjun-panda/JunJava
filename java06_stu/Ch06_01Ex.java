package java06_stu;

public class Ch06_01Ex {
    static void print(int ... nums) {
        System.out.println("nums.lenght: " + nums.length);
    }

    public static void main(String[] args) {
        print(10);
        print(20, 30);
        print(40, 50, 60);
        print(70, 80, 90, 100);

    }
}
