package codeforces;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class A547 {

	private static HashMap<Long, Node> map;
	private static long sum;
	private static long n;
	private static long m;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			n = sc.nextLong();
			m = sc.nextLong();
			if (n == m) {
				System.out.println(0);
				continue;
			}
			LinkedList<Node> qu_1 = new LinkedList<>();
			LinkedList<Node> qu_2 = new LinkedList<>();
			qu_1.add(new Node(n, 0));
			qu_2.add(new Node(m, 0));
			map = new HashMap<Long, Node>();
			map.put(n, new Node(1, 0));
			map.put(m, new Node(2, 0));
			sum = -1;
			while (!qu_1.isEmpty() || !qu_2.isEmpty()) {
				if (sum != -1) {
					break;
				}
				if (!qu_1.isEmpty()) {
					bfs_1(qu_1);
				}
				if (!qu_2.isEmpty()) {
					bfs_2(qu_2);
				}
			}
			System.out.println(sum);
		}
	}

	private static void bfs_2(LinkedList<Node> qu) {
		// TODO Auto-generated method stub
		if (sum != -1) {
			return;
		}
		Node node = qu.poll();
		if (node.val % 2 == 0) {
			cheek(node.val /2, qu, 2, node.num+1);
		}
		if (node.val % 3 == 0) {
			cheek(node.val/3, qu, 2, node.num+1);
		}
	}

	private static void bfs_1(LinkedList<Node> qu) {
		// TODO Auto-generated method stub
		if (sum != -1) {
			return;
		}
		Node node = qu.poll();
		long x = node.val * 2;
		long y = node.val * 3;
		cheek(x, qu, 1, node.num+1);
		cheek(y, qu, 1, node.num+1);
	}
	
	private static void cheek(long x, LinkedList<Node> qu, long i, long num) {
		// TODO Auto-generated method stub
		Node flag = map.get(x);
		if (flag == null) {
			if (x >= n && x <= m) {
				map.put(x, new Node(i, num));
				qu.add(new Node(x, num));
			}
		}else if (i != flag.val) {
			sum = flag.num + num;
		}
	}

	static class Node{
		public Node(long n, long i) {
			// TODO Auto-generated constructor stub
			val = n;
			num = i;
		}
		long val;
		long num;
	}

}