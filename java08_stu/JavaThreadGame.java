package java08_stu;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Bullet extends JPanel implements Runnable {
	private Image backgroundImage;
	JLabel bullet;
	JLabel person;
	int x = 450, y = 320, w = 20, h = 250;
	int xs = 200, ys = 350, ws = 400, hs = 250;
	boolean fire = false;
	int score = 0;
	public JLabel scoreLal;
	
	public Bullet() {
		backgroundImage = new ImageIcon("java08_stu/background.png").getImage();
		bullet = new JLabel(new ImageIcon("java08_stu/bullet.png"));
		person = new JLabel(new ImageIcon("java08_stu/person.png"));

		setLayout(null);
		this.add(person);
		this.add(bullet);
		bullet.setBounds(x, y, w, h);
		person.setBounds(xs, ys, ws, hs);
		new Thread(this).start();

		scoreLal = new JLabel("SCORE [ 0 ]");
		scoreLal.setBounds(20, 20, 400, 40);
		scoreLal.setFont(new Font("고딕", Font.BOLD, 40));
		this.add(scoreLal);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000 / 60);
				if (fire) {
					y -= 20;
					if (y <= 0) {
						y = 550;
						fire = false;
					}
					bullet.setBounds(x, y, w, h);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void Score() {
		score++;
		scoreLal.setText("SCORE [ " + score + " ] ");
	}
}

public class JavaThreadGame extends JFrame implements Runnable, ActionListener {
	Container contentPane;
	int x = 50, y = 50, w = 150, h = 150; // 좌표, 가로, 세로
	JLabel bird;
	Bullet bullet = new Bullet();
	JButton fireBtn = new JButton("Fire");

	public JavaThreadGame() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// Font font = new Font("Times New Roman", Font.BOLD + Font.ITALIC, 40);

		contentPane = getContentPane();
		contentPane.setLayout(null);
		
		ImageIcon birdIcon = new ImageIcon("java08_stu/bird.gif");
		bird = new JLabel(birdIcon);
		bird.setBounds(x, y, w, h);
		// bird.setFont(font);

		contentPane.add(bird);
		contentPane.add(bullet);
		bullet.setBounds(0, 0, 800, 600);
		new Thread(this).start();

		contentPane.add(fireBtn);
		fireBtn.setBounds(0, 0, 800, 600);
		fireBtn.setBackground(Color.BLUE);
		fireBtn.addActionListener(this);
		setSize(800, 600);          
		setVisible(true);
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000 / 30);
				x += 10;
				if (x >= 750) {
					x = 50;
				}
				bird.setBounds(x, y, w, h);
				
				// 총과 새 좌표범위
				int bulletCentX = bullet.x + bullet.w / 2;
				int bulletCentY = bullet.y + bullet.h / 2;
				int birdCentX = x + w / 2;
				int birdCentY = y + h / 2;
				int range = (int) Math.sqrt(Math.pow(birdCentX - bulletCentX, 2) + Math.pow(birdCentY - bulletCentY, 2));
				
				// 명중 범위
				if (range <= 50) {
					bird.setIcon(new ImageIcon("java08_stu/bird.png"));
					bullet.fire = false;
					bullet.Score();
					bullet.fire = true;

				} else {
					bird.setIcon(new ImageIcon("java08_stu/bird.gif"));
					// bullet.fire = true;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new JavaThreadGame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		bullet.fire = true;
	}
}