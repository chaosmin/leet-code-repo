package tech.chaosmin.leetcode.common

import org.junit.Assert
import org.junit.jupiter.api.Test
import tech.chaosmin.leetcode.base.ListNode

/**
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 * @author romani min
 * @since 2020/4/17
 */
internal class T0002AddTwoNumbersTest {

    @Test
    fun addTwoNumbers() {
        val l1 = ListNode(2).apply {
            this.next = ListNode(4).apply {
                this.next = ListNode(3)
            }
        }
        val l2 = ListNode(5).apply {
            this.next = ListNode(6).apply {
                this.next = ListNode(4)
            }
        }
        val result = T0002AddTwoNumbers.addTwoNumbers(l1, l2)
        Assert.assertEquals(7, result?.`val`)
        Assert.assertEquals(0, result?.next?.`val`)
        Assert.assertEquals(8, result?.next?.next?.`val`)
    }
}