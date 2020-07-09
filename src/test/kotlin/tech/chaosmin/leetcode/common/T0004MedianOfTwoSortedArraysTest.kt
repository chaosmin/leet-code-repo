package tech.chaosmin.leetcode.common

import org.junit.Assert
import org.junit.jupiter.api.Test
import tech.chaosmin.leetcode.common.T0004MedianOfTwoSortedArrays

/**
 * 示例 1:
 * nums1 = [1, 3]  nums2 = [2]  则中位数是 2.0
 *
 * 示例 2:
 * nums1 = [1, 2]  nums2 = [3, 4]  则中位数是 (2 + 3)/2 = 2.5
 *
 * @author romani min
 * @since 2020/4/21
 */
internal class T0004MedianOfTwoSortedArraysTest {

    @Test
    fun findMedianSortedArrays() {
        val testCase1Num1 = intArrayOf(1, 3)
        val testCase1Num2 = intArrayOf(2)
        val result1 = T0004MedianOfTwoSortedArrays.findMedianSortedArrays(testCase1Num1, testCase1Num2)
        Assert.assertEquals(2.0, result1, 0.0)

        val testCase2Num1 = intArrayOf(1, 2)
        val testCase2Num2 = intArrayOf(3, 4)
        val result2 = T0004MedianOfTwoSortedArrays.findMedianSortedArrays(testCase2Num1, testCase2Num2)
        Assert.assertEquals(2.5, result2, 0.0)
    }
}