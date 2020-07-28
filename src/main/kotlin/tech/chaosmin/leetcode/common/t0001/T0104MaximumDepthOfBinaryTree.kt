package tech.chaosmin.leetcode.common.t0001

import tech.chaosmin.leetcode.base.TreeNode
import java.util.*


/**
 * 104. 二叉树的最大深度 | 难度：简单
 *
 * 给定一个二叉树，找出其最大深度。
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * ************************************
 *
 * 执行用时：192 ms, 在所有 Kotlin 提交中击败了98.00%的用户
 * 内存消耗：34.3 MB, 在所有 Kotlin 提交中击败了100.00%的用户
 *
 * @author romani min
 * @since 2020/7/28
 */
object T0104MaximumDepthOfBinaryTree {
    fun maxDepth(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }
        val queue: Queue<TreeNode?> = LinkedList()
        queue.offer(root)
        var ans = 0
        while (queue.isNotEmpty()) {
            var size = queue.size
            while (size > 0) {
                val node = queue.poll()
                if (node != null) {
                    if (node.left != null) {
                        queue.offer(node.left)
                    }
                    if (node.right != null) {
                        queue.offer(node.right)
                    }
                }
                size--
            }
            ans++
        }
        return ans
    }
}