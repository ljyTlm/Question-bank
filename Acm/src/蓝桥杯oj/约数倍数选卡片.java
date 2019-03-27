package 蓝桥杯oj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 约数倍数选卡片 {

	private static List [] list;
	private static int idx;
	private static int[] num;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String [] str_1 = read.readLine().split(" ");
		String [] str_2 = read.readLine().split(" ");
		num = new int [101];
		for (int i = 0; i < str_1.length; i++) {
			num[Integer.parseInt(str_1[i])] ++;
		}
		list = new List[101];
		for (int i = 1; i <= 100; i++) {
			list[i] = new List();
			if (num[i] > 0) {
				num[i] --;
				for (int j = 1; j <= 100; j++) {
					if ((num[j] > 0) && (i % j == 0 || j % i == 0)) {
						list[i].add(j);
					}
				}
				num[i] ++;
			}
			
		}
		for (int i = 0; i < list.length; i++) {
			int val = Integer.parseInt(str_2[i]);
			num[val] --;
			boolean bool = dfs(val);
			num[val] ++;
			if (bool) {
				System.out.println(val);
				return;
			}
		}
		System.out.println(-1);
	}

	private static boolean dfs(int val) {
		// TODO Auto-generated method stub
		for (int i = list[val].size-1; i >= 0; i--) {
			int next = list[val].get(i);
			if (num[next] > 0) {
				num[next] --;
				boolean bool = dfs(next);
				num[next] ++;
				if (bool) {
					return false;
				}
			}
		}
		return true;
	}

	

}
class List {
	int [] v;
	int size;
	public List() {
		// TODO Auto-generated constructor stub
		v = new int [101];
		size = 0;
	}
	public void add(int j) {
		// TODO Auto-generated method stub
		v[size++] = j;
	}
	public int get(int j) {
		// TODO Auto-generated method stub
		return v[j];
	}
}