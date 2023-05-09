package java05_book.CH09;

import java.util.Scanner;

interface Stack {
    int length();
    int capacity();
    String pop();
    boolean pusy(String val);
}