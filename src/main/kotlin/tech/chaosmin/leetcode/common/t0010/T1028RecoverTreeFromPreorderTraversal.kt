package tech.chaosmin.leetcode.common.t0010

import tech.chaosmin.leetcode.base.TreeNode
import java.util.*


/**
 * 1028. 从先序遍历还原二叉树 | 难度：困难
 *
 * 我们从二叉树的根节点 root 开始进行深度优先搜索。
 * 在遍历中的每个节点处，我们输出 D 条短划线（其中 D 是该节点的深度），然后输出该节点的值。（如果节点的深度为 D，则其直接子节点的深度为 D + 1。根节点的深度为 0）。
 * 如果节点只有一个子节点，那么保证该子节点为左子节点。
 * 给出遍历输出 S，还原树并返回其根节点 root。
 *
 * @author romani min
 * @since 2020/6/18
 */
object T1028RecoverTreeFromPreorderTraversal {
    fun recoverFromPreorder(S: String): TreeNode? {
        val path: Deque<TreeNode> = LinkedList()
        val r =
            getNextNumber(S)
        var rest = r.first
        var level = r.second.first
        val root = TreeNode(r.second.second)
        path.push(root)
        while (rest.isNotBlank()) {
            val next =
                getNextNumber(
                    rest
                )
            rest = next.first
            val leaf = TreeNode(next.second.second)
            var past = path.pop()

            if (next.second.first > level) {
                past.left = leaf
                println("set ${past.`val`}'s left is ${leaf.`val`}")
            } else {
                for (i in 0..(level - next.second.first)) {
                    past = path.pop()
                }
                past.right = leaf
                println("set ${past.`val`}'s right is ${leaf.`val`}")
            }
            path.push(past)
            level = next.second.first
            path.push(leaf)
        }
        return root
    }

    private fun getNextNumber(S: String): Pair<String, Pair<Int, Int>> {
        var rest = S
        var level = 0
        while (rest.elementAt(0) == '-') {
            level++
            rest = rest.substring(1)
        }
        val value = rest.substringBefore("-").toInt()
        val index = rest.indexOf("-")
        return if (index != -1) {
            rest.substring(index) to (level to value)
        } else {
            "" to (level to value)
        }
    }
}