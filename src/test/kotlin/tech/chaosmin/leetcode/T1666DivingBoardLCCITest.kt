package tech.chaosmin.leetcode

import org.junit.Assert
import org.junit.jupiter.api.Test

/**
 * @author romani min
 * @since 2020/7/8
 */
internal class T1666DivingBoardLCCITest {

    @Test
    fun divingBoard() {
        val result = T1666DivingBoardLCCI.divingBoard(1, 2, 3)
        Assert.assertArrayEquals(intArrayOf(3, 4, 5, 6), result)
    }
}