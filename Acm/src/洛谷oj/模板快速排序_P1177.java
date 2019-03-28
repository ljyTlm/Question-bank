package Âå¹Èoj;

import java.util.Arrays;
import java.util.Scanner;

public class Ä£°å¿ìËÙÅÅĞò_P1177 {

	private static int[] arr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			arr = new int [n+1];
			int num = 0;
			for (int i = 1; i < arr.length; i++) {
				arr[i] = sc.nextInt();
				if(arr[i] == arr[i-1])
					num ++;
			}
			if(num != n-1)
				quickSort(1, n);
			for (int i = 1; i < arr.length; i++) {
				if (i == 1) {
					System.out.print(arr[i]);
				}else {
					System.out.print(" "+arr[i]);
				}
			}
			System.out.println();
		}
	}

	private static void quickSort(int s, int e) {
		// TODO Auto-generated method stub
		if (s < e) {
			int k = (int)(Math.random()*(e-s+1));
			swap(s, s+k);
			int flag = arr[s];
			int i = s;
			int j = e;
			while (i < j) {
				while (i < j && arr[j] >= flag) {
					j -- ;
				}
				while (i < j && arr[i] <= flag) {
					i ++;
				}
				swap(i, j);
			}
			swap(s, i);
			quickSort(s, i-1);
			quickSort(i+1, e);
		}
	}

	private static void swap(int i, int j) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
