package java05_book.book.classA;

class A {
    private int a;
    public A() {}
    protected A(int i) {
        a = i;
    }
}
class B extends A {
    private int b;
    public B() {
        // super(1);
        b = 0;
    }
}