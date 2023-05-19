package miniproject;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class MyAppTest1 extends JFrame {

    private Container contentPane;

    public MyAppTest1() {
        init();
        start();
    }

    public void init() {
        // 화면 레이아웃
        contentPane = getContentPane();
        contentPane.setBackground(Color.WHITE);
        set(640, 480);

        mkTbl();
    }

    private void mkTbl() {
        // 표 속성명 지정
        colNames = new Object[]{"idx","name","phone"};
        // 표 데이터 준비
        rowData = new Object[][]{
            {1, "KIM", '010-1111-1111'},
            {2, "LEE", '010-2222-2222'},
            {3, "CHO", '010-3333-3333'}
        }
        // 표 생성
        tableModel = new DefaultTableModel(rowData, colNames);
        table = new JTable(tableModel);
        scrollPane = new JScrollPane(table);
        

        // 표 내용 수정
    }

    public void start() {
        // 이벤트 핸들러
    }

    public static void main(String[] args) {
        new MyAppTest1();
    }
}
