package º¼µçoj;

public class hdu6201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//#include<iostream>  
//#include<cstdio>  
//#include<cmath> 
//#include <algorithm> 
//#include <map>
//#include <queue>
//#include <string>
//#include <sstream>
//#include <string.h>
//#define LL long long
//
//using namespace std;   
//
//struct Edge{
//	int idx;
//	int val;
//	int fat;
//};
//
//int t, n, pric[100002], idx, head[100002], dp[100002], a, b ,c; 
//Edge arr[400002];
//queue<Edge> qu;
//Edge edge, now;
//
//void add(int s, int e, int v){
//	arr[idx].idx = e;
//	arr[idx].val = v;
//	arr[idx].fat = head[s];
//	head[s] = idx++;
//}
//
//int main()  
//{   
//	cin>>t;
//	while(t-->0){
//		cin>>n;
//		idx = 0;
//		memset(head, -1, sizeof head);
//		for(int i = 1; i <= n; i ++){
//			scanf("%d", &pric[i]);
//			add(0, i, pric[i]);
//		}	
//		for(int i = 1; i < n; i ++){
//			scanf("%d%d%d", &a, &b, &c);
//			add(a, b, c);
//			add(b, a, c);
//		}
//		memset(dp, 0, sizeof dp);
//		edge.idx = 0;
//		edge.val = 1;
//		qu.push(edge);
//		while(!qu.empty()){
//			now = qu.front(); qu.pop();
//			int next = head[now.idx];
//			while(next != -1){
//				if(dp[arr[next].idx] == 0 || dp[arr[next].idx] > now.val + arr[next].val){
//					dp[arr[next].idx] = now.val + arr[next].val;
//					edge.idx = arr[next].idx;
//					edge.val = dp[arr[next].idx];
//					qu.push(edge);
//				}
//				next = arr[next].fat;
//			}
//		}
//		int mx = pric[1] - dp[1] + 1;
//		for(int i = 2; i <= n; i ++){
//			mx = max(mx, pric[i] - dp[i] + 1);
//		}
//		if(mx > 0)
//			cout<<mx<<endl;
//		else
//			cout<<0<<endl;
//	}
//    return 0;  
//}