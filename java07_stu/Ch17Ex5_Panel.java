package java07_stu;

import java.awt.*;

public class Ch17Ex5_Panel extends MyFrame {
    private Panel centerPanel = new Panel(new GridBagLayout());
    private Panel southPanel = new Panel(new GridLayout(2, 3));

    private Button btn1 = new Button("<<");
    private Button btn2 = new Button("<");
    private Button btn3 = new Button(">>");
    private Button btn4 = new Button("[]");
    private Label lbl = new Label("Hello java swing world!");

    public Ch17Ex5_Panel(String title, int width, int height) {
        super(title, width, height);
        centerPanel.add(lbl);
        southPanel.add(btn1);
        southPanel.add(btn2);
        southPanel.add(btn3);
        southPanel.add(btn4);

        add(centerPanel);
        add(BorderLayout.SOUTH, southPanel);


    }
    
    public static void main(String[] args) {
        new Ch17Ex5_Panel("Panel", 640, 480);
    }
}
