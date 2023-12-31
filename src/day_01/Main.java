package day_01;

import java.util.HashMap;

/**
 * @author ZhangGuoxiang
 * @date {2023/10/31} {15:37}
 */
public class Main {

    /**
     * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
     * 示例 1:
     *
     * 输入: s = "abcabcbb"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
     * 示例 2:
     *
     * 输入: s = "bbbbb"
     * 输出: 1
     * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
     * 示例 3:
     *
     * 输入: s = "pwwkew"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
     * @param args
     */

    public static void main(String[] args) {
        String s =" ";
        System.out.println(lengthOfLongestSubstring(s));
    }

    // 双指针
    public static int lengthOfLongestSubstring(String s) {
        int res = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = -1,j = 0; j < s.length(); j++) {
            if(map.containsKey(s.charAt(j))) {
                i = Math.max(i,map.get(s.charAt(j)));
            }
            map.put(s.charAt(j),j);
            res = Math.max(res,j-i);
        }
        return res;
    }

}
