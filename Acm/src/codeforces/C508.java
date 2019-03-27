package codeforces;
import java.util.LinkedList;
import java.util.Scanner;

public class C508 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int t = scanner.nextInt();
			int r = scanner.nextInt();
			LinkedList<Integer> queue = new LinkedList<>();
			int sum = 0;
			for (int i = 0; i < n; i++) {
				int ghost = scanner.nextInt();
				if (sum == -1) {
					continue;
				}
				while (!queue.isEmpty() && queue.peek()+t <= ghost) {
					queue.poll();
				}
				int num = r - queue.size();
				if (num > 0) {
					sum += num;
					for (int j = 1; j <= num; j++) {
						int a = ghost - num;
						if (a+j+t <= ghost) {
							sum = -1;
							break;
						}
						queue.add(a+j);
					}
				}
			}
			System.out.println(sum);
		}
	}

}
