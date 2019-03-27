package º¼µçoj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hdu1864 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			double max = scanner.nextDouble();
			int n = scanner.nextInt();
			if (n == 0) {
				return ;
			}
			ArrayList<Double> list = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				int m = scanner.nextInt();
				double money = 0;
				Map<String, Double> map = new HashMap<>();
				for (int j = 0; j < m; j++) {
					String[] split = scanner.next().split(":");
					Double v = map.get(split[0]);
					if (v == null) {
						v = 0.0;
					}
					map.put(split[0], v+Double.valueOf(split[1]));
				}
				for (String key : map.keySet()) {
					if (key.equals("A") || key.equals("B") || key.equals("C")) {
						if (map.get(key) > 600.0) {
							money = -1;
							break;
						}
						money += map.get(key);
					}else {
						money = -1;
						break;
					}
				}
				if (money != -1) {
					list.add(money);
				}
			}
			double [] dp = new double [list.size()+1];
			for (int i = 0; i < list.size(); i++) {
				for (int j = 1; j <= (i+1); j++) {
					double v = dp[j-1] + list.get(i);
					if (v <= max) {
						dp[j] = Math.max(dp[j], v);
					}
					dp[j] = Math.max(dp[j], dp[j-1]);
				}
			}
			System.out.printf("%.2f",dp[list.size()]);
			System.out.println();
		}
	}

}
