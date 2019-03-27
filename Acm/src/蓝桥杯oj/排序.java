package ¿∂«≈±≠oj;

import java.util.Arrays;
import java.util.Scanner;

public class ≈≈–Ú {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String [] arr = scanner.nextLine().split(" ");
			int [] shuzu = new int [arr.length];
			for (int i = 0; i < shuzu.length; i++) {
				shuzu[i] = Integer.parseInt(arr[i]);
			}
			Arrays.sort(shuzu);
			for (int i = arr.length - 1; i >= 0; i --) {
				System.out.print(i == arr.length - 1 ? shuzu[i] : " " + shuzu[i]);
			}
			System.out.println();
		}
	}

}
