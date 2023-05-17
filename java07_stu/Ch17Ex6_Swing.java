package java07_stu;

import java.awt.*;

import javax.swing.JFrame;

public class Ch17Ex6_Swing extends JFrame{
    private Container content = null;
    public Ch17Ex6_Swing(){
        // WindowClosing 이벤트 핸들러 효과
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // JFrame에는 기본 패널이 미리 붙어 있다.
        // 기본 팬을 가져와서 사용하거나 새로운 Panel을 만들어 붙일 수 있다.
        content = this.getContentPane();
        content.add(new Button("Button"));
    }
    public static void main(String[] args) {
        new Ch17Ex6_Swing().setVisible(true);
    }

}
