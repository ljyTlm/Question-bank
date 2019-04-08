package 洛谷oj;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class 回文质数_P1217 {

	private static int n;
	private static int m;
	private static ArrayList<Long> list;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			n = sc.nextInt();
			m = sc.nextInt();
			list = new ArrayList<Long>();
			for (long i = 1; i <= 9; i++) {
				dfs(i);
			}
			list.sort(new Comparator<Long>() {

				@Override
				public int compare(Long o1, Long o2) {
					// TODO Auto-generated method stub
					return o1.compareTo(o2);
				}
			});
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		}
	}

	private static void dfs(long i) {
		// TODO Auto-generated method stub
		long a = i;
		long b = i;
		long c = i;
		int flag = 0;
		while (a > 0) {
			long yu = a%10;
			a /= 10;
			b *= 10;
			b += yu;
			if (flag > 0) {
				c *= 10;
				c += yu;
			}
			flag ++;
		}
		if (c > m) {
			return;
		}
		cheek(b);
		cheek(c);
		for (long j = 0; j <= 9; j++) {
			dfs(i*10+j);
		}
	}

	private static void cheek(long b) {
		// TODO Auto-generated method stub
		if (b >= n && b <= m) {
			for (long i = 2; i <= (long)Math.sqrt(b); i++) {
				if (b % i == 0) {
					return;
				}
			}
			list.add(b);
		}
	}

}
