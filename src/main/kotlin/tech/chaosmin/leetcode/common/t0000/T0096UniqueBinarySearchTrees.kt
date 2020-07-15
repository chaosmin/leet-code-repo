package tech.chaosmin.leetcode.common.t0000

/**
 * 96. 不同的二叉搜索树 | 难度：中等
 *
 * 给定一个整数 n，求以 1 ... n 为节点组成的二叉搜索树有多少种？
 *
 * ************************************
 *
 * 执行用时：176 ms, 在所有 Kotlin 提交中击败了12.50%的用户
 * 内存消耗：31.4 MB, 在所有 Kotlin 提交中击败了100.00%的用户
 *
 * @author romani min
 * @since 2020/7/15
 */
object T0096UniqueBinarySearchTrees {
    fun numTrees(n: Int): Int {
        val G = IntArray(n + 1)
        G[0] = 1
        G[1] = 1
        for (i in 2..n) {
            for (j in 1..i) {
                G[i] += G[j - 1] * G[i - j]
            }
        }
        return G[n]
    }
}