package codeforces;
import java.util.Arrays;
import java.util.Scanner;

public class C825 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			int [] difficulty = new int [n];
			for (int i = 0; i < difficulty.length; i++) {
				difficulty[i] = scanner.nextInt();
			}
			Arrays.sort(difficulty);
			int sum = 0;
			for (int i = 0; i < difficulty.length; i++) {
				if (k*2 >= difficulty[i]) {
					k = Math.max(k, difficulty[i]);
				}else {
					sum ++;
					k *= 2;
					i --;
				}
			}
			System.out.println(sum);
		}
	}

}
