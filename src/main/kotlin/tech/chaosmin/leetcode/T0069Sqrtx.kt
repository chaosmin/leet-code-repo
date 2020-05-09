package tech.chaosmin.leetcode

/**
 * 69. Sqrt(x) | Difficulty: simple
 *
 * Implement int sqrt(int x).
 * Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
 * Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.
 *
 * ************************************
 *
 * 执行用时 :176 ms, 在所有 Kotlin 提交中击败了35.71%的用户
 * 内存消耗 :32.1 MB, 在所有 Kotlin 提交中击败了100.00%的用户
 *
 * @author romani min
 * @since 2020/5/9
 */
object T0069Sqrtx {
    fun mySqrt(x: Int): Int {
        if (x == 0) {
            return 0
        }
        val c = x.toDouble()
        var x0 = x.toDouble()
        while (true) {
            val xi = 0.5 * (x0 + c / x0)
            if (Math.abs(x0 - xi) < 1e-7) {
                break
            }
            x0 = xi
        }
        return x0.toInt()
    }
}