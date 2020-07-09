package tech.chaosmin.leetcode.common

import org.junit.Assert
import org.junit.jupiter.api.Test
import tech.chaosmin.leetcode.common.T0378KthSmallestElementInSortedMatrix

/**
 * @author romani min
 * @since 2020/7/2
 */
internal class T0378KthSmallestElementInSortedMatrixTest {

    @Test
    fun kthSmallest() {
        val testCase = arrayOf(intArrayOf(1, 5, 9), intArrayOf(10, 11, 13), intArrayOf(12, 13, 15))
        val result = T0378KthSmallestElementInSortedMatrix.kthSmallest(testCase, 8)
        Assert.assertEquals(13, result)
    }
}