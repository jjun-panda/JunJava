package java07_book.book.quiz;

import java.awt.*;
import javax.swing.*;

public class MyFrame_2 extends JFrame {
    public MyFrame_2() {
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.setBackground(Color.yellow);
        contentPane.add(new JButton("click"));
        setSize(300, 300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new MyFrame_2();
    }
}
