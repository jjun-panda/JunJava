import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.math.*;

public class GamblingGame extends JFrame {
	private JLabel[] la = new JLabel[3];
	private JLabel sentence;

	public GamblingGame() {

		setTitle("Gambling Game");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		GamePanel gp = new GamePanel();
		gp.setLayout(null);
		setContentPane(gp);

		for (int i = 0; i < la.length; i++) {
			la[i] = new JLabel("0");
			la[i].setHorizontalAlignment(JLabel.CENTER);
			la[i].setBounds(50 + i * 80, 50, 60, 40);
			la[i].setOpaque(true);
			la[i].setBackground(Color.MAGENTA);
			la[i].setForeground(Color.YELLOW);
			Font font = new Font("Time", Font.BOLD + Font.ITALIC, 25);
			la[i].setFont(font);
			gp.add(la[i]);
		}

		sentence = new JLabel("시작합니다.");
		sentence.setBounds(125, 130, 100, 20);
		gp.add(sentence);
		gp.addKeyListener(new KeyListener());

		setSize(350, 250);
		setVisible(true);

		gp.setFocusable(true); // 포커스 설정
	}

	class GamePanel extends JPanel { // JPanel로 변경
		class MyKeyListener extends KeyAdapter {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyChar() == '\n') {
					int list[] = new int[3];
					for (int j = 0; j < la.length; j++) {
						int x = (int) (Math.random() * 5);
						la[j].setText(Integer.toString(x));
						list[j] = x;
					}
					if ((list[0] == list[1]) && (list[1] == list[2]))
						sentence.setText("축하합니다!!");
					else
						sentence.setText("아쉽군요");
				}
			}
		}
	}

	public static void main(String[] args) {
		new GamblingGame();
	}
}
