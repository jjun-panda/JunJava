package java07_stu;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {
    public MyFrame() {
        this("no-title", 320, 240);
    }

    public MyFrame(int width, int height) {
        this("no-title", width, height);
    }

    public MyFrame(String title, int width, int height) {
        setTitle(title);
        setSize(width, height);
        setVisible(true);
        setBackground(Color.orange);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        // new MyFrame();
        // new MyFrame(640, 480);
        new MyFrame("테트리스 게임", 800, 600);
    }
}
