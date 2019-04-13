package º¼µçoj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;


public class hdu1102 {

	private static int[] father;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int [][] arr = new int[n+1][n+1];
			for (int i = 1; i < arr.length; i++) {
				for (int j = 1; j < arr.length; j++) {
					arr[i][j] = scanner.nextInt();
				}
			}
			int m = scanner.nextInt();
			father = new int [n+1];
			for (int i = 0; i < father.length; i++) {
				father[i] = i;
			}
			int num = n;
			for (int i = 0; i < m; i++) {
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				int c = find(a);
				int d = find(b);
				if (c != d) {
					father[c] = d;
					num --;
					arr[a][b] = arr[b][a] = 0;
				}
			}
			ArrayList<Node> list = new ArrayList<>();
			for (int i = 1; i < n; i++) {
				for (int j = i+1; j <= n; j++) {
					if (arr[i][j] != 0) {
						list.add(new Node(i, j, arr[i][j]));
					}
				}
			}
			list.sort(new Comparator<Node>() {

				@Override
				public int compare(Node o1, Node o2) {
					// TODO Auto-generated method stub
					return o1.v.compareTo(o2.v);
				}
			});
			int ans = 0;
			for (int i = 0; i < list.size() && num > 0; i++) {
				int a = list.get(i).a;
				int b = list.get(i).b;
				int c = find(a);
				int d = find(b);
				if (c != d) {
					father[c] = d;
					num --;
					ans += list.get(i).v;
				}
			}
			System.out.println(ans);
		}

	}

	private static int find(int b) {
		// TODO Auto-generated method stub
		return b == father[b] ? b : find(father[b]);
	}
	
	static class Node {
		public Node(int i, int j, int k) {
			// TODO Auto-generated constructor stub
			a = i; b = j; v = k;
		}

		Integer a, b, v;
	}
}