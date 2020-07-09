package tech.chaosmin.leetcode.common.t0001

import org.junit.Assert
import org.junit.jupiter.api.Test

/**
 * Example 1:
 * Input: [2,2,1]
 * Output: 1
 *
 * Example 2:
 * Input: [4,1,2,1,2]
 * Output: 4
 *
 * @author romani min
 * @since 2020/5/14
 */
internal class T0136SingleNumberTest {

    @Test
    fun singleNumber() {
        val testCase1 = intArrayOf(2, 2, 1)
        val result1 = T0136SingleNumber.singleNumber(testCase1)
        Assert.assertEquals(1, result1)

        val testCase2 = intArrayOf(4, 1, 2, 1, 2)
        val result2 = T0136SingleNumber.singleNumber(testCase2)
        Assert.assertEquals(4, result2)
    }
}