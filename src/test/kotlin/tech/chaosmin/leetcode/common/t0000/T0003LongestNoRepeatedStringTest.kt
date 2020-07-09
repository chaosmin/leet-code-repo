package tech.chaosmin.leetcode.common.t0000

import org.junit.Assert
import org.junit.jupiter.api.Test

/**
 * 示例1
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 *
 * 示例 2:
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 *
 * 示例 3:
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *
 * 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 *
 * @author romani min
 * @since 2020/4/17
 */
internal class T0003LongestNoRepeatedStringTest {

    @Test
    fun lengthOfLongestSubstring() {
        val testCase1 = "abcabcbb"
        val result1 = T0003LongestNoRepeatedString.lengthOfLongestSubstring(testCase1)
        Assert.assertEquals(3, result1)

        val testCase2 = "bbbbb"
        val result2 = T0003LongestNoRepeatedString.lengthOfLongestSubstring(testCase2)
        Assert.assertEquals(1, result2)

        val testCase3 = "pwwkew"
        val result3 = T0003LongestNoRepeatedString.lengthOfLongestSubstring(testCase3)
        Assert.assertEquals(3, result3)
    }
}