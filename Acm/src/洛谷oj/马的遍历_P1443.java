package Âå¹Èoj;

import java.util.LinkedList;
import java.util.Scanner;

public class ÂíµÄ±éÀú_P1443 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] pla  = {-2, -1,  -2, 1,   2, -1,  2, 1,  -1, -2,   -1, 2,  1, 2,  1, -2};
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			int [][] arr = new int[n][m];
			LinkedList<Node> list = new LinkedList<>();
			list.add(new Node(x, y, 1));
			arr[x][y] = 1;
			while (!list.isEmpty()) {
				Node node = list.poll();
				for (int i = 0; i < pla.length; i+=2) {
					int next_x = node.x + pla[i];
					int next_y = node.y + pla[i+1];
					if (next_x >= 0 && next_x < n && next_y >= 0 && next_y < m && arr[next_x][next_y] == 0) {
						arr[next_x][next_y] = node.n + 1;
						list.add(new Node(next_x, next_y, node.n+1));
					}
				}
			}
			for (int i = 0; i < n; i++) {
				String line = "";
				for (int j = 0; j < m; j++) {
					String str = (arr[i][j]-1)+"";
					for (int k = str.length(); k < 5; k++) {
						str += " ";
					}
					line += str;
				}
				System.out.println(line);
			}
		}
	}
	static class Node {
		public Node(int x2, int y2, int n2) {
			// TODO Auto-generated constructor stub
			x = x2;
			y = y2;
			n = n2;
		}

		int x, y, n;
	}
}
