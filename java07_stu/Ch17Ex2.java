package java07_stu;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Image;
import java.awt.TextComponent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ch17Ex2 extends MyFrame {

    public Ch17Ex2(String title, int width, int height) {
        super(title, width, height);
        setBackground(Color.orange);

        setLayout(null);
        Button btn = new Button("확인");
        Button btn2 = new Button("취소");
        this.add(btn);
        this.add(btn2);
        btn.setBounds(width/2-100, height/2-40, 200, 40);
        btn2.setBounds(width/2-100, height/2, 200, 40);


        Checkbox cb1 = new Checkbox("봄");
        Checkbox cb2 = new Checkbox("여름");
        Checkbox cb3 = new Checkbox("가을");
        Checkbox cb4 = new Checkbox("겨울");
        this.add(cb1);
        this.add(cb2);
        this.add(cb3);
        this.add(cb4);
        cb1.setBounds(width/2-200, height/2+0, 100, 20);
        cb2.setBounds(width/2-200, height/2+20, 100, 20);
        cb3.setBounds(width/2-200, height/2+40, 100, 20);
        cb4.setBounds(width/2-200, height/2+60, 100, 20);

        // TextComponent text1 = new TextComponent("Hello, I'm Coding!");
        // this.add(text1);
        // text1.setBounds(width/2, height/2+100, 100, 100);


        
    }
    public static void main(String[] args) {

        new Ch17Ex2("고객관리 시스템", 640, 480);
    }
}
