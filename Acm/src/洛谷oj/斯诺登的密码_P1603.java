package Âå¹Èoj;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Ë¹ÅµµÇµÄÃÜÂë_P1603 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> mp = new HashMap<>();
		String [] val = {"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty"};
		for (int i = 1; i < val.length; i++) {
			mp.put(val[i-1], i*i%100);
		}
		mp.put("a", 1);
		mp.put("another", 1);
		mp.put("first", 1);
		mp.put("both", 4);
		mp.put("second", 4);
		mp.put("third", 9);
		while (sc.hasNext()) {
			String [] str = new String [6];
			for (int i = 0; i < str.length; i++) {
				str[i] = sc.next();
				if (mp.get(str[i]) == null) {
					str[i] = "00";
				}else {
					int v = mp.get(str[i]);
					if (v < 10) {
						str[i] = "0"+v;
					}else {
						str[i] = ""+v;
					}
				}
			}
			Arrays.sort(str, new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					// TODO Auto-generated method stub
					String a = o1 + o2;
					String b = o2 + o1;
					return a.compareTo(b);
				}
			});
			String sum = "";
			for (int i = 0; i < str.length; i++) {
				sum += str[i];
			}
			System.out.println(Integer.parseInt(sum));
		}
	}

}
