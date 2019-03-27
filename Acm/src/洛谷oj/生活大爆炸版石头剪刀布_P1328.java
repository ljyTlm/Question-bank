package 洛谷oj;

public class 生活大爆炸版石头剪刀布_P1328 {

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
//int n, a, b, x[202], y[202], sumA, sumB, idxA, idxB;
//int tbe[5][5] = {
//    {0, 0, 1, 1, 0},
//    {1, 0, 0, 1, 0},
//    {0, 1, 0, 0, 1},
//    {0, 0, 1, 0, 1},
//    {1, 1, 0, 0, 0}
//};
//int main()
//{
//    cin>>n>>a>>b;
//    for(int i = 0; i < a; i ++)
//        cin>>x[i];
//    for(int i = 0; i < b; i ++)
//        cin>>y[i];
//    sumA = sumB = idxA = idxB = 0;
//    while(n-->0){
//        sumA += tbe[x[idxA]][y[idxB]];
//        sumB += tbe[y[idxB++]][x[idxA++]];
//        idxA %= a;
//        idxB %= b;
//    }
//    cout<<sumA<<" "<<sumB<<endl;
//    return 0; 
//}