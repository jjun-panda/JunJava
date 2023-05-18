package java09_stu;

import java.io.IOException;

public class Ch20Ex01 {
    public static void main(String[] args) {
        int data = 0;
        System.out.print("데이터를 입력하세요. \n끝내려면 [Ctrl or Control] + Z를 누르세요.\n>> ");
        try {
            while((data = System.in.read()) != -1)
            System.out.print((char)data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
