package À¶ÇÅ±­oj;

import java.util.Scanner;

public class ½»»»easy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int [] arr = new int [n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scanner.nextInt();
			}
			for (int i = 0; i < m; i++) {
				int a = scanner.nextInt()-1;
				int b = scanner.nextInt()-1;
				int easy = arr[a];
				arr[a] = arr[b];
				arr[b] = easy;
			}
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		}
	}

}
