package tech.chaosmin.leetcode.common.t0000

import tech.chaosmin.leetcode.base.TreeNode

/**
 * 94. 二叉树的中序遍历 | 难度：中等
 *
 * 给定一个二叉树，返回它的中序 遍历。
 *
 * ************************************
 *
 * 执行用时：176 ms, 在所有 Kotlin 提交中击败了92.78%的用户
 * 内存消耗：32.7 MB, 在所有 Kotlin 提交中击败了83.33%的用户
 */
object T0094BinaryTreeInorderTraversal {
    fun inorderTraversal(root: TreeNode?): List<Int> {
        val res = mutableListOf<Int>()
        var predecessor: TreeNode?
        var current = root
        while (current != null) {
            if (current.left != null) {
                // predecessor 节点就是当前 current 节点向左走一步，然后一直向右走至无法走为止
                predecessor = current.left
                while (predecessor!!.right != null && predecessor.right !== current) {
                    predecessor = predecessor.right
                }

                // 让 predecessor 的右指针指向 current，继续遍历左子树
                if (predecessor.right == null) {
                    predecessor.right = current
                    current = current.left
                } else {
                    res.add(current.`val`)
                    predecessor.right = null
                    current = current.right
                }
            } else {
                res.add(current.`val`)
                current = current.right
            }
        }
        return res
    }
}