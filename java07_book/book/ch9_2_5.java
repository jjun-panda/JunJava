package java07_book.book;

import java.awt.*;
import javax.swing.*;

public class ch9_2_5 extends JFrame {

	public ch9_2_5() {
		setTitle("4x4 Color Frame");
		setSize(600, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(4, 4));
		
		for(int i = 0; i <16; i++) {
			Color [] colors = {new Color(0x00ff0000), new Color(0x00ff8c00), new Color(0x00ffff00), new Color(0x00008000), new Color(0x000000ff), new Color(0x004b0082), new Color(0x00800080), new Color(0x00888888), new Color(0x00ff69b4),new Color(0x00dddddd), new Color(0x00FFFFFF), new Color(0x00000000), new Color(0x00663300),new Color(0x00FFCC00), new Color(0x00330099),new Color(0x00990099)};			
			JLabel lal = new JLabel(i + "");
			lal.setBackground(colors[i]);
			lal.setOpaque(true);
			c.add(lal);
		}

		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ch9_2_5();
	}
}
