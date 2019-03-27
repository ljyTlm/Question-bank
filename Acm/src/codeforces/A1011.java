package codeforces;
import java.util.Arrays;
import java.util.Scanner;

public class A1011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			char [] str = scanner.next().toCharArray();
			Arrays.sort(str);
			int index = 0;
			k --;
			int sum = str[0] - 'a' + 1;
			for (int i = 1; i < str.length && k != 0; i++) {
				if (str[i] - str[index] > 1) {
					index = i;
					sum += str[i] - 'a' + 1;
					k --;
				}
			}
			System.out.println(k == 0 ? sum : -1);
		}
	}
}
