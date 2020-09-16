package tech.chaosmin.leetcode.common.t0002

import tech.chaosmin.leetcode.base.TreeNode

/**
 * 226. 翻转二叉树 | 难度：简单
 *
 * 翻转一棵二叉树。
 *
 * ************************************
 *
 * 执行用时：164 ms, 在所有 Kotlin 提交中击败了96.67%的用户
 * 内存消耗：31.7 MB, 在所有 Kotlin 提交中击败了29.41%的用户
 */
object T0226InvertBinaryTree {
    fun invertTree(root: TreeNode?): TreeNode? {
        if (root != null) {
            val temp = invertTree(root.right)
            root.right = invertTree(root.left)
            root.left = temp
        }
        return root
    }
}