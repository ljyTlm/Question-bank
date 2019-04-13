package Âå¹Èoj;


import java.util.Arrays;
import java.util.Scanner;

public class ¹ýºÓ_P1052 {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        int s = sc.nextInt();
        int t = sc.nextInt();
        int m = sc.nextInt();
        long [] arr = new long [m+2];
        for (int i = 1; i <= m; i++) {
            arr[i] = sc.nextLong();
        }
        arr[m+1] = l;
        Arrays.sort(arr);
        long ans = 0;
        for (int i = 1; i <= m+1; i++) {
            arr[i] -= ans;
            long idx = arr[i-1] + (arr[i] - arr[i-1])%72;
            ans += (arr[i]-idx);
            arr[i] = idx;
        }
        l = arr[m+1];
        int [] flag = new int[(int)l+t+1];
        for (int i = 1; i <= m; i++) {
            flag[(int)arr[i]] = 1;
        }
        int [] dp = new int[(int)l+t*2+1];
        dp[0] = 1;
        for (int i = 0; i < l; i++) {
            if (dp[i] > 0) {
                for (int j = s; j <= t; j++) {
                    if (dp[i+j] == 0) {
                        dp[i+j] = dp[i] + flag[i+j];
                    }else {
                        dp[i+j] = Math.min(dp[i+j], dp[i]+flag[i+j]);
                    }
                }
            }
        }
        int min = m;
        for (int i = ((int) l); i < l+t; i++) {
            if (dp[i] != 0) {
                min = Math.min(min, dp[i]);
            }
        }
        System.out.println(min-1);
    }

}
