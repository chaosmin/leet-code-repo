package tech.chaosmin.leetcode.common.t0000

import org.junit.Assert
import org.junit.jupiter.api.Test

internal class T0047PermutationsIITest {

    @Test
    fun permuteUnique() {
        val testCase = intArrayOf(1, 1, 2)
        val result = T0047PermutationsII.permuteUnique(testCase)
        Assert.assertArrayEquals(intArrayOf(1, 1, 2), result[0].toIntArray())
        Assert.assertArrayEquals(intArrayOf(1, 2, 1), result[1].toIntArray())
        Assert.assertArrayEquals(intArrayOf(2, 1, 1), result[2].toIntArray())
    }
}