package ¿∂«≈±≠oj;

import java.util.Scanner;

import javax.swing.text.rtf.RTFEditorKit;

public class œÓ¡¥ {

	private static String a;
	private static int falg;
	private static int breakPoint;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			a = scanner.next();
			int max = 0;
			falg = 0;
			for (int i = 0; i < a.length(); i++) {
				breakPoint = i;
				int left = findLeft(i, a.charAt(i));
				breakPoint = i == a.length()-1?0:i+1;
				int right = findRight(i==a.length()-1?0:i+1, a.charAt(i==a.length()-1? 0:i+1));
				max = max < left+right ? left+right : max;
			}
			System.out.println(max);
		}
	}

	private static int findRight(int i, char k) {
		// TODO Auto-generated method stub
		if (i == falg) {
			return 0;
		}
		if (i == a.length() - 1) {
			i = 0;
		}else {
			i = i + 1;
		}
		if (i == breakPoint) {
			return 1;
		}
		if (k == 'w') {
			return findRight(i, a.charAt(i))+1;
		}else {
			if (a.charAt(i) == 'w') {
				return findRight(i, k)+1;
			}
			if (a.charAt(i) == k) {
				return findRight(i, k)+1;
			}
		}
		return 1;
	}

	private static int findLeft(int i, char k) {
		// TODO Auto-generated method stub
		if (i == 0) {
			i = a.length()-1;
		}else {
			i = i - 1;
		}
		if (i == breakPoint) {
			falg = i == a.length()-1 ? 0 : i+1;
			return 1;
		}
		if (k == 'w') {
			return findLeft(i, a.charAt(i))+1;
		}else {
			if (a.charAt(i) == 'w') {
				return findLeft(i, k)+1;
			}
			if (a.charAt(i) == k) {
				return findLeft(i, k)+1;
			}
		}
		falg = i;
		return 1;
	}


}
