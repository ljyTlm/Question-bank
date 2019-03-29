package Âå¹Èoj;

import java.util.Scanner;

public class Ç±·üÕß_P1071 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String a = sc.next();
			String b = sc.next();
			String c = sc.next();
			int [] flag_1 = new int[500];
			int [] flag_2 = new int[500];
			int num = 26;
			for (int i = 0; i < a.length() && num > 0; i++) {
				char x = a.charAt(i);
				char y = b.charAt(i);
				if (flag_1[x] == 0) {
					if (flag_2[y] == 0) {
						flag_2[y] = 1;
						flag_1[x] = y;
						num --;
					}else {
						System.out.println("Failed");
						return;
					}
				}else {
					if (flag_1[x] != y) {
						System.out.println("Failed");
						return;
					}
				}
			}
			if (num != 0) {
				System.out.println("Failed");
				return;
			}
			String sum = "";
			for (int i = 0; i < c.length(); i++) {
				sum += (char)flag_1[c.charAt(i)];
			}
			System.out.println(sum);
		}
	}

}
