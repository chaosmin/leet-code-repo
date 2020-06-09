package tech.chaosmin.leetcode

/**
 * 面试题46. 把数字翻译成字符串 | 难度：中等
 *
 * 给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。一个数字可能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。
 *
 * ************************************
 *
 * 执行用时 :176 ms, 在所有 Kotlin 提交中击败了33.33%的用户
 * 内存消耗 :31.3 MB, 在所有 Kotlin 提交中击败了100.00%的用户
 *
 * @author romani min
 * @since 2020/6/9
 */
object T1644LCOF {
    fun translateNum(num: Int): Int {
        var p = 0
        var q = 0
        var r = 1
        val string = num.toString()
        for (i in string.indices) {
            p = q
            q = r
            r = 0
            r += q
            if (i == 0) continue
            val temp = string.substring(i - 1, i + 1)
            // println("$temp  p:$p q:$q r:$r")
            if (temp >= "10" && temp <= "25") {
                r += p
            }
        }
        return r
    }
}