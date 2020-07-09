package tech.chaosmin.leetcode.common.t0005

import tech.chaosmin.leetcode.base.TreeNode
import java.util.*

/**
 * 572. 另一个树的子树 | 难度：简单
 *
 * 给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。s 的一个子树包括 s 的一个节点和这个节点的所有子孙。s 也可以看做它自身的一棵子树。
 *
 * ************************************
 *
 * 执行用时 :328 ms, 在所有 Kotlin 提交中击败了50.00%的用户
 * 内存消耗 :35.7 MB, 在所有 Kotlin 提交中击败了100.00%的用户
 *
 * @author romani min
 * @since 2020/5/7
 */
object T0572SubtreeOfAnotherTree {
    private fun dfsOrder(root: TreeNode?): String {
        if (root == null) {
            return ""
        }
        val sj = StringJoiner("")
        val stack = Stack<TreeNode>().apply {
            this.push(root)
        }
        while (stack.isNotEmpty()) {
            val temp = stack.pop()
            var subString = ""
            if (temp.right != null) {
                stack.push(temp.right)
            } else {
                subString += "R"
            }
            if (temp.left != null) {
                stack.push(temp.left)
            } else {
                subString = "L$subString"
            }
            sj.add("(${temp.`val`})").add(subString)
        }
        return sj.toString()
    }

    fun isSubtree(s: TreeNode?, t: TreeNode?): Boolean {
        val source = dfsOrder(s)
        val target = dfsOrder(t)
        return source.contains(target)
    }
}