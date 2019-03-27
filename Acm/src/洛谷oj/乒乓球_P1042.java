package Âå¹Èoj;

public class Æ¹ÅÒÇò_P1042 {

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
//#define LL long long 
//using namespace std;
//
//char arr[25*2500+10];
//int idx, x, y;
//
//int main()
//{ 
//    idx = 0;
//    while(cin>>arr[idx++]){
//        if(arr[idx-1] == 'E')
//            break;
//    }
//    if(idx == 1){
//        cout<<"0:0"<<"\n\n"<<"0:0"<<endl;
//        return 0;
//    }
//    x = y = 0;
//    for(int i = 0; i < idx-1; i ++){
//        if(arr[i] == 'W') x ++;
//        if(arr[i] == 'L') y ++;
//        if((x >= 11 | y >= 11) && abs(x-y) >= 2){
//            cout<<x<<":"<<y<<endl;
//            x = y = 0;
//        }
//    }
//    if((x == 0 && y == 0) || x != 0 || y != 0)
//        cout<<x<<":"<<y<<endl;
//    cout<<"\n";
//    x = y = 0;
//    for(int i = 0; i < idx-1; i ++){
//        if(arr[i] == 'W') x ++;
//        if(arr[i] == 'L') y ++;
//        if((x >= 21 | y >= 21) && abs(x-y) >= 2){
//            cout<<x<<":"<<y<<endl;
//            x = y = 0;
//        }
//    }
//    if((x == 0 && y == 0) || x != 0 || y != 0)
//        cout<<x<<":"<<y<<endl;
//    return 0;
//}