package tech.chaosmin.leetcode.common.t0000

import org.junit.Assert
import org.junit.jupiter.api.Test

/**
 * @author romani min
 * @since 2020/7/15
 */
internal class T0096UniqueBinarySearchTreesTest {

    @Test
    fun numTrees() {
        val result = T0096UniqueBinarySearchTrees.numTrees(3)
        Assert.assertEquals(5, result)
    }
}