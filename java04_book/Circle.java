package java04_book;

public class Circle {
    int radius;  // 원의 반지름
    String name; // 원의 이름

    public Circle() {}; // Circle 클래스 생성자

    public double getArea() {
        return 3.14*radius*radius;
    }
    public static void main(String[] args) {
        Circle pizza;
        pizza = new Circle();
        pizza.radius = 10;
        pizza.name = "자바피자";
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은" +area);

        Circle dount = new Circle();
        dount.radius = 2;
        dount.name = "자바도넛";
        area = dount.getArea();
        System.out.println(dount.name + "의 면적은" +area);

    }
}
