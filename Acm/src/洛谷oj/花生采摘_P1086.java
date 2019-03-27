package Âå¹Èoj;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class »¨Éú²ÉÕª_P1086 {

	private static int[][] arr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			arr = new int [n][m];
			ArrayList<Node> list = new ArrayList<Node>();
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					arr[i][j] = sc.nextInt();
					if (arr[i][j] != 0) {
						list.add(new Node(i, j, arr[i][j]));
					}
				}
			}
			list.sort(new Comparator<Node>() {
				@Override
				public int compare(Node o1, Node o2) {
					// TODO Auto-generated method stub
					return -o1.v.compareTo(o2.v);
				}
			});
			int x = -1;
			int y = -1;
			int sum = 0;
			for (int i = 0; i < list.size(); i++) {
				if (x == -1 && y == -1) {
					int num = (list.get(i).x - x) * 2 + 1;
					if (k >= num) {
						k -= (list.get(i).x - x + 1);
						sum += list.get(i).v;
						x = list.get(i).x;
						y = list.get(i).y;
					}else {
						break;
					}
				}else {
					int num = Math.abs(x-list.get(i).x) + Math.abs(y-list.get(i).y) + 1 + list.get(i).x +1;
					if (k >= num) {
						k -= (Math.abs(x-list.get(i).x) + Math.abs(y-list.get(i).y) + 1);
						sum += list.get(i).v;
						x = list.get(i).x;
						y = list.get(i).y;
					}else {
						break;
					}
				}
			}
			System.out.println(sum);
		}
	}
	static class Node{
		public Node(int i, int j, int k) {
			// TODO Auto-generated constructor stub
			x = i;
			y = j;
			v = k;
		}
		Integer x, y, v;
	}
}
