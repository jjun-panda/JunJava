package java11_stu;

import java.awt.*;
import javax.swing.*;

public class Ch19Ex01 extends JFrame{
    Container contentPane;

    public Ch19Ex01() {
        contentPane = getContentPane();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setSize(new Dimension(800, 600));
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        String str = "Hello Java GUI World!";
        int x = 100, y = 100;
        g.setColor(new Color(0x00330033));
        // g.setColor(Color.RED);
        Font font = new Font("Helvetica", Font.BOLD, 36);
        g.setFont(font);

        g.drawRect(100, 100, 200, 200);
        g.drawString(str, x, y);
    }

    public static void main(String[] args) {
        new Ch19Ex01().setVisible(true);
    }
}
