package tech.chaosmin.leetcode.common

/**
 * 1014. 最佳观光组合 | 难度：中等
 *
 * 给定正整数数组 A，A[i] 表示第 i 个观光景点的评分，并且两个景点 i 和 j 之间的距离为 j - i。
 * 一对景点（i < j）组成的观光组合的得分为（A[i] + A[j] + i - j）：景点的评分之和减去它们两者之间的距离。
 * 返回一对观光景点能取得的最高分。
 *
 * ************************************
 *
 * 执行用时 :352 ms, 在所有 Kotlin 提交中击败了100.00%的用户
 * 内存消耗 :45.3 MB, 在所有 Kotlin 提交中击败了100.00%的用户
 *
 * @author romani min
 * @since 2020/6/17
 */
object T1014BestSightseeingPair {
    fun maxScoreSightseeingPair(A: IntArray): Int {
        var ans = 0
        var maxPoint = A[0]
        for (i in 1 until A.size) {
            ans = Math.max(ans, maxPoint + A[i] - i)
            maxPoint = Math.max(maxPoint,A[i] + i)
        }
        return ans
    }
}