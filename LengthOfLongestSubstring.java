package com.company.leetcode;
//给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
//示例 1:
//输入: s = "abcabcbb"
//输出: 3
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
//示例 2:
//输入: s = "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
//示例 3:
//输入: s = "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。

//提示：
//0 <= s.length <= 5 * 104
//s 由英文字母、数字、符号和空格组成


public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring(" "));
    }

    public static int lengthOfLongestSubstring(String s) {
        //转化为字符数组
        char[] strings=s.toCharArray();
        //初始最大长度为0
        int max=0;
        for (int i = 0; i <strings.length ; i++) {
            //以第一个字母为长度1
            StringBuilder childString=new StringBuilder(strings[i]+"");
            //第一个字母后一个字母开始匹配
            for (int j = i+1; j <strings.length ; j++) {
                //如果子字符串包含后面的一个字母，则截断当前子字符串
                if (childString.toString().contains(strings[j]+"")){
                    break;
                }
                //拼接子字符串
                childString=childString.append(strings[j]);
            }
            //将当前子字符串长度与之前最大长度比较，如果大于之前长度，则保存该长度
            if (childString.length()>max){
                max=childString.length();
            }
        }
        return max;
     }
}
