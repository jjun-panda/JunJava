package java07_stu;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;

public class Ch17Ex3_layout extends MyFrame{
    private Button btn01 = new Button("FirestButton");
    private static Button[] btns = new Button[100];
    static {
        // static 초기화 블럭
        // 생성자 보다 먼저 실행 된다.
        for (int i = 0; i < btns.length; i++) {
            btns[i] = new Button("Button"+i);
        }
    }


    public Ch17Ex3_layout(int width, int height) {
        super("플로우 레이아웃", width, height);

        // Frame의 기본 배치관리자는 BorderLayout이다.@interface
        // FlowLayout으로 변경.
        setLayout(new FlowLayout());
        add(btn01, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new Ch17Ex3_layout(640, 480);
    }
}
