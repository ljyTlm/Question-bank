package 杭电oj;

import java.util.Scanner;

public class hdu5778 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		for (int i = v; i >= 2; i--) {
			int flag = 0;
			for (int j = 2; j <= i/2; j++) {
				if(i%j == 0)
					flag = 1;
			}
			if (flag == 0) {
				System.out.println(i);
				break;
			}
		}
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
//#define LL long long
//
//using namespace std;   
//
//
//int t;
//LL x;
//LL ans;
//
//bool cheek(LL v){
//	if(v < 2)
//		return false;
//	LL p = v;
//	for(LL i = 2; i*i <= v; i ++){
//		if(v%i==0)
//        {
//            if(v%(i*i)==0)//出现了超过一次
//            {
//                return false;
//            }
//            v/=i;
//        }
//	}
//	ans = min(ans, abs(p*p-x));
//	return true;
//}
//
//int main()  
//{   
//	cin>>t;
//	while(t-->0){
//		cin>>x;
//		ans = 0x7fffffffffffffffll;
//		LL s = (LL)(sqrt(x)+0.5);
//		int flag = 0;
//		for(LL i = 0; ; i ++){
//			if(cheek(s+i)){
//				flag = 1;
//			}
//			if(cheek(s-i)){
//				flag = 1;
//			}
//			if(flag == 1){
//				break;
//			}
//		}
//		cout<<ans<<endl;
//	}
//    return 0;  
//}