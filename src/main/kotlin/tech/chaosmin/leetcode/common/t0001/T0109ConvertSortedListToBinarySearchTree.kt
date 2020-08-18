package tech.chaosmin.leetcode.common.t0001

import tech.chaosmin.leetcode.base.ListNode
import tech.chaosmin.leetcode.base.TreeNode

/**
 * 109. 有序链表转换二叉搜索树 | 难度：中等
 *
 * 给定一个单链表，其中的元素按升序排序，将其转换为高度平衡的二叉搜索树。
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 *
 * ************************************
 *
 * 执行用时：260 ms, 在所有 Kotlin 提交中击败了52.94%的用户
 * 内存消耗：36.1 MB, 在所有 Kotlin 提交中击败了100.00%的用户
 *
 * @author romani min
 * @since 2020/8/18
 */
object T0109ConvertSortedListToBinarySearchTree {
    fun sortedListToBST(head: ListNode?): TreeNode? {
        return buildTree(head, null)
    }

    private fun buildTree(left: ListNode?, right: ListNode?): TreeNode? {
        if (left == right) {
            return null
        }
        val mid = getMidNum(left, right)
        return TreeNode(mid?.`val` ?: -1).apply {
            this.left = buildTree(left, mid)
            this.right = buildTree(mid?.next, right)
        }
    }

    private fun getMidNum(left: ListNode?, right: ListNode?): ListNode? {
        var fast = left
        var slow = left
        while (fast != right && fast?.next != right) {
            fast = fast?.next?.next
            slow = slow?.next
        }
        return slow
    }
}