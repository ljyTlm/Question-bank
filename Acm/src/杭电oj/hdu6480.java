package º¼µçoj;

import java.util.Scanner;

public class hdu6480 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t -- > 0) {
			String a = sc.next();
			long sum = 0;
			for (int i = 0; i < a.length();) {
				char flag = a.charAt(i);
				long ans = 0;
				for (int j = i; j < a.length(); j++) {
					if (a.charAt(j) == flag) {
						ans ++;
					}else {
						i = j;
						break;
					}
					if(j == a.length()-1) {
						i = a.length();
						break;
					}
				}
				sum += ans*(ans+1)/2;
			}
			System.out.println(sum);
		}
	}

}
