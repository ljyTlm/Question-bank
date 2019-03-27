package codeforces;
import java.util.Scanner;

public class A999 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			int [] arr = new int [n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scanner.nextInt();
			}
			int sum = 0;
			for (int i = 0; i < arr.length && arr[i] <= k; i++) {
				sum ++;
			}
			int v = sum;
			for (int i = arr.length-1; i > sum && arr[i] <= k; i--) {
				v++;
			}
			System.out.println(v);
		}
	}

}
