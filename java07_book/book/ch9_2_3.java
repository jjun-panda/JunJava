package java07_book.book;

import java.awt.*;
import javax.swing.*;

public class ch9_2_3 extends JFrame {

	public ch9_2_3() {
		setTitle("BorderLayout Practice");
		setSize(600, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(1,10));
		
		for(int i = 0; i <10; i++) {
			c.add(new JButton(i + ""));
		}

		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ch9_2_3();
	}
}
