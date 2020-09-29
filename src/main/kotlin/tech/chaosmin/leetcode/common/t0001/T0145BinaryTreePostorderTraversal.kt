package tech.chaosmin.leetcode.common.t0001

import tech.chaosmin.leetcode.base.TreeNode

/**
 * 145. 二叉树的后序遍历 | 难度：中等
 *
 * 给定一个二叉树，返回它的 后序 遍历。
 *
 * ************************************
 *
 * 执行用时：188 ms, 在所有 Kotlin 提交中击败了66.67%的用户
 * 内存消耗：31.9 MB, 在所有 Kotlin 提交中击败了100.00%的用户
 */
object T0145BinaryTreePostorderTraversal {
    fun postorderTraversal(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()
        if (root != null) {
            if (root.left != null) {
                result.addAll(postorderTraversal(root.left))
            }
            if (root.right != null) {
                result.addAll(postorderTraversal(root.right))
            }
            result.add(root.`val`)
        }
        return result
    }
}