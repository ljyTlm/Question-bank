package 杭电oj;

public class hdu6438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
//struct Node {
//	LL v;
//	int k; 
//	
//};
//
//struct cmp{
//	bool operator()(Node a, Node b) {//运算符重定义 
//		if(a.v == b.v)
//			return a.k > b.k;
//		return a.v > b.v;// rank > n.rank 降序  rank < n.rank 降序
//	}
//};
//
//int t, n, num;
//priority_queue<Node, vector<Node>, cmp> qu;
//LL a, ans;
//Node node;
//
//int main()
//{
//	cin>>t;
//	while(t-->0){
//		cin>>n;	
//		ans = 0;
//		num = 0;
//		for(int i = 0; i < n; i ++){
//			scanf("%lld", &a);
//			if(qu.size() != 0 && a > qu.top().v){
//				//cout<<a<<"   "<<qu.top().v<<endl; 
//				ans += a - qu.top().v;
//				num += 1 + qu.top().k;
//				qu.pop();
//				node.v = a;
//				node.k = -1;
//				qu.push(node);
//			}
//			node.v = a;
//			node.k = 1;
//			qu.push(node);
//		}
//		cout<<ans<<" "<<num<<endl;
//		while(!qu.empty()) qu.pop();
//	}
//    return 0;
//}
