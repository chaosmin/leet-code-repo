package tech.chaosmin.leetcode

import org.junit.Assert
import org.junit.jupiter.api.Test

/**
 * @author romani min
 * @since 2020/4/14
 */
internal class T0001SumOfTwoNumbersTest {

    @Test
    fun twoSum() {
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9
        val result = T0001SumOfTwoNumbers.twoSum(nums, target)
        Assert.assertArrayEquals(result, intArrayOf(0, 1))
    }
}