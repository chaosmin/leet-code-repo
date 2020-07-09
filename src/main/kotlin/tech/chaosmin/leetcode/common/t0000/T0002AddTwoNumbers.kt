package tech.chaosmin.leetcode.common.t0000

import tech.chaosmin.leetcode.base.ListNode

/**
 * 2. 两数相加 | 难度：中等
 *
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * ************************************
 *
 * 执行用时 :252 ms, 在所有 Kotlin 提交中击败了49.40%的用户
 * 内存消耗 :40.1 MB, 在所有 Kotlin 提交中击败了100.00%的用户
 *
 * @author romani min
 * @since 2020/4/17
 */
object T0002AddTwoNumbers {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var value = (l1?.`val` ?: 0) + (l2?.`val` ?: 0)
        val result = ListNode(value % 10)
        var mid = value / 10
        var header: ListNode? = result
        var p1 = l1?.next
        var p2 = l2?.next
        while (p1 != null || p2 != null || mid > 0) {
            value = (p1?.`val` ?: 0) + (p2?.`val` ?: 0) + mid
            header?.next = ListNode(value % 10)
            mid = value / 10
            header = header?.next
            p1 = p1?.next
            p2 = p2?.next
        }
        return result
    }
}