package java06_stu;

import java.util.HashMap;
import java.util.Iterator;

public class Ch16Ex1 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("김길동", "010-1111-1111");
		map.put("홍길동", "010-2222-2222");
		map.put("박길동", "010-3333-6666");
		map.put("이길동", "010-4444-6666");
		map.put("정길동", "010-5555-6666");

		Iterator<String> keys = map.keySet().iterator();
		while (keys.hasNext()) {
			String key = keys.next();
			System.out.println(key + " : "+map.get(key));
		}
	}
}
