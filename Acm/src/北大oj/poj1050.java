package 北大oj;
import java.util.Scanner;

public class poj1050 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int [][] arr = new int [n][n];
			int [] landscape = new int [n]; //横向
			int [] vertical = new int [n];  //竖向
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = scanner.nextInt();
					landscape[i] += arr[i][j];
					vertical[j] += arr[i][j];
				}
			}
			int [] l = findMaxSum(landscape);
			int [] v = findMaxSum(vertical);
			int sum = 0;
			for (int i = v[0]; i <= v[1]; i++) {
				for (int j = l[0]; j <= l[1]; j++) {
					sum += arr[i][j];
				}
			}
			System.out.println(sum);
		}
	}

	private static int[] findMaxSum(int[] arr) {
		// TODO Auto-generated method stub
		int s = 0;
		int e = 0;
		int max = 0;
		int q = 0;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (sum < 0) {
				sum = 0;
				q = i;
			}
			sum += arr[i];
			if (sum > max) {
				s = q;
				e = i;
				max = sum;
			}
		}
		int [] v = {s,e};
		return v;
	}

}
