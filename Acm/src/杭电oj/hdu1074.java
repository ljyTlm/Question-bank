package ����oj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hdu1074 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int q = scanner.nextInt();
		for (int p = 0; p < q; p++) {
			int n = scanner.nextInt();
			HomeWork [] subs = new HomeWork[n];
			for (int i = 0; i < n; i++) {
				subs[i] =  new HomeWork(scanner.next(), scanner.nextInt(), scanner.nextInt());
			}
			int max = (int) (Math.pow(2, n) - 1);
			Node [] dp = new Node[max+1];
			dp[0] = new Node(0, 0, ""); //dp[0]��ʾһ����ҵ��û��
			for (int i = 0; i < dp.length; i++) { //��һ��ѭ�� ����ö������ ��01���� 
				for (int j = 0; j < n; j++) { //�ڶ���ѭ�� ö��n����ҵ �������� ���ڵ�ǰ״̬���˵�j����ҵ ����ת������һ��״̬������ֵ
					int indexWork = 1 << j;  //����jλ ģ���j����ҵ�ڶ����ƴ��е�λ�� 
					if ((i & indexWork) == 0) { //�жϵ�ǰ��״̬�ܲ�������j����ҵ
						int later = i | indexWork; //���������j����ҵ ��ô��ת����״̬��later
						if (dp[later] == null) { //�����ת��״̬ûֵ ֱ�Ӹ�ֵ�Ϳ�����
							int t = dp[i].t + subs[j].time;
							int o = dp[i].o + (t > subs[j].deadline ? t - subs[j].deadline : 0);
							dp[later] = new Node(t, o, dp[i].w+subs[j].subject+" ");
						}else {//�����ֵ ���бȽ��ҵ���ʱ��С��Ȼ�����
							int t = dp[i].t + subs[j].time;
							int o = dp[i].o + (t > subs[j].deadline ? t - subs[j].deadline : 0);
							if (o < dp[later].o) {
								dp[later] = new Node(t, o, dp[i].w+subs[j].subject+" ");
							}
						}
					}
				}
			}
			System.out.println(dp[max].o);
			String [] sum = dp[max].w.split(" ");
			for (int i = 0; i < sum.length; i++) {
				System.out.println(sum[i]);
			}
		}
	}
	//dp��
	static class Node {
		int t; //����ʱ
		int o; //��ʱ
		String w; //·��
		public Node(int t, int o, String w) {
			// TODO Auto-generated constructor stub
			this.t = t;
			this.o = o;
			this.w = w;
		}
	}
	//��ҵ
	static class HomeWork{
		String subject; //ѧ��
		int deadline;   //��ֹʱ��
		int time;       //���ʱ��
		public HomeWork(String subject, int deadline, int time) {
			// TODO Auto-generated constructor stub
			this.subject = subject;
			this.deadline = deadline;
			this.time = time;
		}
	}
}