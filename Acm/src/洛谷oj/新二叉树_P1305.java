package Âå¹Èoj;

import java.util.ArrayList;
import java.util.Scanner;

public class ÐÂ¶þ²æÊ÷_P1305 {

	private static int n;
	private static int[] left;
	private static int[] right;
	private static ArrayList<Integer> list;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		list = new ArrayList<Integer>();
		n = sc.nextInt();
		left = new int [27];
		right = new int [27];
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			int head = s.charAt(0)-'a' + 1;
			cheek(head);
			if (s.charAt(1) != '*') {
				left[head] = s.charAt(1)-'a' + 1;
				cheek(left[head]);
			}
			if (s.charAt(2) != '*') {
				right[head] = s.charAt(2)-'a' + 1;
				cheek(right[head]);
			}
		}
		print(list.get(0));
		System.out.println();
	}


	private static void print(Integer val) {
		// TODO Auto-generated method stub
		if (val != 0) {
			System.out.print((char)(val-1+'a'));
			print(left[val]);
			print(right[val]);
		}
	}


	private static void cheek(int head) {
		// TODO Auto-generated method stub
		int idx = list.indexOf(head);
		if (idx != -1) {
			list.remove(idx);
		}else {
			list.add(head);
		}
	}

}
