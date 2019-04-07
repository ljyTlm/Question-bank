package Âå¹Èoj;

import java.util.Scanner;

public class ÇóÏÈĞòÅÅÁĞ_P1030 {

	private static int[] a_idx;
	private static int[] b_idx;
	private static String a;
	private static String b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		a = sc.next();
		b = sc.next();
		a_idx = new int[27];
		b_idx = new int[27];
		for (int i = 0; i < a.length(); i++) {
			a_idx[a.charAt(i)-'A'] = i;
			b_idx[b.charAt(i)-'A'] = i;
		}
		Node head = create(0, a.length()-1, 0, b.length()-1);
		print(head);
		System.out.println();
	}
	private static void print(Node head) {
		// TODO Auto-generated method stub
		System.out.print(head.s);
		if (head.left != null) {
			print(head.left);
		}
		if (head.right != null) {
			print(head.right);
		}
	}
	private static Node create(int a_s, int a_e, int b_s, int b_e) {
		//System.out.println(a_s+"   "+a_e+"   "+b_s+"   "+b_e);
		Node node = new Node();
		node.s = b.charAt(b_e);
		int idx = a_idx[node.s-'A'];
		int k1 = a.length();
		for (int i = idx+1; i <= a_e; i++) {
			k1 = Math.min(k1, b_idx[a.charAt(i)-'A']);
		}
		if (k1 != a.length()) {
			node.right = create(idx+1, a_e, k1, b_e-1);
		}
		int k2 = -1;
		for (int i = a_s; i < idx; i++) {
			k2 = Math.max(k2, b_idx[a.charAt(i)-'A']);
		}
		if (k2 != -1) {
			node.left = create(a_s, idx-1, b_s, k2);
		}
		return node;
	}
	static class Node {
		Node left;
		Node right;
		char s;
	}
}
