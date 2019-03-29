package 洛谷oj;

import java.util.PriorityQueue;
import java.util.Scanner;

public class 合并果子_P1090 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			long sum = 0;
			PriorityQueue<Long> qu = new PriorityQueue<>();
			for (int i = 0; i < n; i++) {
				qu.add(sc.nextLong());
			}
			while (qu.size() != 1) {
				long a = qu.poll();
				long b = qu.poll();
				sum += a+b;
				qu.add(a+b);
			}
			System.out.println(sum);
		}
	}

}
