package tech.chaosmin.leetcode.common.t0015

import org.junit.Assert
import org.junit.jupiter.api.Test

/**
 * @author romani min
 * @since 2020/6/30
 */
internal class T1521ImplementQueueWithTwoStacksTest {

    @Test
    fun testCaseOne() {
        val queue = T1521ImplementQueueWithTwoStacks.CQueue()
        queue.appendTail(3)
        Assert.assertEquals(3, queue.deleteHead())
        Assert.assertEquals(-1, queue.deleteHead())
    }

    @Test
    fun testCaseTwo() {
        val queue = T1521ImplementQueueWithTwoStacks.CQueue()
        Assert.assertEquals(-1, queue.deleteHead())
        queue.appendTail(5)
        queue.appendTail(2)
        Assert.assertEquals(5, queue.deleteHead())
        Assert.assertEquals(2, queue.deleteHead())
    }
}