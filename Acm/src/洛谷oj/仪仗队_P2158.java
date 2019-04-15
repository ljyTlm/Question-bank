package Âå¹Èoj;
import java.util.HashMap;
import java.util.Scanner;

public class ÒÇÕÌ¶Ó_P2158 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int ans = 0;
			if (n == 1) {
				System.out.println(0);
				continue;
			}
			for (int i = 1; i < n; i++) {
				ans += ol(i);
			}
			System.out.println(ans*2+1);
		}
	}
	public static int ol(int n) {
		int res = n;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				res = res - res / i;
				while (n % i == 0)
					n /= i;

			}

		}
		if (n > 1) {
			res = res - res / n;
		}
		return res;
	}

}
