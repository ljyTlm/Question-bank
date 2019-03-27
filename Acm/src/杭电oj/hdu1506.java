package º¼µçoj;
import java.util.Arrays;
import java.util.Scanner;

public class hdu1506 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			if (n == 0) {
				return ;
			}
			int [] arr = new int [n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scanner.nextInt();
			}
			int [] l = new int [n];
			int [] r = new int [n];
			l[0] = -1;
			r[n-1] = n;
			for (int i = 1; i < r.length; i++) {
				if (arr[i-1] < arr[i]) {
					l[i] = i-1;
					continue;
				}
				int index = l[i-1];
				while (index != -1 && arr[index] >= arr[i]) {
					index = l[index];
				}
				l[i] = index;
			}
			long max = ( r[n-1] - l[n-1] - 1) * arr[n-1];
			for (int i = n-2; i >= 0; i--) {
				int index = i+1;
				while (index != n && arr[index] >= arr[i]) {
					index = r[index];
				}
				r[i] = index;
				int v = ( r[i] - l[i] - 1) * arr[i];
				max = max > v ? max : v; 
			}
 			System.out.println(max);
		}
	}

}
