package com.company.leetcode;

//编写一个函数来查找字符串数组中的最长公共前缀。
//
//        如果不存在公共前缀，返回空字符串 ""。
//        示例 1：
//        输入：strs = ["flower","flow","flight"]
//        输出："fl"
//        提示：
//        1 <= strs.length <= 200
//        0 <= strs[i].length <= 200
//        strs[i] 仅由小写英文字母组成

//提示解读，数组长度不为0，但是数组元素可能存在空串。
//要求：公共前缀是所有字符串都有的，如果一个字符串找不到这个前缀，则不满足要求，因此如果存在最长公共前缀，则它必然是所有字符串的前缀。
//所以可以从任意字符串本身长度作为前缀开始跟其他字符串笔记，如果匹配不到，则可以缩短最后字母，重新遍历匹配。直到成为空串，即不存在公共前缀为止。
public class CommonFix {
    public static void main(String[] args) {
        String[] strs={"flower","flow","flight"};
        System.out.println(  longestCommonPrefix(strs));

    }
    public static String longestCommonPrefix(String[] strs) {

       //取任意字符串为开始比较的前缀
        String result=strs[0];
        while (result.length()>=0){
            //长度为0，意味着当前匹配前缀为“”空串，不存在最长前缀了
            if (result.length()==0)
                return result;
            //初始标记为true
            boolean flag=true;
            for (String item:strs
            ) {
                if (!item.startsWith(result)) {
                    //遍历匹配，如果出现一个元素匹配不成功，意味着本次匹配的前缀非公共前缀，没有必要继续匹配，中断遍历
                    flag = false;
                    break;
                }
            }
            //如果标志为true,说明本次遍历匹配不存在匹配不上，即当前前缀就是最长前缀，否则需要减少一个末尾字符，继续匹配，直到空串
            if (flag){
                return result;
            }else
            result=result.substring(0, result.length()-1);
        }
        return "";

    }
}
