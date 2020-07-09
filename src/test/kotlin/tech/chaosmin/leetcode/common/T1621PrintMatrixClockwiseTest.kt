package tech.chaosmin.leetcode.common

import org.junit.Assert
import org.junit.jupiter.api.Test

/**
 * @author romani min
 * @since 2020/6/5
 */
internal class T1621PrintMatrixClockwiseTest {

    @Test
    fun spiralOrder() {
        val result1 = T1621PrintMatrixClockwise.spiralOrder(
            arrayOf(
                intArrayOf(1, 2, 3),
                intArrayOf(4, 5, 6),
                intArrayOf(7, 8, 9)
            )
        )
        Assert.assertArrayEquals(intArrayOf(1, 2, 3, 6, 9, 8, 7, 4, 5), result1)

        val result2 =
            T1621PrintMatrixClockwise.spiralOrder(
                arrayOf(
                    intArrayOf(
                        1,
                        2,
                        3,
                        4
                    ), intArrayOf(5, 6, 7, 8), intArrayOf(9, 10, 11, 12)
                )
            )
        Assert.assertArrayEquals(intArrayOf(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7), result2)
    }
}