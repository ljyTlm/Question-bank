package º¼µçoj;
import java.util.Scanner;

public class hdu2111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int v = sc.nextInt();
			int n = sc.nextInt();
			int arr[][] = new int[2][n];
			int count[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[0][i] = sc.nextInt();
				arr[1][i] = sc.nextInt();

			}
			paixu(arr);
			count[0] = arr[1][0];
			for (int i = 1; i < n; i++) {
				count[i] = count[i - 1] + arr[1][i];
			}
			int sum = 0;
			for (int i = 0; i < n - 1; i++) {

				if (count[i] >= v && count[i + 1] <= v) {
					for (int k = 0; k <= i; k++) {
						sum = sum + arr[0][k] * arr[1][k];
					}
					sum = sum + arr[0][i + 1] * (v - count[i]);
				}

				if (v >= count[n - 1]) {

					for (int p = 0; p < count.length; p++) {
						sum = sum + arr[0][p] * arr[1][p];

					}
				}

			}
			System.out.println(sum);

		}
	}

	static void paixu(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int k = 0; k < arr.length - i - 1; k++) {
				if (arr[0][k + 1] > arr[0][k]) {
					int temp1 = arr[0][k + 1];
					arr[0][k + 1] = arr[0][k];
					arr[0][k] = temp1;

					int temp2 = arr[1][k + 1];
					arr[1][k + 1] = arr[1][k];
					arr[1][k] = temp2;
				}
			}
		}
	}
}
