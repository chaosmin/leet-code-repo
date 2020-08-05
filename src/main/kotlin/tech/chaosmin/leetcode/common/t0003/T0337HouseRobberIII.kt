package tech.chaosmin.leetcode.common.t0003

import tech.chaosmin.leetcode.base.TreeNode


/**
 * 337. 打家劫舍 III | 难度：中等
 *
 * 在上次打劫完一条街道之后和一圈房屋后，小偷又发现了一个新的可行窃的地区。
 * 这个地区只有一个入口，我们称之为“根”。 除了“根”之外，每栋房子有且只有一个“父“房子与之相连。
 * 一番侦察之后，聪明的小偷意识到“这个地方的所有房屋的排列类似于一棵二叉树”。
 * 如果两个直接相连的房子在同一天晚上被打劫，房屋将自动报警。
 * 计算在不触动警报的情况下，小偷一晚能够盗取的最高金额。
 *
 * ************************************
 *
 * 执行用时：220 ms, 在所有 Kotlin 提交中击败了77.27%的用户
 * 内存消耗：36.4 MB, 在所有 Kotlin 提交中击败了28.57%的用户
 *
 * @author romani min
 * @since 2020/8/5
 */
object T0337HouseRobberIII {
    var f = mutableMapOf<TreeNode?, Int>()
    var g = mutableMapOf<TreeNode?, Int>()

    fun rob(root: TreeNode?): Int {
        dfs(root)
        return Math.max(f.getOrDefault(root, 0), g.getOrDefault(root, 0));

    }

    fun dfs(node: TreeNode?) {
        if (node == null) return
        dfs(node.left)
        dfs(node.right)
        f[node] = node.`val` + g.getOrDefault(node.left, 0) + g.getOrDefault(node.right, 0)
        val fl = f.getOrDefault(node.left, 0)
        val gl = g.getOrDefault(node.left, 0)
        val fr = f.getOrDefault(node.right, 0)
        val gr = g.getOrDefault(node.right, 0)
        g[node] = Math.max(fl, gl) + Math.max(fr, gr)
    }
}