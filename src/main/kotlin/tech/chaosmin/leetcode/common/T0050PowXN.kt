package tech.chaosmin.leetcode.common

/**
 * 50. Pow(x, n) | Difficulty: medium
 *
 * Implement pow(x, n), which calculates x raised to the power n (x^n).
 *
 * ************************************
 *
 * 执行用时 :192 ms, 在所有 Kotlin 提交中击败了22.22%的用户
 * 内存消耗 :32.2 MB, 在所有 Kotlin 提交中击败了100.00%的用户
 *
 * @author romani min
 * @since 2020/5/11
 */
object T0050PowXN {
    private fun quickMul(x: Double, n: Long): Double {
        var ans = 1.0
        var tx = x
        var nt = n
        while (nt > 0) {
            if (nt % 2 == 1L) {
                ans *= tx
            }
            tx *= tx
            nt /= 2
        }
        return ans
    }

    fun myPow(x: Double, n: Int): Double {
        return when {
            n >= 0 -> quickMul(x, n.toLong())
            else -> 1.0 / quickMul(x, -n.toLong())
        }
    }
}