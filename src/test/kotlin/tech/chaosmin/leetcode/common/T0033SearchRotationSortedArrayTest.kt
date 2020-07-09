package tech.chaosmin.leetcode.common

import org.junit.Assert
import org.junit.jupiter.api.Test
import tech.chaosmin.leetcode.common.T0033SearchRotationSortedArray

/**
 * 示例 1:
 * 输入: nums = [4,5,6,7,0,1,2], target = 0
 * 输出: 4
 *
 * 示例 2:
 * 输入: nums = [4,5,6,7,0,1,2], target = 3
 * 输出: -1
 *
 * @author romani min
 * @since 2020/4/27
 */
internal class T0033SearchRotationSortedArrayTest {

    @Test
    fun search() {
        val testCase1 = intArrayOf(4, 5, 6, 7, 0, 1, 2)
        val result1 = T0033SearchRotationSortedArray.search(testCase1, 0)
        Assert.assertEquals(4, result1)

        val testCase2 = intArrayOf(4, 5, 6, 7, 0, 1, 2)
        val result2 = T0033SearchRotationSortedArray.search(testCase2, 3)
        Assert.assertEquals(-1, result2)
    }
}