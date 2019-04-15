package Âå¹Èoj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class µ¹Ë®_P1582 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			long n = sc.nextLong();
			int k = sc.nextInt();
			ArrayList<Integer> list = new ArrayList<>();
			while (n > 0) {
				long v = n;
				long a = 1;
				int ans = 0;
				while (v > 1) {
					v /= 2;
					a *= 2;
					ans ++;
				}
				n -= a;
				list.add(ans);
			}
			//System.out.println(Arrays.toString(list.toArray()));
			if (list.size() <= k) {
				System.out.println(0);
			}else {
				int p = 0;
				if(list.get(list.size()-1) != 0) {
					list.add(0);
					p = 1;
				}
				int last = 1;
				for (int i = k; i < list.size(); i++) {
					last = last*((int)Math.pow(2, list.get(i-1)-list.get(i))) - 1;
				}
				//System.out.println(last);
				System.out.println(last+p);
			}
		}
	}

}
