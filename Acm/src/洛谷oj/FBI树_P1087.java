package Âå¹Èoj;

import java.util.Scanner;

public class FBIÊ÷_P1087 {

	private static int[] ans;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		ans = new int[str.length()+1];
		for (int i = 1; i < ans.length; i++) {
			ans[i] = (str.charAt(i-1)-'0') + ans[i-1];
		}
		Node head = create(1, str.length());
		print(head);
		System.out.println();
	}
	private static void print(Node head) {
		// TODO Auto-generated method stub
		if (head.left != null) {
			print(head.left);
		}
		if (head.right != null) {
			print(head.right);
		}
		System.out.print(head.k);
	}
	private static Node create(int s, int e) {
		// TODO Auto-generated method stub
		Node node = new Node();
		int k = (s+e)/2;
		if (s < e) {
			node.left = create(s, k);
			node.right = create(k+1, e);
		}
		if (ans[e] - ans[s-1] == 0) {
			node.k = "B";
		}else if (ans[e] - ans[s-1] == e - s + 1) {
			node.k = "I";
		}else {
			node.k = "F";
		}
		return node;
	}
	static class Node {
		Node left, right;
		String k;
	}
}
