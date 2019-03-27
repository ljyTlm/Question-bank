package 杭电oj;
//package 数据结构强化训练;
//
//import java.util.Scanner;
//
//public class hdu1541线段树 {
//
//	private static int n;
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		while (scanner.hasNext()) {
//			n = scanner.nextInt();
//			Node root = creat(0,33000);
//			int [] arr = new int [n];
//			for (int i = 0; i < n; i++) {
//				int x = scanner.nextInt();
//				int y = scanner.nextInt();
//				arr[sum(0, x, root)] ++; 
//				add(x, root);
//			}
//			for (int i = 0; i < arr.length; i++) {
//				System.out.println(arr[i]);
//			}
//		}
//	}
//	
//	private static int sum(int s, int e, Node root) {
//		// TODO Auto-generated method stub
//		if (s > root.e || e < root.s) {
//			return 0;
//		}
//		if (s <= root.s && e >= root.e) {
//			return root.sum;
//		}
//		int v = 0;
//		v += sum(s, e, root.l);
//		v += sum(s, e, root.r);
//		return v;
//	}
//
//	private static void add(int x, Node root) {
//		// TODO Auto-generated method stub
//		root.sum ++;
//		if (root.l != null && x >= root.l.s && x <= root.l.e) {
//			add(x, root.l);
//		}
//		if (root.r != null && x >= root.r.s && x <= root.r.e) {
//			add(x, root.r);
//		}
//	}
//
//	private static Node creat(int i, int j) {
//		// TODO Auto-generated method stub
//		if (i == j) { 
//			return new Node(i, j, null, null, 0);
//		}
//		int k = (i + j) / 2;
//		Node l = creat(i, k);
//		Node r = creat(k+1, j);
//		return new Node(i, j, l, r, 0);
//	}
//
//}
//class Node {
//	int s;
//	int e;
//	Node l;
//	Node r;
//	int sum;
//	public Node(int s, int e, Node l, Node r, int sum) {
//		this.s = s;
//		this.e = e;
//		this.l = l;
//		this.r = r;
//		this.sum = sum;
//	}
//}