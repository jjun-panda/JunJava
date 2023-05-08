package java04_book.book.quiz;

// class Person {
//     private int age;

//     public int getAge() {
//         return age;
//     }

//     public void getAge(int getAge) {
//         this.age = age;
//     }
// }

// public class Example {
//     public static void main(String[] args) {
//         Person aPerson = new Person();
//         aPerson.getAge(17);
//     }
// }

class Person {
    private int age;

    public setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class ch04_7 {
    public static void main(String[] args) {
        Person aPerson = new Person();
        aPerson.setAge(17);
    }
}
