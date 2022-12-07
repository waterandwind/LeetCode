package com.company.leetcode;

public class ReplaceElements {
    public static void main(String[] args) {
        for (int item:
                replaceElements(new int[]{17,18,5,4,6,1}) ) {
           System.out.print(item+" ");
        }

    }

    public static int[] replaceElements(int[] arr){
        for (int i = 0; i <arr.length; i++) {
            if (i==arr.length-1){
                arr[i]=-1;
                break;
            }
            int max=arr[i+1];
            for (int j = i+1; j <arr.length ; j++) {
                if (max<arr[j]){
                    max=arr[j];
                }
            }
            arr[i]=max;
        }

        return arr;
    }
}
