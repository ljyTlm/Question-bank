package 小米oj;

import java.util.*;

public class 找出旋转有序数列的中间值 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line = "aabcc,dbbca,aadbbcbca";
						
					   //aabcc,dbbca,aadbbcbca
		String [] arr = line.split(",");
		char [] a = arr[0].toCharArray();
		char [] b = arr[1].toCharArray();
		char [] c = arr[2].toCharArray();
		System.out.println(f(a, b, c, 0, 0, 0));;
	}

	private static boolean f(char[] a, char[] b, char[] c, int i, int j, int k) {
		// TODO Auto-generated method stub
		boolean n1 = false;
		if (i < a.length && c[k] == a[i]) {
			if (k+1 == c.length) {
				n1 = true;
			}else {
				n1 = f(a, b, c, i+1, j, k+1);
			}
		}
		boolean n2 = false;
		if (j < b.length && c[k] == b[j]) {
			if (k+1 == c.length) {
				n2 = true;
			}else {
				n2 = f(a, b, c, i, j+1, k+1);
			}
		}
		return n1||n2;
	}
	
}
