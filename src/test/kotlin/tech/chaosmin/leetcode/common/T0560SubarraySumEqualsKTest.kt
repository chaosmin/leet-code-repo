package tech.chaosmin.leetcode.common

import org.junit.Assert
import org.junit.jupiter.api.Test
import tech.chaosmin.leetcode.common.T0560SubarraySumEqualsK

/**
 * Example 1:
 * Input:nums = [1,1,1], k = 2
 * Output: 2
 *
 * @author romani min
 * @since 2020/5/15
 */
internal class T0560SubarraySumEqualsKTest {

    @Test
    fun subarraySum() {
        val result = T0560SubarraySumEqualsK.subarraySum(intArrayOf(1, 1, 1), 2)
        Assert.assertEquals(2, result)
    }
}