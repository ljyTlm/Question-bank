package À¶ÇÅ±­oj;

import java.util.LinkedList;
import java.util.Scanner;

public class ¶ÓÁÐ²Ù×÷ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			LinkedList<Integer> queue = new LinkedList<>();
			for (int i = 0; i < n; i++) {
				int a = scanner.nextInt();
				switch (a) {
				case 1:
					int b = scanner.nextInt();
					queue.add(b);
					break;
				case 2:
					System.out.println(queue.size() == 0 ? "no" : queue.poll());
					break;
				case 3:
					System.out.println(queue.size());
					break;

				default:
					break;
				}
			}
		}
	}

}
