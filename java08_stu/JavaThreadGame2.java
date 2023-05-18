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

		Container c = getContentPane();
		c.setLayout(null);
		c.addKeyListener(new Keybord());

		person.setLocation(50,50);
		person.setSize(100,20);
		c.add(person);
		setSize(300,300);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();

		c.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Component com = (Component)e.getSource();
				com.setFocusable(true);
				com.requestFocus();
			}
		});
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

public class JavaThreadGame2 extends JFrame implements Runnable, ActionListener {

	private final int FLYING_UNIT = 10;
	private JLabel person = new JLabel("HELLO"); 

	Container contentPane;
	int x = 50, y = 50, w = 150, h = 150; // 좌표, 가로, 세로
	JLabel bird;
	Bullet bullet = new Bullet();
	JButton fireBtn = new JButton("Fire");

	public JavaThreadGame2() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// Font font = new Font("Times New Roman", Font.BOLD + Font.ITALIC, 40);

		contentPane = getContentPane();
		contentPane.setLayout(null);
		
		ImageIcon birdIcon = new ImageIcon("java08_stu/bird.gif");
		bird = new JLabel(birdIcon);
		bird.setBounds(x, y, w, h);
		// bird.setFont(font);
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

	class Keybord extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();

			switch(keyCode) {
				case KeyEvent.VK_LEFT: 
					person.setLocation(person.getX()-FLYING_UNIT, person.getY()); 
					break;
				case KeyEvent.VK_RIGHT: 
					person.setLocation(person.getX()+FLYING_UNIT, person.getY()); 
					break;
			}
		}
	}

	
	public static void main(String[] args) {
		new JavaThreadGame2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		bullet.fire = true;
	}
}