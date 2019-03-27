package ∫ºµÁoj;

import java.util.PriorityQueue;
import java.util.Scanner;

public class hdu3785øÏÀŸ≈≈–Ú {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			if (n == 0 && m == 0) {
				return;
			}
			PriorityQueue<Integer> list = new PriorityQueue<>();
			for (int i = 0; i < n; i++) {
				list.add(scanner.nextInt());
			}
			String sum = "";
			for (int i = 0; i < list.size() && i < m; i++) {
				sum = " "+list.poll()+sum;
			}
			System.out.println(sum.substring(1));
		}
	}

}
