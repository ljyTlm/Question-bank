package Âå¹Èoj;

public class Funciton_P1464 {

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
//ll a, b, c, dp[20][20][20];
//
//ll w(ll x, ll y, ll z){
//    if(x <= 0 || y <= 0 || z <= 0)
//        return 1;
//    if(x > 20 || y > 20 || z > 20)
//        return w(20, 20, 20);
//    if(x < 20 && y < 20 && z < 20 && dp[x][y][z] != -1)
//        return dp[x][y][z];
//    if(x < y && y < z){
//        ll v1 = w(x,y,z-1);
//        ll v2 = w(x,y-1,z-1);
//        ll v3 = w(x,y-1,z);
//        if(x < 20 && y < 20 && z < 20)
//            dp[x][y][z] = v1 + v2 - v3;
//        return v1 + v2 -v3;
//    }
//    ll v1 = w(x-1,y,z);
//    ll v2 = w(x-1,y-1,z);
//    ll v3 = w(x-1,y,z-1);
//    ll v4 = w(x-1,y-1,z-1);
//    if(x < 20 && y < 20 && z < 20)
//            dp[x][y][z] = v1 + v2 + v3 - v4;
//    return v1 + v2 + v3 - v4;
//}
//
//int main()
//{
//    while(cin>>a>>b>>c && (!(a == -1 && b == -1 && c == -1))){
//        memset(dp, -1, sizeof dp);
//        ll ans = w(a, b, c);
//        printf("w(%lld, %lld, %lld) = %lld\n", a, b, c, ans);
//    }
//    return 0; 
//}