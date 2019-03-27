package º¼µçoj;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class hdu1102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int [][] graph = new int [n+1][n+1];
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					int length = scanner.nextInt();
					graph[i][j] = length == 0 ? -1:length;
				}
			}
			
			int q = scanner.nextInt();
			for (int i = 0; i < q; i++) {
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				graph[a][b] = 0;
				graph[b][a] = 0;
			}
			
			int sum = 0;
			int num = n;
			int [] root = new int [n+1];
			for (int i = 1; i <= n; i++) {
				root[i] = i;
			}
			PriorityQueue<Node> queue = new PriorityQueue<Node>();
			int index = 1;
			while (num != 1) {
				for (int i = 1; i <= n; i++) {
					if (graph[index][i] != -1 && root[i] != 1) {
						queue.add(new Node(i, graph[index][i]));
					}
				}
				Node node;
				do {
					node = queue.poll();
					if (root[node.e] != 1) {
						root[node.e] = 1;
						index = node.e;
						sum += node.v;
						num --;
						break;
					}
				} while (!queue.isEmpty() && root[node.e] == 1);
			}
			System.out.println(sum);
		}

	}
	
	static class Node implements Comparable<Node>{
		int e;
		Integer v;
		public Node(int e, int v) {
			this.e = e;
			this.v = v;
		}
		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return v.compareTo(o.v);
		}
	}

}