package 洛谷oj;

import java.util.Arrays;
import java.util.Scanner;

public class 最小生成树模板_3366 {

	private static int[] fa;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		fa = new int[n+1];
		for (int i = 0; i < fa.length; i++) {
			fa[i] = i;
		}
		Node [] arr = new Node[m];
		int ans = 0;
		int num = n;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Node(sc.nextInt(), sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length && num > 1; i++) {
			int a = find(arr[i].i);
			int b = find(arr[i].j);
			if (a != b) {
				fa[a] = b;
				num --;
				ans += arr[i].v;
			}
		}
		if (num == 1) {
			System.out.println(ans);
		}else {
			System.out.println("orz");
		}
	}
	private static int find(Integer j) {
		// TODO Auto-generated method stub
		return j == fa[j] ? j : find(fa[j]);
	}
	static class Node implements Comparable<Node>{
		Integer i, j, v;

		public Node(int i, int j, int v) {
			// TODO Auto-generated constructor stub
			this.i = i;
			this.j = j;
			this.v = v;
		}

		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return v.compareTo(o.v);
		}
	}
}
