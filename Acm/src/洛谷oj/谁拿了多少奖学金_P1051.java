package 洛谷oj;

import java.util.Arrays;
import java.util.Scanner;

public class 谁拿了多少奖学金_P1051 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			Node [] arr = new Node[n];
			int ans = 0;
			for (int i = 0; i < arr.length; i++) {
				arr[i] = new Node();
				arr[i].idx = i;
				arr[i].name = sc.next();
				arr[i].score_1 = sc.nextInt();
				arr[i].score_2 = sc.nextInt();
				arr[i].student = sc.next().equals("Y");
				arr[i].west = sc.next().equals("Y");
				arr[i].text = sc.nextInt();
				arr[i].money = 0;
				if (arr[i].score_1 > 80 && arr[i].text > 0) {
					arr[i].money += 8000;
				}
				if (arr[i].score_1 > 85 && arr[i].score_2 > 80) {
					arr[i].money += 4000;
				}
				if (arr[i].score_1 > 90) {
					arr[i].money += 2000;
				}
				if (arr[i].score_1 > 85 && arr[i].west) {
					arr[i].money += 1000;
				}
				if (arr[i].score_2 > 80 && arr[i].student) {
					arr[i].money += 850;
				}
				ans += arr[i].money;
			}
			Arrays.sort(arr);
			System.out.println(arr[0].name+"\n"+arr[0].money+"\n"+ans);
		}
	}
	static class Node implements Comparable<Node>{
		Integer idx;
		String name;
		Integer score_1;
		Integer score_2;
		Boolean student;
		Boolean west;
		Integer text;
		Integer money;
		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			if (money == o.money) {
				return idx.compareTo(o.idx);
			}
			return -money.compareTo(o.money);
		}
	}
}
