package Âå¹Èoj;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Æ´Êý_P1012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			String [] arr = new String[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.next();
			}
			Arrays.sort(arr, new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					// TODO Auto-generated method stub
					String a = o1+o2;
					String b = o2+o1;
					return -a.compareTo(b);
				}
			});
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);
			}
			System.out.println();
		}
	}

}
