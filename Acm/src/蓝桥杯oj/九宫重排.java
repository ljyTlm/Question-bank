package ¿∂«≈±≠oj;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class æ≈π¨÷ÿ≈≈ {

	private static Scanner sc;
	private static int sum;
	private static HashMap<Long, Node> flag;
	private static int [][] pla = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s = sc.next();
			String e = sc.next();
			s = s.replace('.', '9');
			e = e.replace('.', '9');
			Node star = new Node(Integer.parseInt(s), 0);
			Node end = new Node(Integer.parseInt(e), 0);
			sum = -1;
			flag = new HashMap<>();
			flag.put(star.hash, new Node(1, 0));
			flag.put(end.hash, new Node(2, 0));
			if (star.hash == end.hash) {
				sum = 0;
			}
			LinkedList<Node> qu_1 = new LinkedList<>();
			LinkedList<Node> qu_2 = new LinkedList<>();
			qu_1.add(star);
			qu_2.add(end);
			while (!qu_1.isEmpty() || !qu_2.isEmpty()) {
				if (sum != -1) {
					break;
				}
				if (!qu_1.isEmpty() && sum == -1) {
					bfs(qu_1, 1);
				}
				if (!qu_2.isEmpty() && sum == -1) {
					bfs(qu_2, 2);
				}
			}
			System.out.println(sum);
		}
	}
	private static void bfs(LinkedList<Node> qu, int f) {
		// TODO Auto-generated method stub
		Node node = qu.poll();
		long [][] arr = new long [3][3];
		long v = node.hash;
		int x = 0;
		int y = 0;
		long ten = 100000000;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = v / ten;
				v = v - (v/ten) * ten;
				ten /= 10;
				if (arr[i][j] == 9) {
					x = i;
					y = j;
				}
			}
		}
		for (int i = 0; i < 4; i++) {
			int next_x = x + pla[i][0];
			int next_y = y + pla[i][1];
			if (next_x >= 0 && next_x < 3 && next_y >= 0 && next_y < 3) {
				arr[x][y] = arr[next_x][next_y];
				arr[next_x][next_y] = 9;
				long hash = getHash(arr);
				if (flag.get(hash) == null) {
					flag.put(hash, new Node(f, node.num + 1));
					qu.add(new Node(hash, node.num + 1));
				}else if (flag.get(hash).hash != f) {
					sum = node.num + 1 + flag.get(hash).num;
					return;
				}
				arr[next_x][next_y] = arr[x][y];
				arr[x][y] = 9;
			}
		}
	}
	private static long getHash(long[][] arr) {
		// TODO Auto-generated method stub
		long hash = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				hash += arr[i][j];
				hash *= 10;
			}
		}
		return hash/10;
	}
	static class Node {
		public Node(long hash, int num) {
			// TODO Auto-generated constructor stub
			this.hash = hash;
			this.num = num;
		}
		Long hash;
		Integer num;
	}
}
