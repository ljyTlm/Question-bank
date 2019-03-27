package À¶ÇÅ±­oj;

import java.util.Scanner;

public class ¼òµ¥¼ÆËãÆ÷ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String k = scanner.next();
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			switch (k) {
			case "+":
				System.out.println(a+b);
				break;
			case "-":
				System.out.println(a-b);
				break;
			case "*":
				System.out.println(a*b);
				break;
			default:
				System.out.println(a/b);
				break;
			}
		}
	}

}
