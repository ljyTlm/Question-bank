package codeforces;
import java.util.Scanner;

public class B978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			String str = scanner.next();
			int num = 0;
			int sum = 0;
			for (int i = 0; i < n; i++) {
				if (str.charAt(i) == 'x') {
					num ++;
				}else {
					if (num > 2) {
						sum += num-2;
					}
					num = 0;
				}
			}
			if (num > 2) {
				sum += num -2;
			}
			System.out.println(sum);
		}
	}

}