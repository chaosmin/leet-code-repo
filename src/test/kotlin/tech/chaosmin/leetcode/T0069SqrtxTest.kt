package tech.chaosmin.leetcode

import org.junit.Assert
import org.junit.jupiter.api.Test

/**
 * Example 1:
 * Input: 4
 * Output: 2
 *
 * Example 2:
 * Input: 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
 *
 * @author romani min
 * @since 2020/5/9
 */
internal class T0069SqrtxTest {

    @Test
    fun mySqrt() {
        val testCase1 = 4
        val result1 = T0069Sqrtx.mySqrt(testCase1)
        Assert.assertEquals(2, result1)

        val testCase2 = 8
        val result2 = T0069Sqrtx.mySqrt(testCase2)
        Assert.assertEquals(2, result2)
    }
}