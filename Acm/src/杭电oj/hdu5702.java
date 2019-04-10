package º¼µçoj;

import java.util.Arrays;
import java.util.Scanner;

public class hdu5702 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-->0) {
			int n = sc.nextInt();
			Node [] arr = new Node[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = new Node(sc.next(), sc.nextInt());
			}
			Arrays.sort(arr);
			for (int i = 0; i < arr.length; i++) {
				if(i != 0)
					System.out.print(" ");
				System.out.print(arr[i].str);
			}
			System.out.println();
		}
	}
	static class Node implements Comparable<Node>{
		public Node(String s, int v) {
			// TODO Auto-generated constructor stub
			val = v; str = s;
		}
		Integer val;
		String str;
		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return -val.compareTo(o.val);
		}
	}
}
