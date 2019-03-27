package À¶ÇÅ±­oj;

import java.util.Arrays;
import java.util.Scanner;

public class ¿ìËÙÅÅĞò {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int [] arr = new int [n];
			for (int i = 0; i < n; i++) {
				arr[i] = scanner.nextInt();
			}
			Arrays.sort(arr);
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		}
	}

}
