package codeforces;
import java.util.Scanner;

public class A994 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int [] arr = new int [n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			int [] flag = new int [10];
			for (int i = 0; i < m; i++) {
				flag[sc.nextInt()] = 1;
			}
			int k  = 0;
			for (int i = 0; i < arr.length; i++) {
				if (flag[arr[i]] == 1) {
					System.out.print(k == 0 ? arr[i] : " "+arr[i]);
					k = 1;
				}
			}
			System.out.println();
		}
	}

}
