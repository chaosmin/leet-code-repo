package tech.chaosmin.leetcode

import tech.chaosmin.leetcode.base.TreeNode
import java.util.*


/**
 * 199. 二叉树的右视图 | 难度：中等
 *
 * 给定一棵二叉树，想象自己站在它的右侧，按照从顶部到底部的顺序，返回从右侧所能看到的节点值。
 *
 * ************************************
 *
 * 执行用时 :220 ms, 在所有 Kotlin 提交中击败了33.33%的用户
 * 内存消耗 :34.4 MB, 在所有 Kotlin 提交中击败了100.00%的用户
 *
 * @author romani min
 * @since 2020/4/22
 */
object T0199RightViewOfBinaryTree {
    fun rightSideView(root: TreeNode?): List<Int> {
        val map = mutableMapOf<Int, Int>()
        var maxDepth = -1
        val nodeQueue = Stack<TreeNode>()
        val depthQueue = Stack<Int>()
        nodeQueue.push(root)
        depthQueue.push(0)
        while (nodeQueue.isNotEmpty()) {
            val node = nodeQueue.pop()
            val depth = depthQueue.pop()
            if (node != null) {
                maxDepth = Math.max(maxDepth, depth)
                if (!map.containsKey(depth)) {
                    map[depth] = node.`val`
                }
                // 先左后右
                nodeQueue.push(node.left)
                depthQueue.push(depth + 1)
                nodeQueue.push(node.right)
                depthQueue.push(depth + 1)

            }
        }

        return (0..maxDepth).map {
            map[it] ?: 0
        }
    }
}