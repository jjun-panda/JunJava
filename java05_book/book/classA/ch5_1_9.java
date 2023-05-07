package java05_book.book.classA;

// 1번
abstract class A {
    abstract void f();
}

// 2번
abstract class B {
    void f() {
        System.out.println("~");
    };
}

// 3번
abstract class C {
    abstract void f();
}
abstract class D extends C {
}

// 4번
abstract class E {
    abstract int f();
}
class F extends E {
    int f() {
        System.out.println("~");
        return 0;
    }
}