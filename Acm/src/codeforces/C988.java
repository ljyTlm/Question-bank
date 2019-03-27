package codeforces;
import java.util.HashMap;
import java.util.Scanner;

public class C988 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			HashMap<Integer, Node> map = new HashMap<>();
			int flag = 0;
			int sum1 = 0;
			int sum2 = 0;
			int sum3 = 0;
			int sum4 = 0;
			for (int i = 1; i <= n; i++) {
				int m = sc.nextInt();
				int [] arr = new int [m+1];
				int sum = 0;
				for (int j = 1; j < arr.length; j++) {
					arr[j] = sc.nextInt();
					sum += arr[j];
				}
				for (int j = 1; j < arr.length && flag == 0; j++) {
					int v = sum - arr[j];
					Node k = map.get(v);
					if (k != null && k.queue != i) {
						sum1 = i;
						sum2 = j;
						sum3 = k.queue;
						sum4 = k.index;
						flag = 1;
						break;
					}
					map.put(v, new Node(i, j));
				}
			}
			if (flag == 0) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
				System.out.println(sum1 +" "+ sum2);
				System.out.println(sum3 +" "+ sum4);
			}
		}
	}
	
}
class Node {
	int queue;
	int index;
	public Node(int queue, int index) {
		this.queue = queue;
		this.index = index;
	}
}