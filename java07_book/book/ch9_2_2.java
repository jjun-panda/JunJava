package java07_book.book;

import java.awt.*;
import javax.swing.*;

public class ch9_2_2 extends JFrame {

	public ch9_2_2() {
		setTitle("BorderLayout Practice");
		setSize(600, 300);
		Container c = getContentPane();
		c.setLayout(new BorderLayout(5,7));
		
		c.add(new JButton("North"), BorderLayout.NORTH);
		c.add(new JButton("West"), BorderLayout.WEST);
		c.add(new JButton("Center"), BorderLayout.CENTER);
		c.add(new JButton("East"), BorderLayout.EAST);
		c.add(new JButton("South"), BorderLayout.SOUTH);

		setVisible(true);
	}
	public static void main(String[] args) {
		new ch9_2_2();
	}
}
