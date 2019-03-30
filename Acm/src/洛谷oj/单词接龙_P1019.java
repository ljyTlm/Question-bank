package Âå¹Èoj;

import java.util.Scanner;

public class µ¥´Ê½ÓÁú_P1019 {

	private static int[] flag;
	private static String[] arr;
	private static int sum;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			arr = new String[n*2];
			flag = new int[2*n];
			for (int i = 0; i < arr.length; i+=2) {
				arr[i] = arr[i+1] = sc.next();
			}
			char t = sc.next().charAt(0);
			sum = 0;
			for (int i = 0; i < arr.length; i+=2) {
				if (t == arr[i].charAt(0)) {
					flag[i] = 1;
					dfs(arr[i], arr[i].length());
					flag[i] = 0;
				}
			}
			System.out.println(sum);
		}
	}

	private static void dfs(String last, int len) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			if (flag[i] == 0) {
				int k = 0;
				int idx = last.length()-1;
				while (idx >= 0) {
					String s = last.substring(idx);
					if (s.length() > arr[i].length()) {
						break;
					}
					String t = arr[i].substring(0, s.length());
					if (s.equals(t) && idx != 0 && t.length() != arr[i].length()) {
						k = 1;
						break;
					}idx --;
				}
				if (k == 1) {
					flag[i] = 1;
					dfs(arr[i], len+(arr[i].length() - last.length() + idx));
					flag[i] = 0;
				}
			}
		}
		sum = Math.max(sum, len);
	}

}
