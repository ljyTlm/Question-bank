package À¶ÇÅ±­oj;

import java.util.Scanner;

public class ¸´ÊýÇóºÍ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int a = 0;
			int b = 0;
			for (int i = 0; i < n; i++) {
				a += scanner.nextInt();
				b += scanner.nextInt();
			}
			System.out.println(a+"+"+b+"i");
		}
	}

}
