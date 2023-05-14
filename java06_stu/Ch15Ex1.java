package java06_stu;

import java.util.ArrayList;
import java.util.Collections;

class Saram implements Comparable<Saram> {
	private int seq;
	private String id;
	private String name;
	private String email;
	private int nai;
	
	public Saram() {
		this(0, "","","");
	}
	
	public Saram(int seq) {
		this(seq, "", "", "");
	}

	public int getNai() {
		return nai;
	}

	public void setNai(int nai) {
		this.nai = nai;
	}

	public Saram(String id, String name, String email) {
		this(0, id, name, email);
	}
	public Saram(int seq, String id, String name, String email) {
		this.seq = seq;
		this.id = id;
		this.name = name;
		this.email = email;
	}
	public Saram(int seq, String id, String name, String email, int nai) {
		this.seq = seq;
		this.id = id;
		this.name = name;
		this.email = email;
		this.nai = nai;
	}
	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return String.format("{\"seq\":%d,\"id\":\"%s\",\"name\":\"%s\",\"email\":\"%s\",\"nai\":\"%d\"}", seq, id, name, email, nai);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + seq;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Saram) {
			Saram saram = (Saram)obj;
			if(saram.seq == this.seq) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int compareTo(Saram o) {
		if(this.name.compareToIgnoreCase(o.getName()) > 0) {
			return 1;
		} else if(this.name.compareToIgnoreCase(o.getName()) < 0) {
			return -1;
		}
		return 0;
	}
}

public class Ch15Ex1 {
	public static void main(String[] args) {
		ArrayList<Saram> saramList = new ArrayList<Saram>();
		saramList.add(new Saram(101, "Kim1", "김길동1", "kim1@saram.com", 45));
		saramList.add(new Saram(102, "Kim2", "김길동2", "kim2@saram.com", 27));
		saramList.add(new Saram(103, "Kim3", "김길동3", "kim3@saram.com", 30));
		saramList.add(new Saram(104, "Kim4", "김길동4", "kim4@saram.com", 25));
		saramList.add(new Saram(105, "Kim5", "김길동5", "kim5@saram.com", 40));

		int seq = 104;
		int findIdx = saramList.indexOf(new Saram(seq));
		
		System.out.println(String.format("seq가 %d인 요소는 %d번째 index이다.", seq, findIdx));
        System.out.println(saramList.get(findIdx));

		// Collections.sort(saramList, new Comparator<Saram>() {
		// 	@Override
		// 	public int compare(Saram o1, Saram o2) {
		// 		if(o1.getNai() > o2.getNai()) {
		// 			return 1;
		// 		} else if(o1.getNai() < o2.getNai()) {
		// 			return -1;
		// 		}
		// 		return 0;
		// 	}
		// });
		Collections.sort(saramList);
        for(Saram saram : saramList) {
            System.out.println(saram);
        }
	}

	public static void test(String[] args) {
		Saram saram1 = new Saram(1, "Kim", "김길동", "kim@saram.com");
		Saram saram2 = new Saram(2, "Kim", "김길동", "kim@saram.com");

		if(saram1.equals(saram2)) {
			System.out.println("같은 객체입니다.");
		} else {
			System.out.println("같은 객체가 아닙니다.");
		}
	}

}