package Âå¹Èoj;

import java.util.Arrays;
import java.util.Scanner;

public class ½±Ñ§½ð_P1093 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			Node [] arr = new Node[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = new Node();
				arr[i].idx = i+1;
				arr[i].chinese = sc.nextInt();
				arr[i].math = sc.nextInt();
				arr[i].english = sc.nextInt();
				arr[i].total = arr[i].chinese + arr[i].math + arr[i].english;
			}
			Arrays.sort(arr);
			for (int i = 0; i < 5 && i < arr.length; i++) {
				System.out.println(arr[i].idx+" "+arr[i].total);
			}
		}
	}
	static class Node implements Comparable<Node>{
		Integer chinese;
		Integer math;
		Integer english;
		Integer idx;
		Integer total;
		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			if (total == o.total) {
				if (chinese == o.chinese) {
					return idx.compareTo(o.idx);
				}
				return -chinese.compareTo(o.chinese);
			}
			return -total.compareTo(o.total);
		}
	}
}
//#include<stdio.h>
//#include<string.h>
//#include<stdlib.h>
//#include<queue>
//#include<math.h>
//#include<vector>
//#include<map>
//#include<set>
//#include<stdlib.h>
//#include<cmath>
//#include<string>
//#include<algorithm>
//#include<iostream>
//#include<map>
//#include<stack> 
//#include<sstream>
//#define LL long long
//using namespace std;
//
//const int len = 1e5+2;
//
//struct Node {
//	int idx, chinese, math, english, total;
//};
//
//bool cmp(Node a, Node b){
//	if(a.total == b.total){
//		if(a.chinese == b.chinese)
//			return a.idx < b.idx;
//		return a.chinese > b.chinese;
//	}
//	return a.total > b.total;
//}
//
//int n;
//Node arr[300]; 
//int main() {
//	cin>>n;
//	for(int i = 0; i < n; i ++){
//		cin>>arr[i].chinese>>arr[i].math>>arr[i].english;
//		arr[i].idx = i+1;
//		arr[i].total = arr[i].chinese + arr[i].math + arr[i].english;
//	}
//	sort(arr, arr+n, cmp);
//	for(int i = 0; i < 5; i ++)
//		cout<<arr[i].idx<<" "<<arr[i].total<<endl;
//	return 0;
//}