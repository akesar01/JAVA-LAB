//no-two-elements-are-adjacent
package com.ankit;

import java.util.Scanner;

public class Main {
    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int t = s.nextInt();
        while(t>0) {
            int size = s.nextInt();
            int arr[] = new int[size];
            for (int i = 0; i < size; i++)
                arr[i] = s.nextInt();
            int final_sol = solve(arr, size);
            System.out.println( final_sol);
            t -=1;
        }
    }
    private static int solve(int arr[],int n){
        int sum [] = new int[n];

        if(n>=1)
            sum[0] = arr[0];
        if(n>=2)
            sum[1] = Math.max(arr[0],arr[1]);
        for(int i=2;i<n;i++){
            int check = Math.max(sum[i-1],sum[i-2]+arr[i]);
            sum[i] = check;
        }
        return sum[n-1];
    }
}
