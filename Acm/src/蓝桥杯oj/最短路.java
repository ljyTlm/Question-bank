package À¶ÇÅ±­oj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class ×î¶ÌÂ· {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		ArrayList<Node> [] graph = new ArrayList[n+1];
		for (int i = 0; i < graph.length; i++)
			graph[i] = new ArrayList<Node>();
		for (int i = 0; i < m; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int v = scanner.nextInt();
			graph[a].add(new Node(b, v));
		}
		int [] min = new int [n+1];
		Arrays.fill(min, 99999999);
		min[1] = 0;
		LinkedList<Node> qu = new LinkedList<>();
		qu.add(new Node(1, 0));
		while (!qu.isEmpty()) {
			Node node = qu.pop();
			for (int i = 0; i < graph[node.idx].size(); i++) {
				int value = graph[node.idx].get(i).v + node.v;
				if (min[graph[node.idx].get(i).idx] > value) {
					min[graph[node.idx].get(i).idx] = value;
					qu.add(new Node(graph[node.idx].get(i).idx, value));
				}
			}
		}
		for (int i = 2; i < min.length; i++) {
			System.out.println(min[i]);
		}
	}

}
class Node{
	int v, idx;
	public Node(int idx, int v) {
		this.v = v;
		this.idx = idx;
	}
}