package java06_stu;

import java.util.Hashtable;
import java.util.Scanner;

public class Ch06_Challenge {
    static String readingString() {
		StringBuffer sb = new StringBuffer();
		System.out.print("입력 >> ");
        Scanner scan = new Scanner(System.in);
		
		while(true) {
			String line = scan.nextLine();
			if(line.equals(";")) {
				break;
			}
			sb.append(line);
		}
		return sb.toString();
	}
	public static void main(String[] args) {
        Hashtable<String, String> histo = new Hashtable<String, String>();
		String res = readingString().toUpperCase();
		
		for(int i=0; i<='Z'-65; i++) {
			String key = "" + (char)(i+65);
			histo.put(key, "");
		}
		
		for(int i=0; i<res.length(); i++) {
			String key = res.charAt(i)+"";
			histo.put(key, histo.get(key)+"-");
		}
		
		for(int i=0; i<='Z'-65; i++) {
			String key = "" + (char)(i+65);
			System.out.println(key + ":" + histo.get(key));
		}
	}
}
