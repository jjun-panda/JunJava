import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Bullet extends JPanel implements Runnable {
	// JLabel bullet = new JLabel("image.png");
	// image icon bird = new image("image.png");
	int x=400, y=500, w=60, h=50;
	boolean fire = false;
	
	public Bullet() {
		//setBackground(Color.yellow);
		setLayout(null);
		this.add(bullet);
		bullet.setBounds(x, y, w, h);
		
		new Thread(this).start();
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000/60);
				if(fire) {
					y -= 20;
					if(y <= 0) {
						y = 550;
						fire = false;
					}
					bullet.setBounds(x,y,w,h);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class gggg extends JFrame implements Runnable, ActionListener {
	Container contentPane;
	int x=50, y=50, w=60, h=50;
	JLabel bird = new JLabel("    ");
	Bullet bullet = new Bullet();
	JButton fireBtn = new JButton("Fire");
	
	public gggg() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(null);
		
		contentPane.add(bird);
		bird.setBounds(x,y,w,h);
		
		contentPane.add(bullet);
		bullet.setBounds(0, 0, 800, 600);
		
		new Thread(this).start();
		
		contentPane.add(fireBtn);
		fireBtn.setBounds(600, 400, 100, 100);
		
		fireBtn.addActionListener(this);
		
		setSize(800, 600);
		setVisible(true);
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000/30);
				x += 10;
				if(x >= 750) {
					x = 50;
				}
				bird.setBounds(x,y,w,h);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new gggg();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		bullet.fire = true;
	}

}