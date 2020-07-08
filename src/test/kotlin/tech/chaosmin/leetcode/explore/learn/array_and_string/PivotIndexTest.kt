package tech.chaosmin.leetcode.explore.learn.array_and_string

import org.junit.Assert
import org.junit.jupiter.api.Test

/**
 * @author romani min
 * @since 2020/7/8
 */
internal class PivotIndexTest {

    @Test
    fun pivotIndex() {
        val result1 = PivotIndex.pivotIndex(intArrayOf(1, 7, 3, 6, 5, 6))
        Assert.assertEquals(3, result1)

        val result2 = PivotIndex.pivotIndex(intArrayOf(1, 2, 3))
        Assert.assertEquals(-1, result2)
    }
}