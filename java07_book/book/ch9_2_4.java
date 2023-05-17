package java07_book.book;

import java.awt.*;
import javax.swing.*;

public class ch9_2_4 extends JFrame {

	public ch9_2_4() {
		setTitle("BorderLayout Practice");
		setSize(600, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(1,10));
		
		for(int i = 0; i <10; i++) {
			Color [] colors = {new Color(0x00ff0000), new Color(0x00ff8c00), new Color(0x00ffff00), new Color(0x00008000), new Color(0x000000ff), new Color(0x004b0082), new Color(0x00800080), new Color(0x00888888), new Color(0x00ff69b4),new Color(0x00dddddd)};
			JButton bnt = new JButton(i + "");
			bnt.setOpaque(true);
			bnt.setBackground(colors[i]);
			c.add(bnt);
		}

		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ch9_2_4();
	}
}
