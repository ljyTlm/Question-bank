package 杭电oj;

import java.util.*;
public class hdu1711 {
    public static int n;
    public static int m;
    public static int [] a;
    public static int [] b;
    public static int [] next;
    /**
    *   hdu1711 kmp模板题
    *   题意 给两个数组 找第二个数组在第一个数组第一次出现的位置
    *   java内置的方法A不过去这道题
    */
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0;i < t; i ++){
            n = sc.nextInt();
            m = sc.nextInt();
            a = new int [n];
            b = new int [m];
            for(int j = 0;j < n;j ++){
                a[j] = sc.nextInt();
            }
            for(int j = 0;j < m;j++){
                b[j] = sc.nextInt();
            }
            getNext1();
            int sum = kmp();
            System.out.println(sum == -1?-1:sum-m+1);
        }
    }
    //此方法利用已经弄好的next数组进行两个字符串的匹配
    //也就是kmp算法
    public static int kmp() {
        int index_a = 0;//字符串a的下标
        int index_b = 0;//字符串b的下标
        while(index_a < n){
            if(index_b == -1 || a[index_a] == b[index_b]){
                //当 index_b = -1 时 说明匹配失败要从b字符串第一个字符重新开始匹配
                //当 两个字符相等时 那不用想继续++ 匹配下一个就行了
                index_a ++;
                index_b ++;
            }else{
                //这条语句是用来告诉计算下一次匹配从b字符串的那个字符开始匹配
                //这就用上了求的next数组里面的值
                //为什么要用kmp算法呢 就在这句话上
                //匹配的时候我不能每次匹配失败我都从b字符串的第一个位置开始匹配
                //很浪费时间 所以就从上一个匹配好的地方开始匹配好了 
                //那么上一个匹配好的地方是哪里呢？
                //答：在next数组里面 所以底下的语句就这么写
                index_b =next[index_b];
            }
            if(index_b == m){
                //当index_b == m 也就是所有字符都相等了 
                //那么此时index_a 就是字符串b在字符串a中第一次出现的末尾位置
                return index_a;
            }
        }
        return -1;
    }
    
    private static void getNext1() {
		// TODO Auto-generated method stub
    	next = new int [b.length];
		next[0] = -1;
		for (int i = 1; i < next.length; i++) {
			int v = next[i-1];
			int max = 0;
			while (v != -1) {
				if (b[i-1] == b[v]) {
					max = max > v+1 ? max : v+1;
					break;
				}
				v = next[v];
			}
			next[i] = max;
		}
	}
    
    //此方法是获得next数组
    public static void getNext(){
        next = new int [n+1];
        int index = 0; //这是初始的下标
        int value = -1;//初始的跳转值 这个值必须是-1 稍后会解释为什么是-1
        next[0] = -1;  //
        while(index < m){ //下标从0开始要小于字符串的总长度
            if(value == -1 || b[index] == b[value]){
                //当value=-1表示以index所对应的字符结尾的最大相同子串长度为0
                //当b[index] = b[value] 表示以index所对应的字符结尾的最大相同子串长度在原先的基础上加1
                index ++;//匹配下一个
                value ++;//匹配下一个
                next[index] = value; //赋上相应的跳转值
            }else{
                //当以上两个条件都不满足的时候
                //要进行回退匹配
                //为什么要回退呢？
                //因为当匹配的两个字符不相等的时候
                //此时index下标对应next值（也就是最大相同子串长度）不一定为0
                //因为不相等 所以你不能直接在原基础上加1也不能直接赋成0
                //那要做什么呢？
                //所以接下来要进行回退匹配
                //既然要回退那为什么写成下面这个样子呢？
                //因为你要匹配最大相同子串 也就是光两个字符相等是不行的 
                //因为在这两个字符前面的串不一定相同 
                //那么在进行回退比较两个字符之前(也就是上面的if语句) 
                //你得保证这两个字符前面的串是一样的 不然你的比较没有意义啊
                //那么我怎么才能保证这两个字符前面的串是一样的呢？
                //还记得next存的是什么吗？
                //next数组存的就是最大长度的值next数组存的就是最大长度的值 
                //这个值有多大那么相同的子串就有多长
                //所以next[value] 也就是我们要回退 在那里进行匹配的位置
                
                //在这里解释一下为什么初始值是-1
                //在这个else与语句里我们要进行的回退操作
                //那我不能一直回退啊 退到第一个字符就不能再退了
                //所以 value的初始值和next【0】的值相同的
                //那为什么赋-1呢？
                //因为 字符一个一个匹配所以你进行的一定是++操作 初始值再进行++操作会变成0 你要写别的值他变不了0 next数组存的就不是你想要的值
                value = next[value]; 
            }
        }
    }
}