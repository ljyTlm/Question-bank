package º¼µçoj;
import java.util.Scanner;

public class hdu1422 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int [] arr = new int [2*n];
			int he = 0;
			int le = 0;
			int max = 0;
			for (int i = 0; i < arr.length && max != n; i++) {
				if (i < n) {
					arr[i] = scanner.nextInt() - scanner.nextInt();
					arr[i+n] = arr[i];
				}
				if (arr[i] > 0 || he + arr[i] >= 0) {
					he += arr[i];
					le ++;
					max = Math.max(max, le);
				}else {
					he = 0;
					le = 0;
				}
			}
			System.out.println(max);
		}
	}

}
