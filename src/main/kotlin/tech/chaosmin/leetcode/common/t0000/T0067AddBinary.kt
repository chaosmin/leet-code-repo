package tech.chaosmin.leetcode.common.t0000

/**
 * 67. 二进制求和 | 难度：简单
 *
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 * 输入为 非空 字符串且只包含数字 1 和 0。
 *
 * ************************************
 *
 * 执行用时：240 ms, 在所有 Kotlin 提交中击败了17.14%的用户
 * 内存消耗：35.2 MB, 在所有 Kotlin 提交中击败了100.00%的用户
 *
 * @author romani min
 * @since 2020/6/23
 */
object T0067AddBinary {
    fun addBinary(a: String, b: String): String {
        val maxLength = Math.max(a.length, b.length)
        val ra = a.reversed()
        val rb = b.reversed()
        var result = ""
        var plus = 0
        for (i in 0 until maxLength) {
            val alpha = (ra.elementAtOrNull(i) ?: '0') - '0'
            val beta = (rb.elementAtOrNull(i) ?: '0') - '0'
            when (plus + alpha + beta) {
                0 -> {
                    plus = 0
                    result = "0$result"
                }
                1 -> {
                    plus = 0
                    result = "1$result"
                }
                2 -> {
                    plus = 1
                    result = "0$result"
                }
                else -> {
                    plus = 1
                    result = "1$result"
                }
            }
            // println("alpha:$alpha,beta:$beta,plus:$plus,=>$result")
        }
        if (plus == 1) {
            result = "1$result"
        }
        return result
    }
}