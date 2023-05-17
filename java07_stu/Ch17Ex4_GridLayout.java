package java07_stu;

import java.awt.*;

public class Ch17Ex4_GridLayout extends MyFrame{
    private GridLayout gridLayout = new GridLayout(3, 4, 5, 10); //3행 4열, 가로넓이 5, 세로넓이 10
    private static Button[] btns = new Button[12];
    static {
        for (int i = 0; i < btns.length; i++) {
            btns[i] = new Button("button"+i);
        }
    }

    public Ch17Ex4_GridLayout(String titie, int width, int height) {
        super(titie, width, height);
        setLayout(girdLayout);
        for (int i = 0; i < btns.length; i++) {
            add(btns[i]);
        }

        setVisible(true);
    }
    public static void main(String[] args) {
        new Ch17Ex4_GridLayout("GridLayout", 640, 480);
    }
}
