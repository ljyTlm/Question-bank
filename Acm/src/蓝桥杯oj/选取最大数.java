package ���ű�oj;

import java.util.Arrays;
import java.util.Scanner;

public class ѡȡ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int [] arr = new int [3];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scanner.nextInt();
			}
			Arrays.sort(arr);
			System.out.println(arr[2]);
		}
	}

}
