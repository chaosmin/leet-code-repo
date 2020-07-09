package tech.chaosmin.leetcode.common.t0000

/**
 * 70. 爬楼梯 | 难度：简单
 *
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 注意：给定 n 是一个正整数。
 *
 * ************************************
 *
 * 执行用时 :152 ms, 在所有 Kotlin 提交中击败了49.30%的用户
 * 内存消耗 :31.1 MB, 在所有 Kotlin 提交中击败了100.00%的用户
 *
 * @author romani min
 * @since 2020/4/27
 */
object T0070ClimbingStairs {
    fun climbStairs(n: Int): Int {
        val sqrt5 = Math.sqrt(5.0)
        val d = Math.pow((1 + sqrt5) / 2, (n + 1).toDouble()) - Math.pow((1 - sqrt5) / 2, (n + 1).toDouble())
        return (d / sqrt5).toInt()
    }
}