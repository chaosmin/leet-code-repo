package tech.chaosmin.leetcode.common.t0002

import org.junit.Assert
import org.junit.jupiter.api.Test

internal class T0216CombinationSumIIITest {

    @Test
    fun combinationSum3() {
        println("TEST CASE: (3, 7)")
        val result1 = T0216CombinationSumIII.combinationSum3(3, 7)
        Assert.assertArrayEquals(intArrayOf(1, 2, 4), result1[0].toIntArray())

        println("TEST CASE: (3, 9)")
        val result2 = T0216CombinationSumIII.combinationSum3(3, 9)
        Assert.assertArrayEquals(intArrayOf(2, 3, 4), result2[0].toIntArray())
        Assert.assertArrayEquals(intArrayOf(1, 3, 5), result2[1].toIntArray())
        Assert.assertArrayEquals(intArrayOf(1, 2, 6), result2[2].toIntArray())
    }
}