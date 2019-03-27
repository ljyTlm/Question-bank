package 杭电oj;
//package 数据结构强化训练;
//
//import java.util.PriorityQueue;
//import java.util.Scanner;
//
//public class hdu2527 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		for (int i = 0; i < t; i++) {
//			int n = sc.nextInt();
//			String str = sc.next();
//			int [] arr = new int [27];
//			for (int j = 0; j < str.length(); j++) {
//				arr[str.charAt(j)-'a'] ++;
//			}
//			PriorityQueue<Integer> list = new PriorityQueue<>();
//			PriorityQueue<Node> huffman = new PriorityQueue<>();
//			for (int j = 0; j < arr.length; j++) {
//				if (arr[j] != 0) {
//					list.add(arr[j]);
//					huffman.add(new Node(arr[j], null, null));
//				}
//			}
//			int sum = list.size() == 1 ? list.peek():0;
//			while (list.size() != 1) {
//				int v = list.poll() + list.poll();
//				sum += v;
//				list.add(v);
//				Node left = huffman.poll();
//				Node right = huffman.poll();
//				huffman.add(new Node(left.v + right.v, left, right));
//			}
//			//最后剩的点就是头结点
//			System.out.println(sum <= n ? "yes" : "no");
//		}
//	}
//
//}
//class Node implements Comparable<Node>{
//	Integer v;
//	Node left;
//	Node right;
//	public Node(Integer v, Node left, Node right) {
//		this.v = v;
//		this.left = left;
//		this.right = right;
//	}
//	@Override
//	public int compareTo(Node o) {
//		// TODO Auto-generated method stub
//		return v.compareTo(o.v);
//	}
//}