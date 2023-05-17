package java07_stu;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Ch18Ex1 extends JFrame implements ActionListener {
    private JPanel contentPane = new JPanel(new BorderLayout());

    private JLabel lbl = new JLabel("[결과] 아무런 버튼도 눌리지 않았다.");
    private JButton btn1 = new JButton("버튼1");
    private JButton btn2 = new JButton("버튼2");
    private JPanel centerPane = new JPanel();
    private JPanel southPane = new JPanel();

    public Ch18Ex1() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(contentPane);

        contentPane.add(centerPane);
        contentPane.add(BorderLayout.SOUTH, southPane);
        
        centerPane.add(lbl);
        southPane.add(btn1);
        southPane.add(btn2);
        
        setSize(300,120);
        setVisible(true);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton target = (JButton)e.getSource();
            // System.out.println(target.getText() + "클릭했다.");

            if(target.equals(btn1)) {
                System.out.println("[결과] 첫번째 버튼 클릭");
            } else if(target.equals(btn2)) {
                System.out.println("[결과] 두번째 버튼 클릭");
            }
        }
    }

    public static void main(String[] args) {
        Ch18Ex1 frame = new Ch18Ex1();

        System.out.println(frame instanceof Ch18Ex1);
        System.out.println(frame instanceof JFrame);
        System.out.println(frame instanceof ActionListener);
    }
}
