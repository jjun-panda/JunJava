package java08_stu;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class FlyingkeyEx extends JFrame {
	private final int FLYING_UNIT = 50;
	private JLabel la = new JLabel(new ImageIcon("java08_stu/person.png"));
	public FlyingkeyEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		c.addKeyListener(new Keybord());

		la.setSize(400,250);
		c.add(la);
		setSize(800,800);
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
	class Keybord extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();

			switch(keyCode) {
				case KeyEvent.VK_UP: 
					la.setLocation(la.getX(), la.getY()-FLYING_UNIT);
					break;
				case KeyEvent.VK_DOWN: 
					la.setLocation(la.getX(), la.getY()+FLYING_UNIT); 
					break;
				case KeyEvent.VK_LEFT: 
					la.setLocation(la.getX()-FLYING_UNIT, la.getY()); 
					break;
				case KeyEvent.VK_RIGHT: 
					la.setLocation(la.getX()+FLYING_UNIT, la.getY()); 
					break;
			}
		}
	}

	public static void main(String [] args) {
		new FlyingkeyEx();
	}
}
