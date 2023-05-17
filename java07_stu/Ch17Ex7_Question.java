package java07_stu;

import java.awt.*;

import javax.swing.*;

public class Ch17Ex7_Question extends JFrame {
    private JPanel centerPanel = new JPanel(new GridBagLayout());
    private JPanel southPanel = new JPanel(new GridLayout(1, 3));
    private JPanel sPane = new JPanel(new GridLayout(2, 1));
    private JLabel lbl = new JLabel("Hello java Swing Project");
    private JButton btn1 = new JButton("<");
    private JButton btn2 = new JButton("[]");
    private JButton btn3 = new JButton("<<");
    private JButton btn4 = new JButton(">>");

    private Container content;

    public Ch17Ex7_Question() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        content = getContentPane();

        centerPanel.add(lbl);
        southPanel.add(btn1);
        southPanel.add(btn2);
        southPanel.add(sPane);
        sPane.add(btn3);
        sPane.add(btn4);

        content.setLayout(new BorderLayout());
        content.add(centerPanel);
        content.add(BorderLayout.SOUTH, southPanel);
        setSize(640, 480);
    }
    public static void main(String[] args) {
        new Ch17Ex7_Question().setVisible(true);
    }
}
