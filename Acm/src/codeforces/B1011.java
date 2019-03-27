package codeforces;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class B1011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			Map<Integer, Integer> map = new HashMap<>();
			for (int i = 0; i < m; i++) {
				Integer key = scanner.nextInt();
				Integer value = map.get(key);
				if (value == null) {
					value = 0;
				}
				map.put(key, ++value);
			}
			List<Integer> list = new ArrayList<>();
			for (Integer value : map.values()) {
				list.add(value);
			}
			Comparator<Integer> comparator = new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					// TODO Auto-generated method stub
					return -o1.compareTo(o2);
				}
			};
			if (list.size() == 1) {
				System.out.println(list.get(0)/n);
			}else {
				list.sort(comparator);
				int multiple;
				do {
					multiple = 1;
					while (multiple != 0 && list.get(0)/(multiple+1) >= list.get(1)) {
						multiple ++;
					}
					if (multiple != 1) {
						for (int i = 0; i < multiple-1; i++) {
							list.add(list.get(0)/multiple);
						}
						list.add(list.get(0) % multiple == 0 ? list.get(0)/multiple : list.get(0)/multiple+1);
					}
					list.sort(comparator);
				} while (multiple != 1);
				System.out.println(list.size() < n ? -1 : list.get(n-1));
			}
		}
	}

}
