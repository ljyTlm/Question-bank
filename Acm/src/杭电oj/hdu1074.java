package 杭电oj;
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
			dp[0] = new Node(0, 0, ""); //dp[0]表示一个作业都没做
			for (int i = 0; i < dp.length; i++) { //第一层循环 就是枚举所有 的01排列 
				for (int j = 0; j < n; j++) { //第二层循环 枚举n门作业 用来计算 我在当前状态做了第j门作业 后跳转到另外一个状态的最优值
					int indexWork = 1 << j;  //左移j位 模拟第j门作业在二进制串中的位置 
					if ((i & indexWork) == 0) { //判断当前的状态能不能做第j门作业
						int later = i | indexWork; //如果能作第j门作业 那么跳转到的状态是later
						if (dp[later] == null) { //如果跳转的状态没值 直接赋值就可以了
							int t = dp[i].t + subs[j].time;
							int o = dp[i].o + (t > subs[j].deadline ? t - subs[j].deadline : 0);
							dp[later] = new Node(t, o, dp[i].w+subs[j].subject+" ");
						}else {//如果有值 进行比较找到罚时最小的然后更新
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
	//dp点
	static class Node {
		int t; //总用时
		int o; //罚时
		String w; //路径
		public Node(int t, int o, String w) {
			// TODO Auto-generated constructor stub
			this.t = t;
			this.o = o;
			this.w = w;
		}
	}
	//作业
	static class HomeWork{
		String subject; //学科
		int deadline;   //截止时间
		int time;       //完成时间
		public HomeWork(String subject, int deadline, int time) {
			// TODO Auto-generated constructor stub
			this.subject = subject;
			this.deadline = deadline;
			this.time = time;
		}
	}
}