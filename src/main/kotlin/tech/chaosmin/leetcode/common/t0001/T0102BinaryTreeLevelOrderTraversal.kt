package tech.chaosmin.leetcode.common.t0001

import tech.chaosmin.leetcode.base.TreeNode

/**
 * 102. Binary Tree Level Order Traversal | Difficulty: medium
 *
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 *
 * ************************************
 *
 * 执行用时 :256 ms, 在所有 Kotlin 提交中击败了33.33%的用户
 * 内存消耗 :36 MB, 在所有 Kotlin 提交中击败了100.00%的用户
 *
 * @author romani min
 * @since 2020/5/13
 */
object T0102BinaryTreeLevelOrderTraversal {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        if (root == null) {
            return emptyList()
        }
        val result = mutableListOf<List<Int>>()
        var list = listOf(root)
        while (list.isNotEmpty()) {
            result.add(list.map { it.`val` })
            list = list.map {
                listOfNotNull(it.left, it.right)
            }.flatten()
        }
        return result
    }
}