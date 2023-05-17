package java08_stu;

abstract class moter {
    String name;
    void start() {
        System.out.println(name + "ON! Start!");
        run();
        System.out.println(name + "OFF!");
    }

    abstract void run();
}

class 오토바이 extends moter {
    @Override
    void run() {
        super.name = "오토바이";
        System.out.println("오토바이가 두바퀴로 달린다!");
    }
}
class 스포츠카 extends moter {
    @Override
    void run() {
        super.name = "스포츠카";
        System.out.println("스포츠카가 네바퀴로 달린다!");
    }
}

public class TemplatrMethodEx {
    public static void main(String[] args) {
        moter bike = new 오토바이();
        bike.start();

        moter car = new 스포츠카();
        car.start();
    }
}
