package tech.chaosmin.leetcode.common.t0000

import tech.chaosmin.leetcode.base.TreeNode


/**
 * 95. 不同的二叉搜索树 II | 难度：中等
 *
 * 给定一个整数 n，生成所有由 1 ... n 为节点所组成的 二叉搜索树。
 *
 * ************************************
 *
 * 执行用时：280 ms, 在所有 Kotlin 提交中击败了20.00%的用户
 * 内存消耗：38 MB, 在所有 Kotlin 提交中击败了100.00%的用户
 *
 * @author romani min
 * @since 2020/7/21
 */
object T0095UniqueBinarySearchTreesII {
    fun generateTrees(n: Int): List<TreeNode?> {
        return if (n == 0) listOf()
        else generateTrees(1, n)

    }

    private fun generateTrees(start: Int, end: Int): List<TreeNode?> {
        val allTrees = mutableListOf<TreeNode?>()
        if (start > end) {
            allTrees.add(null)
            return allTrees
        }

        // 枚举可行根节点
        for (i in start..end) {
            // 获得所有可行的左子树集合
            val leftTrees = generateTrees(start, i - 1)

            // 获得所有可行的右子树集合
            val rightTrees = generateTrees(i + 1, end)

            // 从左子树集合中选出一棵左子树，从右子树集合中选出一棵右子树，拼接到根节点上
            for (left in leftTrees) {
                for (right in rightTrees) {
                    val currTree = TreeNode(i)
                    currTree.left = left
                    currTree.right = right
                    allTrees.add(currTree)
                }
            }
        }
        return allTrees
    }
}