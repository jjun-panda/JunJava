package java06_book;

import java.util.Scanner;
 
class Player{
    Scanner inputword = new Scanner(System.in);
    public String name; // 게임 참가자 이름 필드
    public String wordin;
    
    
    public String sayWord() { // 사용자로부터 단어를 입력받는 메소드
        wordin = inputword.next(); 
        return wordin;
    }
    
    public boolean succeed(char lastChar) { 
        if (lastChar == wordin.charAt(0)) return true;
        else return false;
    }
}

public class JavaTest {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String word = "아버지"; //프로그램에서 첫 단어 설정해주기
            
            System.out.println("게임에 참가하는 인원은 몇명입니까? >> ");
            int number = scanner.nextInt();
            
            Player[] play = new Player[number];
            
            for(int i=0; i<number; i++) {
                System.out.println("참가자의 이름을 입력하세요 >> ");
                play[i] = new Player(); // 이 코드 없으면 Nullpointexception
                play[i].name = scanner.next();
                //입력받은 이름을 Player 배열의 이름 필드에 각각 저장하는 코드
            }
            System.out.println("시작하는 단어는 아버지입니다.");
            
            int i = 0, j = 0;
            while(true) {
                j = i % number; //끝말잇기가 한 텀에 끝나지 않을 수도 있음
                int lastIndex = word.length()-1; //마지막 문자에 대한 인덱스
                char lastChar = word.charAt(lastIndex); //마지막 문자
                
                System.out.println(play[j].name + " >> ");
                play[j].sayWord(); // 사용자의 단어 입력 받기
                boolean continuing = play[j].succeed(lastChar);
                if(continuing == false) {
                    System.out.println(play[j].name + "이 졌습니다.");
                    break;
                }
                word = play[j].wordin;
                i++;
            }
        }
    }
}
