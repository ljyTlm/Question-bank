package codeforces;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class A988 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			ArrayList<Integer> list = new ArrayList<>();
			ArrayList<Integer> index = new ArrayList<>();
			for (int i = 1; i <= n; i++) {
				int v = sc.nextInt();
				if (!list.contains(v)) {
					list.add(v);
					index.add(i);
				}
			}
			if (list.size() >= k) {
				System.out.println("YES");
				for (int i = 0; i < k; i++) {
					System.out.print(i == 0 ? index.get(i) : " "+index.get(i));
				}System.out.println();
			}else {
				System.out.println("NO");
			}
		}
	}

}
