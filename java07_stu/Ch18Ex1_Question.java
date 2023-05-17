package java07_stu;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Ch18Ex1_Question extends JFrame implements ActionListener {
    private JPanel centerPanel = new JPanel(new GridBagLayout());
    private JPanel southPanel = new JPanel(new GridLayout(1, 3));
    private JPanel sPane = new JPanel(new GridLayout(2, 1));
    private JLabel lbl = new JLabel("Hello java Swing Project");
    private JButton btn1 = new JButton("<");
    private JButton btn2 = new JButton("[]");
    private JButton btn3 = new JButton("<<");
    private JButton btn4 = new JButton(">>");

    private Container content;

    public Ch18Ex1_Question() {
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
        Font f = new Font("SF Compact Rounded", Font.BOLD, 40);
        Font f_body = new Font("SF Compact Rounded", Font.BOLD, 16);
        lbl.setFont(f);
        centerPanel.setBackground(new Color(0x0000c09f));
        southPanel.setBackground(new Color(0x0000c09f));
        sPane.setBackground(new Color(0x0000c09f));
        btn1.setFont(f_body);
        btn2.setFont(f_body);
        btn3.setFont(f_body);
        btn4.setFont(f_body);

        setSize(640, 480);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof JButton) {
            JButton target = (JButton)e.getSource();

            if(target.equals(btn1)) {
                // System.out.println("플레이");
                lbl.setText("플레이");
                btn1.setText("플레이");
                centerPanel.setBackground(new Color(0x0272727));
            } else if(target.equals(btn2)) {
                // System.out.println("스톱");
                lbl.setText("스톱");
                btn2.setText("스톱");
                btn1.setText("[]");
            } else if(target.equals(btn3)) {
                // System.out.println("뒤로 감기");
                lbl.setText("뒤로감기");
                btn3.setText("뒤로감기");
            } else if(target.equals(btn4)) {
                // System.out.println("빨리 감기");
                lbl.setText("빨리감기");
                btn4.setText("빨리감기");
                btn4.setBackground(new Color(255, 50, 255));
            }

            // if(target.)
        }
    }
    public static void main(String[] args) {
        new Ch18Ex1_Question().setVisible(true);


    }
}
