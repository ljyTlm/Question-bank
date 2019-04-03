package Âå¹Èoj;

import java.util.Scanner;

public class Ì¨½×ÎÊÌâ_P1192 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int [] arr = new int [n+1];
			arr[0] = 1;
			for (int i = 0; i < n; i++) {
				for (int j = 1; j <= k && i+j <= n; j++) {
					arr[i+j] += arr[i];
					arr[i+j] %= 100003;
				}
			}
			System.out.println(arr[n]);
		}
	}

}
