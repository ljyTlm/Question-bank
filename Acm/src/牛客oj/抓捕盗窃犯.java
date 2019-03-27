package Å£¿Íoj;

public class ×¥²¶µÁÇÔ·¸ {

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
//#define ll long long
//using namespace std;
// 
//const ll mod = 1e9+7;
//const int len = 1e5+2;
// 
//int n, m, v;
// 
//struct Node {
//    int father;
//    ll value;
//    int myself;
//}node[len];
// 
//bool cmp(Node a, Node b){
//    return a.value > b.value;
//}
//  
//int main() {
//    cin>>n>>m;
//    for(int i = 1; i <= n; i ++){
//        cin>>node[i].value;
//        node[i].father = node[i].myself = i;
//    }
//    for(int i = 1; i <= n; i ++){
//        cin>>v;
//        int idx = v;
//        while(idx != node[idx].father)
//            idx = node[idx].father;
//        if(i == idx)
//            continue;
//        node[i].father = idx;
//        node[idx].value += node[i].value;
//    }
//    sort(node+1, node+n+1, cmp);
//    ll sum = 0;
//    for(int i = 1; i <= n && m > 0; i ++){
//        if(node[i].father == node[i].myself)
//            sum += node[i].value, m--;
//        //cout<<node[i].myself<<"    "<<node[i].father<<"     "<<node[i].value<<endl;
//    }  
//    cout<<sum<<endl;
//    return 0;
//}