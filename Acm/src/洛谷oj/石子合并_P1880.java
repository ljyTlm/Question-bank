package 洛谷oj;

import java.util.Scanner;

public class 石子合并_P1880 {

    private static int[][] dp_max;
    private static int[] ans;
    private static int[][] dp_min;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val = n;
        n *= 2;
        int [] arr = new int[n+1];
        dp_max = new int[n+1][n+1];
        dp_min = new int[n+1][n+1];
        ans = new int [n+1];
        for (int i = 1; i <= val; i++) {
            arr[i] = arr[i+val] = sc.nextInt();
        }
        for (int i = 1; i < arr.length; i++) {
            ans[i] = arr[i] + ans[i-1];
        }
        for (int k = 1; k < n; k++) {
            for (int i = 1; i+k <= n; i++) {
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                for (int j = i; j < i+k; j++) {
                    int v1 = dp_max[i][j]+dp_max[j+1][i+k]+ans[i+k]-ans[i-1];
                    int v2 = dp_min[i][j]+dp_min[j+1][i+k]+ans[i+k]-ans[i-1];
                    max = Math.max(max, v1);
                    min = Math.min(min, v2);
                }
                dp_max[i][i+k] = max;
                dp_min[i][i+k] = min;
            }
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= val; i++) {
            max = Math.max(max, dp_max[i][i+val-1]);
            min = Math.min(min, dp_min[i][i+val-1]);
        }
        System.out.println(min);
        System.out.println(max);
    }

}