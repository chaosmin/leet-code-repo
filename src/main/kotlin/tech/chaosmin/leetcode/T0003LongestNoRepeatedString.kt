package tech.chaosmin.leetcode

/**
 * 3. 无重复字符的最长子串 | 难度：中等
 *
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * ************************************
 *
 * 执行用时 :208 ms, 在所有 Kotlin 提交中击败了98.94%的用户
 * 内存消耗 :34.6 MB, 在所有 Kotlin 提交中击败了100.00%
 * 的用户
 * @author romani min
 * @since 2020/4/17
 */
object T0003LongestNoRepeatedString {
    fun lengthOfLongestSubstring(s: String): Int {
        val n: Int = s.length
        var ans = 0
        val index = IntArray(128)
        var j = 0
        var i = 0
        while (j < n) {
            i = Math.max(index[s.elementAt(j).toInt()], i)
            ans = Math.max(ans, j - i + 1)
            index[s.elementAt(j).toInt()] = j + 1
            j++
        }
        return ans
    }
}