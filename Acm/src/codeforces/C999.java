package codeforces;
import java.util.Scanner;

public class C999 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			int [] arr = new int [27];
			int [] brr = new int [27];
			String str = scanner.next();
			for (int i = 0; i < str.length(); i++) {
				arr[str.charAt(i)-'a'] ++;
			}
			for (int i = 0; i < arr.length && k != 0; i++) {
				if (k >= arr[i]) {
					k -= arr[i];
					brr[i] = arr[i];
				}else {
					brr[i] = k;
					k = 0;
				}
			}
			for (int i = 0; i < n; i++) {
				char v = str.charAt(i);
				if (brr[v-'a'] > 0) {
					brr[v-'a'] --;
				}else {
					System.out.print(v);
				}
			}
			System.out.println();
		}
	}

}
//#include <iostream> 
//#include <cstdio> 
//#include <fstream> 
//#include <algorithm> 
//#include <cmath> 
//#include <deque> 
//#include <vector> 
//#include <queue> 
//#include <string> 
//#include <cstring> 
//#include <map> 
//#include <stack> 
//#include <set> 
//
//using namespace std;
//
//bool cmp(string v1, string v2){
//	return v1.length() > v2.length();
//}
//
//int main()
//{
//	int n,k;
//	cin>>n>>k;
//	string str;
//	cin>>str;
//	int a[27];
//	int b[27];
//	for(int i=0; i < 27; i++){
//		a[i] = 0;b[i] = 0;
//	}
//	
//	for(int i=0; i < n; i++)
//		a[str[i]-'a'] ++;
//	
//	int index = 0;
//	while(k != 0){
//		if(k > a[index]){
//			b[index] = a[index];
//			k -= a[index];
//		}else{
//			b[index] = k;
//			k = 0;
//		}
//		index ++;
//	}
//	
//	for(int i=0; i < n; i++)
//		if(b[str[i]-'a'] != 0){
//			b[str[i]-'a'] --;
//		}else{
//			cout<<str[i];
//		}
//		
//	cout<<""<<endl;
//	return 0;
//}
