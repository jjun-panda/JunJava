package kame.ch16.ex04;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBookApp {
   public static void main(String[] args) {
      
      HashMap<String, Object> saram1 = new HashMap<String, Object>();
      saram1.put("no", 1);
      saram1.put("name", "홍길동");
      saram1.put("phone", "010-1234-5678");
      saram1.put("email", "hong@saram.com");
      
      HashMap<String, Object> saram2 = new HashMap<String, Object>();
      saram1.put("no", 2);
      saram1.put("name", "김길동");
      saram1.put("phone", "010-1234-5555");
      saram1.put("email", "kim@saram.com");
      
      HashMap<String, Object> saram3 = new HashMap<String, Object>();
      saram1.put("no", 3);
      saram1.put("name", "박길동");
      saram1.put("phone", "010-1234-6666");
      saram1.put("email", "park@saram.com");
      
      ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String,Object>>();
      list.add(saram1);
      list.add(saram2);
      list.add(saram3);
       
      // [{},{},{}]
      // 자바 컬렉션을 최대한 활용한다.
      // if문이 switch문 같은 제어문은 최대한 자제한다.
      // 반복문도 가급적이면 Iterator, Enumeration으로 사용.
      // TodoList 또는 주속록 구현 해서 까페에 제출.
      // 숙제 제출 한 사람에게는 커피 선물
      // 부정행위 적발시 커피값 벌금(다른 사람 커피 사 줌)
      // 모르는걸 물어봐서 도움 받는것은 허용.
   }
}