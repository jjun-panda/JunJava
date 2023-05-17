package java08_stu;

import java.awt.*;
import javax.swing.*;

class TimerRunnable implements Runnable{
    private JLabel timerLabel;

    public TimerRunnable(JLabel timerLabel) {
        this.timerLabel = timerLabel;
    }

    @Override
    public void run() {
        int n = 0;
        while(true) {
            timerLabel.setText(Integer.toString(n));
            n++;
            try {
                Thread.sleep(10); // 1s동안 잠을 깬다
            }
            catch(InterruptedException e) {
                return;
            }
        }
    }
}
public class Ch13Ex2ex extends JFrame {
    public Ch13Ex2ex() {
        setTitle("Threa를 상속 받은 타이머 스레드 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
        c.setBackground(new Color(0x0000cc09));
        c.add(timerLabel);

        
        TimerRunnable runnable = new TimerRunnable(timerLabel);
        Thread th = new Thread(runnable);

        setSize(300, 170);
        setVisible(true);

        th.start();
    }
    public static void main(String[] args) {
        new Ch13Ex2ex();
    }
}
    