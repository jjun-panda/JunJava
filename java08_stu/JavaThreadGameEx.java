package java08_stu;

import java.awt.*;
import javax.swing.*;


public class JavaThreadGameEx extends JFrame implements Runnable {
	 Container contentPane;
	 int x=100, y=100, w=100, h=50; // 좌표, 가로, 세로
	 JLabel bird = new JLabel("뻐꾸기");

	 public JavaThreadGameEx() {
		  setDefaultCloseOperation(EXIT_ON_CLOSE);
		  Font font = new Font("Time", Font.BOLD + Font.ITALIC, 40);

		  contentPane = getContentPane();

		  contentPane.setLayout(null);
		  contentPane.add(bird);
		  bird.setBounds(x, y, w, h);
		  bird.setFont(font);

		  // JavaThreadGameEx target = new JavaThreadGameEx();
		  new Thread(this).start();

		  setSize(800, 600);
		  setVisible(true);
	 }

	 @Override
	 public void run() {
		  while (true) {
				try {
					 Thread.sleep(1000/30);
					 x += 10;
					 if(x > 750) {
						  x = 50;
					 }
					 bird.setBounds(x, y, w, h);
				} catch (InterruptedException e) {
					 e.printStackTrace();
				}
		  }
	 }
	 
	 public static void main(String[] args) {
		  new JavaThreadGameEx();
	 }
}
