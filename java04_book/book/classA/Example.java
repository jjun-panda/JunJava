package java04_book.book.classA;

class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void getAge(int getAge) {
        this.age = age;
    }
}

public class Example {
    public static void main(String[] args) {
        Person aPerson = new Person();
        aPerson.getAge(17);
    }
}

