package tech.chaosmin.leetcode.common.t0000

import org.junit.Assert
import org.junit.jupiter.api.Test

/**
 * @author romani min
 * @since 2020/6/12
 */
internal class T0015ThreeSumTest {

    @Test
    fun threeSum() {
        val result = T0015ThreeSum.threeSum(intArrayOf(-1, 0, 1, 2, -1, -4))
        Assert.assertArrayEquals(intArrayOf(-1, 0, 1), result[0].toIntArray())
        Assert.assertArrayEquals(intArrayOf(-1, -1, 2), result[1].toIntArray())
    }
}