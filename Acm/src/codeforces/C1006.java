package codeforces;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C1006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int[] arr = new int[n];
			Map<Long, Integer> map = new HashMap<>();
			Long sum = new Long("0");
			Long max = new Long("0");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scanner.nextInt();
				sum += arr[i];
				map.put(sum, i);
			}
			sum = new Long("0");
			for (int i = n - 1; i >= 1; i--) {
				sum += arr[i];
				Integer index = map.get(sum);
				if (index != null && index < i) {
					max = sum;
				}
			}
			System.out.println(max);
		}

	}
}