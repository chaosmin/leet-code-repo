package tech.chaosmin.leetcode.common

import org.junit.Assert
import org.junit.jupiter.api.Test
import tech.chaosmin.leetcode.common.T0005LongestPalindromicSubstring

/**
 * Example 1:
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 *
 * Example 2:
 * Input: "cbbd"
 * Output: "bb"
 *
 * @author romani min
 * @since 2020/5/21
 */
internal class T0005LongestPalindromicSubstringTest {

    @Test
    fun longestPalindrome() {
        val result1 = T0005LongestPalindromicSubstring.longestPalindrome("babad")
        Assert.assertEquals("bab", result1)

        val result2 = T0005LongestPalindromicSubstring.longestPalindrome("cbbd")
        Assert.assertEquals("bb", result2)
    }
}