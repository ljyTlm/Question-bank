package codeforces;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class C979 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			int [] father = new int [n+1];
			int [] num = new int [n+1];
			for (int i = 0; i < n+1; i++) {
				father[i] = i;
				num[i] = 1;
			}
			father[x] = -1;
			father[y] = -1;
			List<Node> list = new ArrayList<>();
			for (int i = 0; i < n-1; i++) {
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				if (father[a] == -1 || father[b] == -1) {
					list.add(new Node(a, b));
					continue;
				}
				
			}
		}
	}
	static class Node {
		int x;
		int y;
		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
