package º¼µçoj;

import java.util.Scanner;

public class hdu6484 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t -- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if (n%m==0) {
				System.out.println(0);
			}else {
				System.out.println(1);
			}
		}
	}

}
