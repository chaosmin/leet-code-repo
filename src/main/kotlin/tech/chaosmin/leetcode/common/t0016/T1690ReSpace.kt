package tech.chaosmin.leetcode.common.t0016

import tech.chaosmin.leetcode.base.Trie

/**
 * 面试题 17.13. 恢复空格 | 难度：中等
 *
 * 哦，不！你不小心把一个长篇文章中的空格、标点都删掉了，并且大写也弄成了小写。像句子"I reset the computer.
 * It still didn’t boot!"已经变成了"iresetthecomputeritstilldidntboot"。
 * 在处理标点符号和大小写之前，你得先把它断成词语。
 * 当然了，你有一本厚厚的词典dictionary，不过，有些词没在词典里。
 * 假设文章用sentence表示，设计一个算法，把文章断开，要求未识别的字符最少，返回未识别的字符数。
 *
 * 注意：本题相对原题稍作改动，只需返回未识别的字符数
 *
 * ************************************
 *
 * 执行用时：480 ms, 在所有 Kotlin 提交中击败了100.00%的用户
 * 内存消耗：54.4 MB, 在所有 Kotlin 提交中击败了100.00%的用户
 *
 * @author romani min
 * @since 2020/7/9
 */
object T1690ReSpace {
    fun respace(dictionary: Array<String>, sentence: String): Int {
        val root = Trie()
        dictionary.forEach { root.insert(it) }
        val dp = IntArray(sentence.length + 1) { Integer.MAX_VALUE }
        dp[0] = 0
        for (i in 1..sentence.length) {
            dp[i] = dp[i - 1] + 1
            var curPos = root
            for (j in i downTo 1) {
                val t: Int = sentence.elementAt(j - 1) - 'a'
                if (curPos.next[t] == null) {
                    break
                } else if (curPos.next[t]?.end == true) {
                    dp[i] = Math.min(dp[i], dp[j - 1])
                }
                if (dp[i] == 0) {
                    break
                }
                curPos = curPos.next[t]!!
            }
        }
        return dp[sentence.length]
    }
}