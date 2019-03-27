package 杭电oj;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class hdu4857 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t -- > 0) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int [] du = new int [n+1];
			HashSet<Integer>[] graph = new HashSet [n+1];
			for (int i = 1; i < graph.length; i++) {
				graph[i] = new HashSet<Integer>();
			}
			for (int i = 0; i < m; i++) {
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				if (!graph[b].contains(a)) {
					du[a] ++;
					graph[b].add(a);
				}
			}
			Comparator<Integer> comparator = new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					// TODO Auto-generated method stub
					return -o1.compareTo(o2);
				}
			};
			PriorityQueue<Integer> queue = new PriorityQueue<>(comparator);
			for (int i = 1; i < du.length; i++) {
				if (du[i] == 0) {
					queue.add(i);
				}
			}
			int k = 1;
			String sum = "";
			while (!queue.isEmpty()) {
				Integer v = queue.poll();
				if (k == 1) {
					sum = v + sum; k = 0;
				}else {
					sum = v +" "+ sum;
				}
				for (Integer point : graph[v]) {
					if (--du[point] == 0) {
						queue.add(point);
					}
				}
			}
			System.out.println(sum);
		}
	}

}
//
//#include <iostream>   
//#include      <set>   
//#include   <string>   
//#include <iterator>   
//#include<algorithm>
//#include    <queue>
//#include <assert.h>
//using namespace std;
//
//struct cmp1
//{
//     bool operator ()(int x, int y)
//    {
//        return x > y;//小的优先级高
//    }
//};
//
//int main(){
//    int t;
//    cin>>t;
//    while(t-- > 0){
//        int n, m;
//        cin>>n>>m;
//        int du[n+1];
//        for(int i=0; i <= n; i++){
//        	du[i] = 0;
//        }
//        set<int> graph[n+1];
//        priority_queue<int> list;
//        for(int i=0; i<m; i++){
//            int a,b;
//            scanf("%d%d", &a, &b);
//            if(graph[b].count(a) == 0){
//                du[a] ++;
//                graph[b].insert(a);
//            }
//        }
//        for(int i=1; i<=n; i++){
//            if(du[i] == 0){
//                list.push(i);
//            }
//        }
//        int sum[n];
//        int index = n;
//        while(list.size() != 0) {
//            int k = list.top();
//            sum[--index] = k; 
//            list.pop();
//            set<int>::iterator iter=graph[k].begin();
//            while(iter != graph[k].end()){
//                if(--du[*iter] == 0){
//                    list.push(*iter);
//                }
//                iter ++;
//            }
//        }
//        for(int i=0; i<n; i++){
//			if(i != 0) cout<<" ";
//			cout<<sum[i];
//		} 
//		cout<<""<<endl;
//    }
//}