package ±±´óoj;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;


public class p3255 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int r = scanner.nextInt();
			ArrayList [] lists = new ArrayList [n+1];
			for (int i = 0; i < lists.length; i++) {
				lists[i] = new ArrayList<Node>();
			}
			for (int i = 0; i < r; i++) {
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				int c = scanner.nextInt();
				lists[a].add(new Node(b, c));
				lists[b].add(new Node(a, c));
			}
			int [] first = new int [n+1];
			int [] second = new int [n+1];
			for (int i = 0; i < second.length; i++) {
				first[i] = Integer.MAX_VALUE;
				second[i] = Integer.MAX_VALUE;
			}
			first[1] = 0;
			LinkedList<Integer> queue = new LinkedList<Integer>();
			LinkedList<Integer> data = new LinkedList<>();
			queue.add(1);
			data.add(0);
			while (!queue.isEmpty()) {
				int star = queue.poll();
				int len = data.poll();
				for (Object obj : lists[star]) {
					Node node = (Node)obj;
					int v = len + node.weight;
					if (v < first[node.point]) {
						second[node.point] = first[node.point];
						first[node.point] = v;
						queue.add(node.point);
						data.add(v);
					}else if (v > first[node.point] && v < second[node.point]) {
						second[node.point] = v;
						queue.add(node.point);
						data.add(v);
					}
				}
			}
			System.out.println(second[n]);
		}
	}
	static class Node {
		int point;
		int weight;
		public Node(int point, int weight) {
			this.point = point;
			this.weight = weight;
		}
	}
}
