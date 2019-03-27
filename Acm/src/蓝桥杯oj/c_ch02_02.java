package À¶ÇÅ±­oj;

import java.util.Scanner;

public class c_ch02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			String does = scanner.next();
			switch (does) {
			case "+":
				System.out.println(n+m);
				break;
			case "-":
				System.out.println(n-m);
				break;
			case "*":
				System.out.println(n*m);
				break;
			case "/":
				System.out.println(n/m);
				break;
			default:
				System.out.println(n%m);
				break;
			}
		}
	}

}
