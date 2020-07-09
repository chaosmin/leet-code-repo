package tech.chaosmin.leetcode.common

/**
 * 面试题64. 求1+2+…+n | 难度：中等
 *
 * 求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 *
 * ************************************
 *
 * 执行用时 :144 ms, 在所有 Kotlin 提交中击败了72.22%的用户
 * 内存消耗 :31.5 MB, 在所有 Kotlin 提交中击败了100.00%的用户
 *
 * @author romani min
 * @since 2020/6/2
 */
object T1662SequenceSum {
    private fun sum(a: Int, b: Int): Int {
        var ans = 0
        if (b == 0) return ans
        if (b and 1 != 0) ans = a
        return ans + sum(a shl 1, b shr 1)
    }

    fun sumNums(n: Int): Int {
        return sum(n, n + 1) shr 1
    }
}