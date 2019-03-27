package codeforces;
import java.util.Scanner;

public class E988 {
	
private static int min;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String str = sc.next();
			StringBuffer s = new StringBuffer(str);
			str = s.reverse().toString();
			int min = Integer.MAX_VALUE;
			int a = str.indexOf("0");
			if (a != -1) {
				String v = str.substring(a+1);
				int a1 = v.indexOf("0");
				if (a1 != -1) {
					min = Math.min(min, a+a+a1);
				}
				int a2 = v.indexOf("5");
				if (a2 != -1) {
					min = Math.min(min, a+a+a2);
				}
			}
			int b = str.indexOf("2");
			if (b != -1) {
				int b1 = str.substring(b+1).indexOf("5");
				if (b1 != -1) {
					if (b+b1+1 == str.length()-1 && str.charAt(b+b1) == '0') {
						min = Math.min(min, f(b, b1, str));
					}else {
						min = Math.min(min, b+b+b1+1);
					}
				}
			}
			int c = str.indexOf("5");
			if (c != -1) {
				String v = str.substring(c+1);
				int c1 = v.indexOf("0");
				if (c1 != -1) {
					min = Math.min(min, c+c+c1+1);
				}
				int c2 = v.indexOf("2");
				if (c2 != -1) {
					if (c+c2+1 == str.length()-1 && str.charAt(c+c2) == '0') {
						min = Math.min(min, f(c, c2, str));
					}else {
						min = Math.min(min, c+c+c2);
					}
				}
				int c3 = v.indexOf("7");
				if (c3 != -1) {
					if (c+c3+1 == str.length()-1 && str.charAt(c+c3) == '0') {
						min = Math.min(min, f(c, c3, str));
					}else {
						min = Math.min(min, c+c+c3);
					}
				}
			}
			int d = str.indexOf("7");
			if (d != -1) {
				int d1 = str.substring(d+1).indexOf("5");
				if (d1 != -1) {
					if (d+d1+1 == str.length()-1 && str.charAt(d+d1) == '0') {
						min = Math.min(min, f(d, d1, str));
					}else {
						min = Math.min(min, d+d+d1+1);
					}
				}
			}
			System.out.println(min == Integer.MAX_VALUE ? -1:min);
		}
	}

	private static int f(int b, int b1, String str) {
		// TODO Auto-generated method stub
		int index = b1;
		int k = 1;
		while (str.charAt(index) == '0') {
			k ++;
			index --;
		}
		if (k == str.length() - 1) {
			return Integer.MAX_VALUE;
		}
		return b+b+b1+k;
	}
	

//	³¬Ê±×ö·¨
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		while (sc.hasNext()) {
//			String str = sc.next();
//			char [] arr = new char [str.length()];
//			int [] flag = new int [10];
//			for (int i = 0; i < arr.length; i++) {
//				arr[i] = str.charAt(i);
//				flag[arr[i]-'0'] ++;
//			}
//			min = Integer.MAX_VALUE;
//			if (arr[0] > 2 || (arr[0] > 0 && arr[5] > 0) || (arr[5] > 0 && arr[2] > 0) || (arr[7] > 0 && arr[5] > 0)) {
//				f(arr, 0, 0);
//			}
//			System.out.println(min == Integer.MAX_VALUE ? -1:min);
//		}
//	}
//	private static void f(char[] a, int k, int num) {
//		// TODO Auto-generated method stub
//		if (k == a.length-1) {
//			if (a[0] != '0') {
//				long b = Long.valueOf(new String(a));
//				if (b % 25 == 0) {
//					min = Math.min(min, num);
//				}
//			}
//			return ;
//		}
//		for (int i = k; i < a.length; i++) {
//			char tmp = a[i];
//			int r = 0;
//			for (int j = i-1; j >= k; j--) {
//				a[j+1] = a[j];
//				r++;
//			}
//			a[k] = tmp;
//			f(a, k+1, num+r);
//			tmp = a[k];
//			for (int j = k; j <= i-1; j++) {
//				a[j] = a[j+1];
//			}
//			a[i] = tmp;
//		}
//	}
}
