package java08_stu;

import java.lang.annotation.Target;

public class Ch13Ex02 {
    public void run {
        System.out.println("Runnable : " + Thread.currentThread());
    }
    public static void main(String[] args) {
        Runnable tar = new Ch13Ex02();
        Thread th = new Thread(tar);
        Thread.start();
    }
}
