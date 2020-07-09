package tech.chaosmin.leetcode.common.t0004

import org.junit.Assert
import org.junit.jupiter.api.Test
import tech.chaosmin.leetcode.base.ListNode

/**
 * 输入：(7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 8 -> 0 -> 7
 *
 * @author romani min
 * @since 2020/4/14
 */
internal class T0445AddTwoNumbers2Test {

    @Test
    fun addTwoNumbers() {
        val l1 = ListNode(7).apply {
            this.next = ListNode(2).apply {
                this.next = ListNode(4).apply {
                    this.next = ListNode(3)
                }
            }
        }
        val l2 = ListNode(5).apply {
            this.next = ListNode(6).apply {
                this.next = ListNode(4)
            }
        }
        val result = T0445AddTwoNumbers2.addTwoNumbers(l1, l2)
        Assert.assertEquals(7, result?.`val`)
        Assert.assertEquals(8, result?.next?.`val`)
        Assert.assertEquals(0, result?.next?.next?.`val`)
        Assert.assertEquals(7, result?.next?.next?.next?.`val`)
    }
}