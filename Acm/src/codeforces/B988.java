package codeforces;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class B988 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			String [] str = new String [n];
			for (int i = 0; i < str.length; i++) {
				str[i] = sc.next();
			}
			Comparator<String> com = new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					// TODO Auto-generated method stub
					Integer a = o1.length();
					Integer b = o2.length();
					return a.compareTo(b);
				}
			};
			Arrays.sort(str,com);
			String sum = "YES\n";
			for (int i = 0; i < str.length-1; i++) {
				if (!str[i+1].contains(str[i])) {
					sum = "NO";
					break ;
				}
				sum += str[i]+"\n";
				if (i == str.length-2) {
					sum += str[i+1]; 
				}
			}
			System.out.println(sum + (n==1?str[0]:""));
		}
	}

}
//c++ДњТы
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
//	int n;
//	cin>>n;
//	string str[n];
//	for(int i=0; i < n; i++){
//		cin>>str[i];
//	}
//	sort(str,str+n,cmp);
//	for(int i=0;i < n-1; i++){
//		if(str[i].find(str[i+1]) == -1){
//			cout<<"NO"<<endl;
//			return 0;
//		}
//	}
//	cout<<"YES"<<endl;
//	for(int i=n-1;i >= 0; i--){
//		cout<<str[i]<<endl;
//	}
//	return 0;
//}