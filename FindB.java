package com.company.leetcode;

public class FindB {
    public static void main(String[] args) {

    }
    public int fib(int n) {
        int a=0;
        int b=1;
        if (n==0){
            return 0;
        }else if (n==1){
            return 1;
        }else {
            for (int i=2;i<=n;i++){
                int tem=b;
                b=a+b;
                a=tem;
            }
            return b;
        }

    }
}
