package 蓝桥杯oj;

import java.util.Arrays;
import java.util.Scanner;

public class 打水问题 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int [] data = new int [n];
			for (int i = 0; i < data.length; i++) {
				data[i] = scanner.nextInt();
			}
			Arrays.sort(data);
			int sum = 0;
			int [] arr = new int [m];
			for (int i = 0; i < data.length; i++) {
				Arrays.sort(arr);
				sum += arr[0];
				arr[0] += data[i];
			}
			System.out.println(sum);
		}
	}

}
