package Âå¹Èoj;

import java.util.LinkedList;
import java.util.Scanner;

public class Ææ¹ÖµÄµçÌÝP_1135 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int [] arr = new int[n+1];
		for (int i = 1; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int [] dp = new int[n+1];
		int [] flag = new int[n+1];
		dp[a] = 1;
		flag[a] = 1;
		LinkedList<Node> list = new LinkedList<>();
		list.add(new Node(a, 1));
		while (!list.isEmpty()) {
			Node node = list.poll();
			if (node.idx == b) {
				break;
			}
			int next = node.idx + arr[node.idx];
			int numb = node.num + 1;
			if (next >= 1 && next <= n && flag[next] == 0) {
				flag[next] = 1;
				dp[next] = numb;
				list.add(new Node(next, numb));
			}
			next = node.idx - arr[node.idx];
			if (next >= 1 && next <= n && flag[next] == 0) {
				flag[next] = 1;
				dp[next] = numb;
				list.add(new Node(next, numb));
			}
		}
		System.out.println(dp[b]-1);
	}
	static class Node {
		public Node(int a, int i) {
			// TODO Auto-generated constructor stub
			idx = a;
			num = i;
		}
		int idx;
		int num;
	}

}
