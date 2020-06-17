package tech.chaosmin.leetcode

import org.junit.Assert
import org.junit.jupiter.api.Test

/**
 * @author romani min
 * @since 2020/6/17
 */
internal class T1014BestSightseeingPairTest {

    @Test
    fun maxScoreSightseeingPair() {
        val result = T1014BestSightseeingPair.maxScoreSightseeingPair(intArrayOf(8, 1, 5, 2, 6))
        Assert.assertEquals(11, result)
    }
}