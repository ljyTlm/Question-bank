package À¶ÇÅ±­oj;

import java.util.HashMap;
import java.util.Scanner;

public class °ü×Ó´ÕÊý {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			HashMap<Integer, Integer> map = new HashMap<>();
			int n = scanner.nextInt();
			int [] arr = new int [n];
			int k = 0;
			int max = 0;
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scanner.nextInt();
				if (arr[i] % 2 == 1) {
					k = 1;
				}
				map.put(arr[i], 1);
				max = max > arr[i] ? max : arr[i];
			}
			if (k == 0) {
				System.out.println("INF");
				continue;
			}
			int sum = 0;
			int length = 0;
			for (int i = 1; i < Integer.MAX_VALUE; i++) {
				if (map.get(i) == null) {
					sum ++;
					length = 0;
				}else {
					length ++;
					for (int j = 0; j < arr.length; j++) {
						map.put(i+arr[j],1);
					}
				}
				if (length >= max || sum > 20000) {
					break;
				}
			}
			if (sum > 20000) {
				System.out.println("INF");
				continue;
			}
			System.out.println(sum);
		}
	}

}
