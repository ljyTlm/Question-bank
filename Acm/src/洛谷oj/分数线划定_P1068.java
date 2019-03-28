package 洛谷oj;

import java.util.Arrays;
import java.util.Scanner;

public class 分数线划定_P1068 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			Node [] arr = new Node[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = new Node(sc.nextInt(), sc.nextInt());
			}
			Arrays.sort(arr);
			int v = (int)(Math.floor(m/10.0 * 15.0));
			String sum = "";
			int sorce = arr[v-1].s;
			v = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].s >= sorce) {
					sum += arr[i].k+" "+arr[i].s+"\n";
					v ++;
				}else {
					break;
				}
			}
			System.out.println(sorce+" "+v);
			System.out.print(sum);
		}
	}
	static class Node implements Comparable<Node>{
		Integer k, s;

		public Node(int k, int s) {
			// TODO Auto-generated constructor stub
			this.k = k;
			this.s = s;
		}

		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			if (s == o.s) {
				return k.compareTo(o.k);
			}
			return -s.compareTo(o.s);
		}
	}
}
