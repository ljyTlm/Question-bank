package 杭电oj;
//package 数据结构强化训练;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class hdu1950树状数组 {
//
//	private static long [] c;
//	private static int length;
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		while (scanner.hasNext()) {
//			int n = scanner.nextInt();
//			if (n == 0) {
//				return ;
//			}
//			Node [] arr = new Node [n];
//			for (int j = 0; j < arr.length; j++) {
//				arr[j] = new Node(scanner.nextInt(), j);
//			}
//			Arrays.sort(arr);
//			length = arr[n-1].value+10;
//			c = new long [length];
//			int sum = 0;
//			for (int j = n-1; j >= 0; j--) {
//				int v = sum(arr[j].index+1);
//				sum += v;
//				add(arr[j].index+1);
//			}
//			System.out.println(sum);
//		}
//	}
//
//	private static void add(int x) {
//		while (x < length) {
//			c[x]++;
//			x += lowbit(x);
//		}
//	}
//
//	private static int sum(int x) {
//		int sum = 0;
//		while (x > 0) {
//			sum += c[x];
//			x -= lowbit(x);
//		}
//		return sum;
//	}
//
//	private static int lowbit(int x) {
//		// TODO Auto-generated method stub
//		return x & (-x);
//	}
//
//}
////class Node implements Comparable<Node>{
////	Integer value;
////	Integer index;
////	public Node(int v,int i) {
////		value = v;
////		index = i;
////	}
////	
////	@Override
////	public int compareTo(Node o) { 
////		// TODO Auto-generated method stub
////		return value.compareTo(o.value);
////	}
////}
//
