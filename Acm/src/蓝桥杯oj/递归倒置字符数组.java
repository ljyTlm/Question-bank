package À¶ÇÅ±­oj;

import java.util.Scanner;

public class µÝ¹éµ¹ÖÃ×Ö·ûÊý×é {

	private static char[] a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			a = scanner.next().toCharArray();
			if (n == 1) {
				System.out.println(a);
				continue;
			}
			digui(0, n-1);
			for (int k = 0; k < a.length; k++) {
				System.out.print(a[k]);
			}System.out.println();
		}
	}

	private static void digui(int i, int j) {
		// TODO Auto-generated method stub
		if (i == j || i > j) {
			return ;
		}
		char b = a[i];
		a[i] = a[j];
		a[j] = b;
		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k]);
		}System.out.println();
		digui(++i, --j);
	}

}
