package º¼µçoj;

import java.util.ArrayList;
import java.util.Scanner;

public class hdu1941 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			if (n == 0 && m == 0) {
				return ;
			}
			ArrayList<Integer> [] arr = new ArrayList [n+1];
			for (int i = 1; i < arr.length; i++) {
				arr[i] = new ArrayList<Integer>();
			}
			int [] du = new int [n+1];
			for (int i = 0; i < m; i++) {
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				arr[a].add(b);
				arr[b].add(a);
				du[a] ++;
				du[b] ++;
			}
			ArrayList<Integer> list = new ArrayList<>();
			
		}
	}
}
class Point {
	Integer v ;
	Integer du;
}