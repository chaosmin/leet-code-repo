package tech.chaosmin.leetcode

import java.util.*

/**
 * 445. 两数相加 II | 难度：中等
 *
 * 给你两个 非空 链表来代表两个非负整数。数字最高位位于链表开始位置。它们的每个节点只存储一位数字。将这两数相加会返回一个新的链表。
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 *
 * @author romani min
 * @since 2020/4/14
 */
object SumOfTwoNumbers2 {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val stack1 = Stack<Int>()
        var temp = l1
        do {
            stack1.push(temp!!.`val`)
            temp = temp.next
        } while (temp != null)
        val stack2 = Stack<Int>()
        temp = l2
        do {
            stack2.push(temp!!.`val`)
            temp = temp.next
        } while (temp != null)

        var mid = 0
        var header: ListNode? = null
        while (stack1.isNotEmpty() || stack2.isNotEmpty() || mid != 0) {
            val i = (if (stack1.isEmpty()) 0 else stack1.pop()) + (if (stack2.isEmpty()) 0 else stack2.pop()) + mid
            mid = if (i / 10 > 0) (i / 10) else 0
            header = ListNode(i % 10).apply { this.next = header }
        }
        return header
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}