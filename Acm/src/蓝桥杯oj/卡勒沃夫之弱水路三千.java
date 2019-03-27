package À¶ÇÅ±­oj;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class ¿¨ÀÕÎÖ·òÖ®ÈõË®Â·ÈıÇ§ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			Map<String, Integer> map = new HashMap<>();
			int [] limit = new int [300];
			int n = scanner.nextInt();
			int [][] tu = new int [300][300];
			String [] name = new String [300];
			int k = 1;
			for (int j = 0; j < n; j++) {
				String oneMM = scanner.next();
				String twoMM = scanner.next();
				Integer one = map.get(oneMM);
				Integer two = map.get(twoMM);
				if (one == null) {
					map.put(oneMM, k);
					name[k] = oneMM;
					k++;
				}
				if (two == null) {
					map.put(twoMM, k);
					name[k] = twoMM;
					k ++;
				}
				one = map.get(oneMM);
				two = map.get(twoMM);
				limit[two] ++;
				tu[one][two] = 1;
			}
			LinkedList<Integer> queue = new LinkedList<>();
			for (int j = 1; j < k; j++) {
				if (limit[j] == 0) {
					queue.add(j);
				}
			}
			List<Integer> list = new ArrayList<>();
			while (!queue.isEmpty()) {
				Integer head = queue.poll();
				list.add(head);
				for (int j = 1; j < k; j++) {
					if (tu[head][j] == 1) {
						tu[head][j] = 0;
						limit[j] -= 1;
						if (limit[j] == 0) {
							queue.add(j);
						}
					}
				}
			}
			for (int j = 0; j < list.size(); j++) {
				if (j == 0) {
					System.out.print(name[list.get(j)]);
				}else {
					System.out.print(" "+name[list.get(j)]);
				}
			}
			System.out.println();
		}
	}

}
