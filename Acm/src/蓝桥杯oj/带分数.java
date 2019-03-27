package À¶ÇÅ±­oj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class ´ø·ÖÊý {

	private static int[] flag;
	private static int n;
	private static int sum;
	private static ArrayList<Long> yu;
	private static long b;
	private static int k;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		b = sc.nextLong();
		a %= b;
		long n = sc.nextLong();
		yu = new ArrayList<Long>();
		k = -1;
		String small = digui(a, "");
		System.out.println(small);
	}

	private static String digui(long a, String str) {
		// TODO Auto-generated method stub
		if (a == 0) {
			Arrays.toString(yu.toArray());
			return str;
		}
		while (a*10 < b) {
			a *= 10;
			str += 0;
		}
		a *= 10;
		long num = a%b;
		for (int i = 0; i < yu.size(); i++) {
			if (num == yu.get(i)) {
				k = i;
				Arrays.toString(yu.toArray());
				return str;
			}
		}
		yu.add(num);
		return digui(num, str+(a/b));
	}

}
