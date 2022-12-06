package com.company.leetcode;

import java.util.Arrays;
//给你一个由英文字母组成的字符串 s ，请你找出并返回 s 中的 最好 英文字母。返回的字母必须为大写形式。如果不存在满足条件的字母，则返回一个空字符串。
//最好 英文字母的大写和小写形式必须 都 在 s 中出现。
//英文字母 b 比另一个英文字母 a 更好 的前提是：英文字母表中，b 在 a 之 后 出现。
//示例 1：
//输入：s = "lEeTcOdE"
//输出："E"
//解释：
//字母 'E' 是唯一一个大写和小写形式都出现的字母。
//示例 2：
//输入：s = "arRAzFif"
//输出："R"
//解释：
//字母 'R' 是大写和小写形式都出现的最好英文字母。
//注意 'A' 和 'F' 的大写和小写形式也都出现了，但是 'R' 比 'F' 和 'A' 更好。
//示例 3：
//输入：s = "AbCdEfGhIjK"
//输出：""
//解释：
//不存在大写和小写形式都出现的字母。

//提示：
//1 <= s.length <= 1000
//s 由小写和大写英文字母组成

//解题：即检测是否一个字母大小写都出现，如果多个则返回后边出现的字母。
public class BestCharacter {
    public static void main(String[] args) {
    bestCharacter("arRAzFif");
    }
    public static String bestCharacter(String s){
        char[] chars=s.toCharArray();
        //先将字符数组排序，使其满足字母表顺序排序
        Arrays.sort(chars);
        //获取大小写字母间的ascll码值,用于比较两个字母之间是否是大小写关系
        int length='A'-'a';
        //从数组末尾往前遍历，保证先查出的‘最好’字母，是在字母表往后的顺序
        for (int i = chars.length-1; i >0 ; i--) {
            for (int j = i-1; j >=0 ; j--) {
                //比较两个字母是否是互为大小写关系，如果是则返回
                if (chars[i]==chars[j]-length){
                    return chars[j]+"";
                }
            }
        }
        //全部遍历未出现‘最好’字母，返回“”
        return "";
    }
}
