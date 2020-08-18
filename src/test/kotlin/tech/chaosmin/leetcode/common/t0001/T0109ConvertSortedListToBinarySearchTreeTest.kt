package tech.chaosmin.leetcode.common.t0001

import com.alibaba.fastjson.JSON
import org.junit.jupiter.api.Test
import tech.chaosmin.leetcode.base.ListNode

/**
 *
 *
 * @author romani min
 * @since 2020/8/18
 */
internal class T0109ConvertSortedListToBinarySearchTreeTest {

    @Test
    fun sortedListToBST() {
        val testCase1 = ListNode(-10).apply {
            this.next = ListNode(-3).apply {
                this.next = ListNode(0).apply {
                    this.next = ListNode(5).apply {
                        this.next = ListNode(9)
                    }
                }
            }
        }
        println("TEST CASE ONE START: [-10, -3, 0, 5, 9]")
        val result1 = T0109ConvertSortedListToBinarySearchTree.sortedListToBST(testCase1)
        println(JSON.toJSONString(result1, true))
    }
}