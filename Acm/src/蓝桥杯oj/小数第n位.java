package 蓝桥杯oj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 小数第n位 {

	private static int[] flag;
	private static int n;
	private static int sum;
	private static ArrayList<Long> yu;
	private static long b;
	private static int k;
	private static ArrayList<Integer> id;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		b = sc.nextLong();
		a %= b;
		int n = sc.nextInt();
		yu = new ArrayList<Long>();
		id = new ArrayList<Integer>();
		k = -1;
		String small = digui(a, "0");
		if (n <= k) {
			small += "000";
			System.out.println(small.substring(n, n+3));
		}else {
			int place = (n-k+1)%(small.length()-k);
			if (place == 0) {
				place = small.length()-k;
			}
			place --;
			small += small.substring(k) + small.substring(k);
			System.out.println(small.substring(k+place, k+place+3));
		}
	}

	private static String digui(long a, String str) {
		// TODO Auto-generated method stub
		if (a == 0) {
			k = str.length();
			return str+0;
		}
		for (int i = 0; i < yu.size(); i++) {
			if (yu.get(i) == a) {
				k = id.get(i);
				return str;
			}
		}
		yu.add(a);
		id.add(str.length());
		while (a*10 < b) {
			a *= 10;
			str += 0;
		}
		a *= 10;
		long num = a%b;
		return digui(num, str+(a/b));
	}


}
