package java04_book.book;

import java.util.Scanner;

class Phone {
    private String name;
    private String tel;

    public Phone(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }
    public String getName() {
        return name;
    }
    public String getTel() {
        return tel;
    }
}

class PhoneBook {
    Scanner sc = new Scanner(System.in);
    int num;
    Phone phone[];
    String name;
    String tel;

    public void getNum() {
        System.out.print("인원수>> ");
        num = sc.nextInt();
        phone = new Phone[num];
    }

    public void getInfo() {
        for(int i = 0; i < num; i++){
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸입력)>> ");
            name = sc.next();
            tel = sc.next();
            phone[i] = new Phone(name, tel);
        }
        System.out.println(">> 저장되었습니다...");
    }

    public void Search() {
        System.out.println("tel11: " + tel);
        boolean state = false;
        while(true){
            System.out.print("검색할 이름>> ");
            name = sc.next();
            if(name.equals("그만")){
                break;
            }
            System.out.println("tel22: " + tel);
            for(int i=0; i<num; i++){
                
                if(name.equals(phone[i].getName())) {
                    System.out.println(">> \"" + name + "\"의 번호는 \"" + tel + "\"입니다.");
                }
                state = true;
            }
            if(state == false) {
                System.out.println(">> \"" + name+"\"이 없습니다.");
            }
        }
    }
}

public  class ch4_1_8 {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        pb.getNum();
        pb.getInfo();
        pb.Search();
    }
}
