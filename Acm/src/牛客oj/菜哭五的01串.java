package Å£¿Íoj;

import java.util.Scanner;

public class ²Ë¿ÞÎåµÄ01´® {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int idx = -1;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == '1') {
				idx = i;
				break;
			}
		}
		if (idx == -1) {
			System.out.println(0);
			return;
		}
		int find = 0;
		String k = "1";
		for (int i = idx+1; i < a.length(); i++) {
			if (find == 0) {
				if (a.charAt(i) == '0') {
					find = 1;
				}
			}else {
				if (a.charAt(i) == '1') {
					find = 0;
					k += '1';
				}
			}
		}
		if (find == 1) {
			k += '0';
		}
		System.out.println(k);
	}

}
