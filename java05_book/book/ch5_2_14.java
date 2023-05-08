package java05_book.book;

interface Shape {
    final double PI = 3.14;
    void draw();
    double getArea();
    default public void redraw() {
        System.out.print("--- 다시 그립니다. ");
        draw();
    }
}

class Circle implements Shape {
    private int size = 0;
    public Circle(int size){
        this.size = size;
    }

    @Override
    public void draw() {
        System.out.println("반지름이 " + size + "인 원입니다.");
    }

    @Override
    public double getArea() {
        double cal = size * size * PI;
        return cal;
    }
}

class Oval implements Shape {
    private int sizeX = 0;
    private int sizeY = 0;
    public Oval(int sizeX, int sizeY){
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }

    @Override
    public void draw() {
        System.out.println(sizeX + "x" + sizeY + " 에 내접하는 타원입니다.");
    }

    @Override
    public double getArea() {
        double cal = sizeX * sizeY * PI;
        return cal;
    }
}

class Rect implements Shape {
    private int sizeX = 0;
    private int sizeY = 0;
    public Rect(int sizeX, int sizeY){
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }

    @Override
    public void draw() {
        System.out.println(sizeX + "x" + sizeY + " 크기의 사각형");
    }

    @Override
    public double getArea() {
        double cal = sizeX * sizeY;
        return cal;
    }
}

public class ch5_2_14 {
    public static void main(String[] args) {
        Shape [] list = new Shape[3];
        list[0] = new Circle(10);
        list[1] = new Oval(20, 30);
        list[2] = new Rect(10, 40);

        for(int i = 0; i < list.length; i++) list[i].redraw();
        for(int i = 0; i < list.length; i++) System.out.println("면적은 " + list[i].getArea());
    }
}