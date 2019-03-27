package codeforces;
import java.math.BigInteger;
import java.util.Scanner;

public class C975 {

	private static BigInteger [] wizard;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int q = scanner.nextInt();
			BigInteger harm = new BigInteger("0");
			wizard = new BigInteger [n + 1];
			wizard[0] = new BigInteger("0");
			for (int i = 1; i <= n; i++) {
				wizard[i] = wizard[i - 1].add(new BigInteger(scanner.next()));
			}
			int[] sum = new int[q];
			for (int i = 0; i < q; i++) {
				harm = harm.add(new BigInteger(scanner.next()));
				sum[i] = n-find(harm,1, n);
				if (sum[i] == 0) {
					harm = wizard[0];
					sum[i] = n;
				}
			}
			for (int i = 0; i < sum.length; i++) {
				System.out.println(sum[i]);
			}
		}
	}

	private static int find(BigInteger v, int s, int e) {
		// TODO Auto-generated method stub
		if (v.compareTo(wizard[s]) < 0) {
			return s-1;
		}
		if (v.compareTo(wizard[s]) == 0) {
			return s;
		}
		if (v.compareTo(wizard[e]) >= 0) {
			return e;
		}
		int n = (s+e)/2;
		if (v.compareTo(wizard[n]) == 0) {
			return n;
		}else if (v.compareTo(wizard[n]) > 0) {
			return find(v, n+1, e);
		}
		return find(v, s, n);
	}

}
