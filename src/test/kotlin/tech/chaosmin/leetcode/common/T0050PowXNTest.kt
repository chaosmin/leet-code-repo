package tech.chaosmin.leetcode.common

import org.junit.Assert
import org.junit.jupiter.api.Test

/**
 * Example 1:
 * Input: 2.00000, 10
 * Output: 1024.00000
 *
 * Example 2:
 * Input: 2.10000, 3
 * Output: 9.26100
 *
 * Example 3:
 * Input: 2.00000, -2
 * Output: 0.25000
 * Explanation: 2-2 = 1/22 = 1/4 = 0.25
 *
 * @author romani min
 * @since 2020/5/11
 */
internal class T0050PowXNTest {

    @Test
    fun myPow() {
        val result1 = String.format("%.5f", T0050PowXN.myPow(2.00000, 10))
        Assert.assertEquals("1024.00000", result1)

        val result2 = String.format("%.5f", T0050PowXN.myPow(2.10000, 3))
        Assert.assertEquals("9.26100", result2)

        val result3 = String.format("%.5f", T0050PowXN.myPow(2.00000, -2))
        Assert.assertEquals("0.25000", result3)

        val result4 = String.format("%.5f", T0050PowXN.myPow(2.00000, -2147483648))
        Assert.assertEquals("0.00000", result4)

        val result5 = String.format("%.5f", T0050PowXN.myPow(1.00000, -2147483648))
        Assert.assertEquals("1.00000", result5)

        val result6 = String.format("%.5f", T0050PowXN.myPow(-1.00000, -2147483648))
        Assert.assertEquals("1.00000", result6)
    }
}