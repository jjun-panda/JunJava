package com.miniproject;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;


public class DesignTest extends JPanel implements ActionListener {
    JFrame f;
    JLabel l, tite_M, text_S;
    JButton bnt1, bnt2;
    ButtonGroup bg;
    JRadioButton[] r = new JRadioButton[4];
    int current = 0; // 현재 문제 인덱스
    int score = 0; // 점수

    private static final String DB_URL = "jdbc:mysql://localhost:3306/jjun";
    private static final String DB_ID = "jjun";
    private static final String DB_PW = "1234";

    private static final String SELECT_QUESTIONS_QUERY = "SELECT * FROM designquiz";
    private static final int NUM_QUESTIONS = 10;

    private String[][] questions;

    public void quizDB() {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_ID, DB_PW);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SELECT_QUESTIONS_QUERY)) {

            questions = new String[NUM_QUESTIONS][6];

            int count = 0;
            while (rs.next() && count < NUM_QUESTIONS) {
                questions[count][0] = rs.getString("question");
                questions[count][1] = rs.getString("option1");
                questions[count][2] = rs.getString("option2");
                questions[count][3] = rs.getString("option3");
                questions[count][4] = rs.getString("option4");
                questions[count][5] = rs.getString("correctAnswer");
                count++;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    DesignTest() {
        GUI();
        addComponents();
        quizDB();
        setLabel();
    }

    public void GUI() {
        f = new JFrame();
        f.setTitle("design Test");
        f.setLayout(null);
        f.setSize(500, 500);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // 현재 페이지만 닫도록 설정

        JPanel backgroundPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Image backgroundImage = new ImageIcon("src/img/backgroundTest.png").getImage();
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        };
        backgroundPanel.setLayout(null);
        f.setContentPane(backgroundPanel);
    }

    public void addComponents() {

        Font fontM = new Font("DungGeunMo", Font.PLAIN, 32);
        Font fontS = new Font("DungGeunMo", Font.PLAIN, 22);
        Font titeM = new Font("DungGeunMo", Font.PLAIN, 20);
        Font textS = new Font("DungGeunMo", Font.PLAIN, 16);
        Font fontBnt = new Font("DungGeunMo", Font.PLAIN, 20);
        Color fontColorM = new Color(0x000000);
        Color fontColorS = new Color(0x333333);
        Color titM = new Color(0xFFFFFF);
        Color txtS = new Color(0x777777);
        Color fontColorBnt_B = new Color(0xBBBBBB);
        Color fontColorBnt_F = new Color(0x000000);
        
        // 문제
        l = new JLabel();
        l.setBounds(35, 80, 460, 32);
        f.add(l);
        l.setFont(fontM);
        l.setForeground(fontColorM);

        // 창 제목
        tite_M = new JLabel();
        tite_M.setBounds(30, 25, 400, 20);
        f.add(tite_M);
        tite_M.setFont(titeM);
        tite_M.setForeground(titM);
        tite_M.setText("디자인상식 테스트");        
        
        // 주의사항
        text_S = new JLabel();
        text_S.setBounds(50, 350, 400, 16);
        f.add(text_S);
        text_S.setFont(textS);
        text_S.setForeground(txtS);
        text_S.setText("주의! 한번 푼 문제는 이전으로 되돌릴 수 없습니다.");
        
        // 버튼
        bnt1 = new JButton("다음문제");
        bnt1.setBackground(fontColorBnt_B);
        bnt1.setForeground(fontColorBnt_F);
        bnt1.setFont(fontBnt);
        bnt1.setBounds((f.getWidth() - 200) / 2 - 110, 390, 200, 60);
        f.add(bnt1);

        bnt2 = new JButton("결과보기");
        bnt2.setBackground(fontColorBnt_B);
        bnt2.setForeground(fontColorBnt_F);
        bnt2.setFont(fontBnt);
        bnt2.setBounds((f.getWidth() - 200) / 2 + 110, 390, 200, 60);
        bnt2.setEnabled(false);
        f.add(bnt2);

        // 답 선택지
        bg = new ButtonGroup();
        for (int i = 0; i < 4; i++) {
            r[i] = new JRadioButton();
            f.add(r[i]);
            bg.add(r[i]);
            r[i].setFont(fontS);
            r[i].setForeground(fontColorS);
        }
        r[0].setBounds(50, 150, 420, 22);
        r[1].setBounds(50, 195, 420, 22);
        r[2].setBounds(50, 240, 420, 22);
        r[3].setBounds(50, 285, 420, 22);

        bnt1.addActionListener(this);
        bnt2.addActionListener(this);

        f.setVisible(true);
    }

    public void setLabel() {
        if (current >= questions.length) {
            l.setText("더 이상 문제가 없어요!");
            bnt1.setEnabled(false);
            bnt2.setEnabled(true);
            for (int i = 0; i < 4; i++) {
                r[i].setVisible(false);
            }
            return;
        }
        
        l.setText("Q" + (current + 1) + "." + questions[current][0]);
        for (int i = 0; i < 4; i++) {
            r[i].setText(questions[current][i + 1]);
            r[i].setSelected(false);
            r[i].setVisible(true);
        }
    }

    public void check() {
        if (current >= questions.length) {
            return;
        }
        
        // 문제 연속 진행
        for (int i = 0; i < 4; i++) {
            if (r[i].isSelected()) {
                if (r[i].getText().equals(questions[current][5])) {
                    score++;
                }
                break;
            }
        }
        
        current++;
        
        // 마지막 문제 완료 시
        if (current >= questions.length) {
            l.setText("퀴즈완료! 결과 확인하세요:)");
            bnt1.setEnabled(false);
            bnt2.setEnabled(true);
            for (int i = 0; i < 4; i++) {
                r[i].setVisible(false);
            }
        } else {
            setLabel();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int total = score * 10;
        Icon icon = null;
        int result;
        String message = "";
        if (e.getSource() == bnt1) {
            check();
            // 마지막문제 도달 시
            if (current == questions.length) {
                bnt1.setEnabled(false);
                bnt2.setText("결과보기");
                bnt2.setEnabled(true);
            }
        } else if (e.getSource() == bnt2) {
            Object[] options = { "종료", "다시풀기" };
            if (total == 100) {
                message = "와우! 넌 천재야!";
                icon = new ImageIcon("src/img/100.gif");
            } else if (total >= 80) {
                message = "훌륭한 지식을 가지고 있군요!";
                icon = new ImageIcon("src/img/80.gif");
            } else if (total >= 50) {
                message = "어느정도 지식을 가지고 있군요!";
                icon = new ImageIcon("src/img/50.gif");
            } else if (total < 50 && total > 0) {
                message = "처음부터 다.시.공.부.해!";
                icon = new ImageIcon("src/img/30.gif");
            } else if (total == 0) {
                message = "안돼! 가방싸고 퇴학해!";
                icon = new ImageIcon("src/img/0.gif");
            } 
            result = JOptionPane.showOptionDialog(f, "당신의 점수는 " + total + "점 입니다.\n" + message, "테스트 결과",
            		JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options[0]);
            
            if (result == JOptionPane.YES_OPTION) {
                f.dispose();
            } else {
                current = 0;
                score = 0;
                bnt1.setEnabled(true);
                bnt2.setEnabled(false);
                setLabel();
                for (int i = 0; i < 4; i++) {
                    r[i].setVisible(true);
                }
            }
        }
    }

    public static void main(String[] args) {
        new DesignTest();
    }
}
