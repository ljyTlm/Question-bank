package 杭电oj;

import java.util.LinkedList;
import java.util.Scanner;

public class hdu3549 {

	private static int[][] graph;
	private static int n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 1; i <= t; i++) {
			n = sc.nextInt();
			int m = sc.nextInt();
			graph = new int [n+1][n+1]; //这张图存的是每个点之间 管子的粗细
			for (int j = 0; j < m; j++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				int c = sc.nextInt();
				graph[x][y] += c;
			}
			//-----数据录入完毕 开始编写算法
			//首先引入一个名词 ：增广路径     
			//定义：存在这样一条 从起点到终点最小流大于0 我们认为这条路径是可增广的 我们把它叫做增广路经
			//发现我们要求的最大流实际上就是所有合法的增广路径的最小流之和
			//那么这样 我们就有了一个初步编码思路 就是纯搜索然后记录下路径上的最小值 并把这条路径标记死
			//但是在实际的实现过程中 发现一个严重的问题 就是资源浪费 造成求出的值 并不是最大的
			//在引入一个名词：反向边
			//定义 ：假设从a--->b 流量是 c b--->a 流量是 d 如果你走a到b的这条线路流量用的是e 那么你必须 在 b--->a 上 进行d+e
			//反向边的作用就是 让之前走过的路线可以反悔的机会 我的理解就是上一次走过这里的水被这一次的水顶回去了
			int sum = 0;
			while (true) {
				int value = find();
				if (value == 0) {
					break;
				}
				sum += value;
			}
			System.out.println("Case "+i+": "+sum);
		}
	}

	private static int find() {
		//这个方法就是用来寻找增广路径
		LinkedList<Integer> qu = new LinkedList<>();
		qu.push(1); //从1号点开始搜
		int value = Integer.MAX_VALUE;
		int [] flag = new int [n+1];//辅助数组 帮助我们标记 当前下标的点的上一个点是谁
		while (!qu.isEmpty()) {
			Integer idx = qu.pop();
			if (idx  == n) {
				break;
			}
			for (int i = 1; i < graph.length; i++) {
				if (graph[idx][i] > 0 && flag[i] == 0) {  //两个条件：1.有流量 2.没有被标记
					value = Math.min(value, graph[idx][i]); //我找的是全局最小所以每条路径上都可以跑这个值
					qu.push(i);
					flag[i] = idx;
				}
			}
		}
		if (flag[n] == 0) {
			return 0;
		}
		//接下来处理反向边
		int idx = n;
		while (idx != 1) {
			graph[flag[idx]][idx] -= value;//通过流量 管道被占用
			graph[idx][flag[idx]] += value;//建立反向边 保证算法的正确性
			idx = flag[idx];
		}
		return value;
	}

}
