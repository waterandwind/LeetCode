package com.company.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class NodereversePrint {
    public static void main(String[] args) {
        ListNode node=new ListNode(1);
       boolean result= hasCycle(node);
       short s=1;
       byte b=127;
       float f= (float) 1.3;
       System.out.println(result);
    }
    public static int[] reversePrint(ListNode head){
        int[] a=new int[length(head)];
        for (int i=a.length-1;i>=0;i--){
            a[i]=head.val;
            head=head.next;
            length(head);
        }
        return  a;
    }

    public static int length(ListNode head){
        int length=1;
        while (head.next!=null){
            head=head.next;
            length++;
        }
                return length;

    }


    public static boolean hasCycle(ListNode head) {
        Set<ListNode> set=new HashSet<>();
        while(head.next!=null){
            if(!set.add(head)){
               return true;
            }

        }
        return false;

    }

    public int[] twoSum(int[] nums, int target) {
        int [] result=new int[2];
        for (int i=0;i<nums.length;i++){
            result[0]=nums[i];
            for (int j=i+1;j<nums.length-1;j++){
                if (nums[j]==target-nums[i]){
                    result[1]=nums[j];
                    return result;
                }
            }
        }
        return result;
    }

    public int[] getLeastNumbers(int[] arr, int k) {
        int[] result = new int[k];
        for (int i=0;i<k;i++){
            for (int j=arr.length-1;j>=1;j--){
               if (arr[j]<arr[j-1]){
                   int tme=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=tme;
               }
            }
            result[i]=arr[i];
        }
        return result;
    }

    public int search(int[] nums, int target) {
        int count=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==target)
                count++;
            else if (nums[i]>target)
                break;
        }
        return count;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
  interface  a {
    static void fun1(){}
    default void fu2(){}
  }