package codeforces;
import java.util.Arrays;
import java.util.Scanner;

public class A984 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int [] arr = new int [n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			System.out.println(n == 1 ? arr[0] : n % 2 == 0 ? arr[n/2-1] : arr[n/2]);
		}
	}

}
