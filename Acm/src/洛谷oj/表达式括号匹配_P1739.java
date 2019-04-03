package ¬Âπ»oj;

import java.util.Scanner;
import java.util.Stack;

public class ±Ì¥Ô Ω¿®∫≈∆•≈‰_P1739 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char [] arr = sc.next().toCharArray();
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '(') {
				st.add(1);
			}
			if (arr[i] == ')') {
				if (st.isEmpty()) {
					System.out.println("NO");
					return;
				}
				st.pop();
			}
		}
		System.out.println(st.isEmpty() ? "YES":"NO");
	}

}
