package java05_book.book.classA;

class Shape {
    public void draw() {
        System.out.println("Shape");
    }
}

class Circle extends Shape {
    public void paint() {
        draw();
    }
    public void draw() { 
        System.out.println("Circle");
    }
}