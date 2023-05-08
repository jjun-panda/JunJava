package java05_book.book;

import java.util.Scanner;

interface Stack {
    int length();
    int capacity();
    String pop();
    boolean pusy(String cal);
}

public class StringStack implements Stack {
    Scanner sc = new Scanner(System.in);
    
    @Override
    public void length() {
        System.out.print("");
    }
    @Override
    public void capacity() {
        System.out.print("");
    }
    @Override
    public void pop() {
        System.out.print("");
    }
    @Override
    public void pusy() {
        System.out.print("");
    }
}

public class ch5_2_9 {
    public static void main(String[] args) {
        StringStack stack = new StringStack();
        stack.length();
        stack.capacity();
        stack.pop();
        stack.pusy();
    }
}