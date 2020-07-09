package tech.chaosmin.leetcode.common

import org.junit.Assert
import org.junit.jupiter.api.Test
import tech.chaosmin.leetcode.common.T0238ProductOfArrayExceptSelf

/**
 * @author romani min
 * @since 2020/6/4
 */
internal class T0238ProductOfArrayExceptSelfTest {

    @Test
    fun productExceptSelf() {
        val result = T0238ProductOfArrayExceptSelf.productExceptSelf(intArrayOf(1, 2, 3, 4))
        Assert.assertArrayEquals(intArrayOf(24, 12, 8, 6), result)
    }
}