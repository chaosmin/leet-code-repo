package tech.chaosmin.leetcode.common.t0000

import org.junit.Assert
import org.junit.jupiter.api.Test

/**
 * @author romani min
 * @since 2020/7/21
 */
internal class T0095UniqueBinarySearchTreesIITest {

    @Test
    fun generateTrees() {
        println("TEST CASE: 3")
        val result = T0095UniqueBinarySearchTreesII.generateTrees(3)
        Assert.assertEquals(5, result.size)
    }
}