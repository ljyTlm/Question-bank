package ¿∂«≈±≠oj;

import java.util.Arrays;
import java.util.Scanner;

public class √∞≈›≈≈–Ú∑®≈≈–Ú {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int [] arr = new int [10];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scanner.nextInt();
			}
			Arrays.sort(arr);
			for (int i = 0; i < arr.length; i++) {
				System.out.print(i == 0 ? arr[i] : " "+arr[i]);
			}
		}
	}

}
