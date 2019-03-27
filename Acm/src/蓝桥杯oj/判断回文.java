package À¶ÇÅ±­oj;

import java.util.Scanner;

public class ÅÐ¶Ï»ØÎÄ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String a = scanner.next();
			String b = new StringBuilder(a).reverse().toString();
			System.out.println(a.equals(b)?"yes!":"no!");
		}
	}

}
