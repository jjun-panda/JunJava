package com.miniproject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class QuizProject extends JPanel{
    JFrame f;
    JLabel tite_M,tite_S, tite_MG;
    JLabel javaImg, pythonImg, designImg, comImg, htmlImg, cssImg;
    JLabel javaTxt, pythonTxt, designTxt, comTxt, htmlTxt, cssTxt;
    JLabel label5;
    JLabel label6;

    public QuizProject() {

        f = new JFrame("나도 IT전문가?!");
        f.setLayout(null);
        f.setSize(500, 500);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel backgroundPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Image backgroundImage = new ImageIcon("src/img/backgroundMain.png").getImage();
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        };
        backgroundPanel.setLayout(null);
        f.setContentPane(backgroundPanel);
        
        Font titeS = new Font("DungGeunMo", Font.PLAIN, 20); // 폰트 설정
        Font titeM = new Font("DungGeunMo", Font.ITALIC, 48); // 폰트 설정
        Font name = new Font("DungGeunMo", Font.PLAIN, 20); // 폰트 설정
        Color text = new Color(0x000000); // 폰트 색상 설정
        Color titMG = new Color(0x000000); // 폰트 색상 설정
        Color titM = new Color(0xFFFFFF); // 폰트 색상 설정
        Color titS = new Color(0xFFFFFF);   
        
        tite_M = new JLabel();
        tite_M.setBounds(20, 55, 400, 50);
        f.add(tite_M);
        tite_M.setFont(titeM);
        tite_M.setForeground(titM);
        tite_M.setText("{퀴즈} 풀어보자!");
        
        tite_MG = new JLabel();
        tite_MG.setBounds(24, 59, 400, 50);
        f.add(tite_MG);
        tite_MG.setFont(titeM);
        tite_MG.setForeground(titMG);
        tite_MG.setText("{퀴즈} 풀어보자!");
        
        tite_S = new JLabel();
        tite_S.setBounds(15, 9, 400, 20);
        f.add(tite_S);
        tite_S.setFont(titeS);
        tite_S.setForeground(titS);
        tite_S.setText("나도 IT전문가?!");

        // java        
        ImageIcon javaImage = new ImageIcon("src/img/java.png");
        javaImg = new JLabel(javaImage);
        javaImg.setBounds(35, 180, javaImage.getIconWidth(), javaImage.getIconHeight());
        javaImg.addMouseListener(new ClickListener("Java Quiz"));
        f.add(javaImg);
        javaTxt = new JLabel();
        javaTxt.setBounds(78, 272, 100, 20);
        f.add(javaTxt);
        javaTxt.setFont(name);
        javaTxt.setForeground(text);
        javaTxt.setText("JAVA");

        // python
        ImageIcon pythonImage = new ImageIcon("src/img/python.png");
        pythonImg = new JLabel(pythonImage);
        pythonImg.setBounds(185, 180, pythonImage.getIconWidth(), pythonImage.getIconHeight());
        pythonImg.addMouseListener(new ClickListener("Python Quiz"));
        f.add(pythonImg);
        javaTxt = new JLabel();
        javaTxt.setBounds(219, 272, 100, 20);
        f.add(javaTxt);
        javaTxt.setFont(name);
        javaTxt.setForeground(text);
        javaTxt.setText("Python");

        // design
        ImageIcon designImage = new ImageIcon("src/img/design.png");
        designImg = new JLabel(designImage);
        designImg.setBounds(335, 180, designImage.getIconWidth(), designImage.getIconHeight());
        designImg.addMouseListener(new ClickListener("design Quiz"));
        f.add(designImg);
        designTxt = new JLabel();
        designTxt.setBounds(353, 272, 100, 20);
        f.add(designTxt);
        designTxt.setFont(name);
        designTxt.setForeground(text);
        designTxt.setText("디자인상식");

        // computer
        ImageIcon comImage = new ImageIcon("src/img/com.png");
        comImg = new JLabel(comImage);
        comImg.setBounds(35, 322, comImage.getIconWidth(), comImage.getIconHeight());
        comImg.addMouseListener(new ClickListener("computer Quiz"));
        f.add(comImg);
        comTxt = new JLabel();
        comTxt.setBounds(53, 414, 100, 20);
        f.add(comTxt);
        comTxt.setFont(name);
        comTxt.setForeground(text);
        comTxt.setText("컴퓨터상식");

        // html
        ImageIcon htmlImage = new ImageIcon("src/img/html.png");
        htmlImg = new JLabel(htmlImage);
        htmlImg.setBounds(185, 322, htmlImage.getIconWidth(), htmlImage.getIconHeight());
        htmlImg.addMouseListener(new ClickListener("html Quiz"));
        f.add(htmlImg);
        htmlTxt = new JLabel();
        htmlTxt.setBounds(228, 414, 100, 20);
        f.add(htmlTxt);
        htmlTxt.setFont(name);
        htmlTxt.setForeground(text);
        htmlTxt.setText("HTML");

        // css
        ImageIcon cssImage = new ImageIcon("src/img/css.png");
        cssImg = new JLabel(cssImage);
        cssImg.setBounds(335, 322, cssImage.getIconWidth(), cssImage.getIconHeight());
        cssImg.addMouseListener(new ClickListener("css Quiz"));
        f.add(cssImg);
        cssTxt = new JLabel();
        cssTxt.setBounds(386, 414, 100, 20);
        f.add(cssTxt);
        cssTxt.setFont(name);
        cssTxt.setForeground(text);
        cssTxt.setText("CSS");
    }
    

    public static void main(String[] args) {
        new QuizProject();
    }

    private class ClickListener extends MouseAdapter {
        private String label;

        public ClickListener(String label) {
            this.label = label;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            String titName = "테스트 진행여부";
            if (label.equals("Java Quiz")) {
            	int result = JOptionPane.showOptionDialog(f, "자바 테스트 진행하시겠습니까?", titName, JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
            	if (result == JOptionPane.YES_OPTION) {
            	    JavaTest.main(new String[0]);
            	}
            } else if (label.equals("Python Quiz")) {
                int result = JOptionPane.showOptionDialog(f, "파이썬 테스트 진행하시겠습니까?", titName, JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
            	if (result == JOptionPane.YES_OPTION) {
            	    PythonTest.main(new String[0]);
            	}
            } else if (label.equals("design Quiz")) {
                int result = JOptionPane.showOptionDialog(f, "디자인상식 테스트 진행하시겠습니까?", titName, JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
            	if (result == JOptionPane.YES_OPTION) {
            	    DesignTest.main(new String[0]);
            	}
            } else if (label.equals("computer Quiz")) {
                int result = JOptionPane.showOptionDialog(f, "컴퓨터상식 테스트 진행하시겠습니까?", titName, JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
            	if (result == JOptionPane.YES_OPTION) {
            	    ComTest.main(new String[0]);
            	}
            } else if (label.equals("html Quiz")) {
                JOptionPane.showMessageDialog(f, "앗...! 준비중입니다.\n빠른 시일 내 출제하겠습니다.", titName, JOptionPane.PLAIN_MESSAGE);
            } else if (label.equals("css Quiz")) {
                JOptionPane.showMessageDialog(f, "앗...! 준비중입니다.\n빠른 시일 내 출제하겠습니다.", titName, JOptionPane.PLAIN_MESSAGE);
            }
        }
    }
}
