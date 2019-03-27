package 杭电oj;

import java.util.ArrayList;
import java.util.Scanner;


public class hdu2063 {

	private static ArrayList[] girl;
	private static int[] girlFriend;
	private static boolean[] flag;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int k = sc.nextInt();
			if (k == 0) {
				return;
			}
			int m = sc.nextInt(); //女生的人数
			int n = sc.nextInt(); //男生的人数
			girl = new ArrayList [m+1];
			for (int i = 0; i < girl.length; i++) {
				girl[i] = new ArrayList<Integer>();
			}
			for (int i = 0; i < k; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				//表示 女生a 想和 男生b 一个车
				girl[a].add(b);
			}
			//--------数据输入完毕 开始实现算法
			//我们只需要知道每个男生的女朋友是谁
			girlFriend = new int [n+1];
			//接下来 我们要给每个女生找男朋友 同时记录最大的匹配对数
			int max = 0;
			for (int i = 1; i < girl.length; i++) {
				//如果这个女生能找到男朋友 那么 最大的匹配对数就要在原来的基础上+1
				//找到男朋友就返回1 找不到就返回0
				flag = new boolean [n+1];
				max += find(i);
			}
			System.out.println(max);
		}
	}

	private static int find(int i) {
		// 这个方法干什么呢？
		//答：这个方法的功能是给指定编号的女生找男朋友
		for (int j = 0; j < girl[i].size(); j++) {
			//那么找谁呢？  根据题意 你要找这个编号的女生喜欢的是谁
			//如果这个男生没有女朋友 那么直接匹配成一对 就好啦
			//分为两种情况 
			//1.这个男生没有女朋友
			//2.这个男生有女朋友
			//按照刚才走的流程发现 会无限递归卡死不动 原因是之前的路径并没有被标记掉 就无限的重复走
			//接下来我们要对 一条匹配流程进行标记 就需要一个地方储存标记值
			int boy = (int)girl[i].get(j);
			if (flag[boy]) { //初始化的时候 数组里面全是假 可以理解为一个都没有标记
				continue;
			}
			flag[boy] = true; //我现在要对这个男生进行搜索 所以我现在把它标记掉
			if (girlFriend[boy] == 0 || find(girlFriend[boy]) == 1) {
				girlFriend[(int)girl[i].get(j)] = i;
				return 1;
			}
		}
		return 0;
	}

}
