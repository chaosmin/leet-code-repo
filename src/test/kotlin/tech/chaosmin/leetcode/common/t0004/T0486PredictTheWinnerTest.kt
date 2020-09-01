package tech.chaosmin.leetcode.common.t0004

import org.junit.Assert
import org.junit.jupiter.api.Test

internal class T0486PredictTheWinnerTest {

    @Test
    fun predictTheWinner() {
        val testCase1 = intArrayOf(1, 5, 2)
        val result1 = T0486PredictTheWinner.predictTheWinner(testCase1)
        Assert.assertFalse(result1)

        val testCase2 = intArrayOf(1, 5, 233, 7)
        val result2 = T0486PredictTheWinner.predictTheWinner(testCase2)
        Assert.assertTrue(result2)
    }
}