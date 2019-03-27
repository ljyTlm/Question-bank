package 蓝桥杯oj;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class 分数统计 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			ArrayList<Integer> [] arr = new ArrayList[5];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = new ArrayList<>();
			}
			int k = scanner.nextInt();
			scanner.nextLine();
			String [] n = scanner.nextLine().split(" ");
			for (int i = 0; i < n.length; i++) {
				int v = Integer.valueOf(n[i]);
				if (v>=90 && v <= 100) {
					arr[0].add(v);
				}else if (v >= 80 && v <= 89) {
					arr[1].add(v);
				}else if (v >= 70 && v <= 79) {
					arr[2].add(v);
				}else if (v >= 60 && v <= 69) {
					arr[3].add(v);
				}else {
					arr[4].add(v);
				}
			}
			int max = Integer.MIN_VALUE;
			int index = 0;
			for (int i = 0; i < 5; i++) {
				System.out.print(i == 0 ? arr[i].size() : " "+arr[i].size());
				if (max < arr[i].size()) {
					max = arr[i].size();
					index = i;
				}
			}
			System.out.println();
			System.out.println(max);
			Object[] array = arr[index].toArray();
			Arrays.sort(array);
			String sum = "";
			for (int i = array.length-1; i >= 0; i--) {
				sum += array[i] + " ";
			}
			System.out.println(sum.substring(0,sum.length()-1));
		}
	}

}
