package Âå¹Èoj;

public class ÅÅ×ùÒÎ_P1056 {

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
//#define ll long long
//using namespace std;
//
//const ll mod = 1e9+7;
//
//int m, n, k, l, d; 
//int x, y, p, q;
//
//struct Node{
//    int idx, v;
//};
//
//Node h[1002], s[1002];
//
//bool cmp1(Node a, Node b){
//    return a.v > b.v ;
//}
//bool cmp2(Node a, Node b){
//    return a.idx < b.idx;
//}
//
//int main()
//{
//    cin>>m>>n>>k>>l>>d;
//    for(int i = 0; i < n+1; i ++)
//        s[i].idx = i, s[i].v = 0;
//    for(int i = 0; i < m+1; i ++)
//        h[i].idx = i, h[i].v = 0;
//    for(int i = 0; i < d; i ++){
//        cin>>x>>y>>p>>q;
//        if(x == p){
//            s[min(y, q)].v ++;
//            s[min(y, q)].idx = min(y, q);
//        }else{
//            h[min(x, p)].v ++;
//            h[min(x, p)].idx = min(x, p);
//        }
//    }
//    sort(s, s+n+1, cmp1);
//    sort(h, h+m+1, cmp1);
//    sort(s, s+l, cmp2);
//    sort(h, h+k, cmp2);
//    for(int i = 0; i < k; i ++){
//        if(i == 0)
//            cout<<h[i].idx;
//        else
//            cout<<" "<<h[i].idx;
//    }
//    cout<<"\n";
//    for(int i = 0; i < l; i ++){
//        if(i == 0)
//            cout<<s[i].idx;
//        else
//            cout<<" "<<s[i].idx;
//    }
//    cout<<"\n";
//    return 0; 
//}