package java06_stu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class SetEx2 {
	public static void main(String[] args) {
		HashSet<Integer> lotto = new HashSet<Integer>();
		while (lotto.size()<6) {
			lotto.add((int)(Math.random() * 45) + 1);			
		}
		ArrayList<Integer> lottolist = new ArrayList<Integer>(lotto);
		Collections.sort(lottolist);
		System.out.println(lottolist);
	}
}
