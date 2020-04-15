package tech.chaosmin.leetcode

import org.junit.Assert
import org.junit.jupiter.api.Test

/**
 * @author romani min
 * @since 2020/4/15
 */
internal class MatrixTest {

    @Test
    fun updateMatrix() {
        val matrix = arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 0), intArrayOf(1, 1, 1))
        val result = Matrix.updateMatrix(matrix)
        Assert.assertEquals(0, result[0][0])
        Assert.assertEquals(0, result[0][1])
        Assert.assertEquals(0, result[0][2])
        Assert.assertEquals(0, result[1][0])
        Assert.assertEquals(1, result[1][1])
        Assert.assertEquals(0, result[1][2])
        Assert.assertEquals(1, result[2][0])
        Assert.assertEquals(2, result[2][1])
        Assert.assertEquals(1, result[2][2])
    }
}