package À¶ÇÅ±­oj;

import java.util.Arrays;
import java.util.Scanner;

public class ËØÊýÅÐ¶Ï {

	private static boolean[] flag;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		flag = new boolean[9999999];
		ifNum();
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			System.out.println(flag[n]?"yes":"no");
		}
	}
	public static void ifNum() {
		Arrays.fill(flag, true);
		for (int i = 2; i*i < flag.length; i++) {
			if (flag[i]) {
				for (int j = i+i; j < flag.length; j+=i) {
					flag[j] = false;
				}
			}
		}
	}
	
}
