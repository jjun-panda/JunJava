package java09_stu;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Ch20Ex07 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file = new File("/Users/jjun/Downloads/bankbook.pdf");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Member readMem = (Member) ois.readObject();
		System.out.println(readMem);
		
		ois.close();
		fis.close();
	}
	
	public static void testObjetOutput(String[] args) throws IOException {
		Member member = new Member("Hong", "Gildong", 23);
		
		File file = new File("/Users/jjun/Downloads/bankbook.pdf");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(member);
		
		oos.close();
		fos.close();
		
		System.out.println("객체를 파일에 기록 완료!");
	}

}