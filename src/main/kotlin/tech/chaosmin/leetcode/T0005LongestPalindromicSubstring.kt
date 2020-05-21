package tech.chaosmin.leetcode

/**
 * 5. Longest Palindromic Substring | Difficulty: medium
 *
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 *
 * ************************************
 *
 * 执行用时 :476 ms, 在所有 Kotlin 提交中击败了31.33%的用户
 * 内存消耗 :39.7 MB, 在所有 Kotlin 提交中击败了50.00%的用户
 *
 * @author romani min
 * @since 2020/5/21
 */
object T0005LongestPalindromicSubstring {
    fun longestPalindrome(s: String): String {
        val length = s.length
        return if (length == 1) s
        else if (length == 2 && s[0] == s[1]) s
        else if (length == 2 && s[0] != s[1]) s[0].toString()
        else {
            val dp = Array(length) { BooleanArray(length) }
            var string = ""
            for (l in 0 until length) {
                for (i in 0 until length - l) {
                    val j = i + l
                    when (l) {
                        0 -> dp[i][j] = true
                        1 -> dp[i][j] = (s[i] == s[j])
                        else -> dp[i][j] = (s[i] == s[j] && dp[i + 1][j - 1])
                    }
                    if (dp[i][j] && (l + 1 > string.length)) {
                        string = s.substring(i, i + l + 1)
                    }
                }
            }
            string
        }
    }
}