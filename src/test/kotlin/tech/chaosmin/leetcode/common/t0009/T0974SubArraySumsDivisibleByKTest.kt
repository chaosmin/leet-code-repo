package tech.chaosmin.leetcode.common.t0009

import org.junit.Assert
import org.junit.jupiter.api.Test

/**
 * Input: A = [4,5,0,-2,-3,1], K = 5
 * Output: 7
 * Explanation: There are 7 subarrays with a sum divisible by K = 5:
 * [4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]

 * @author romani min
 * @since 2020/5/27
 */
internal class T0974SubArraySumsDivisibleByKTest {

    @Test
    fun subarraysDivByK() {
        val result = T0974SubArraySumsDivisibleByK.subarraysDivByK(intArrayOf(4, 5, 0, -2, -3, 1), 5)
        Assert.assertEquals(7, result)

        val result2 = T0974SubArraySumsDivisibleByK.subarraysDivByK(intArrayOf(-1, 2, 9), 2)
        Assert.assertEquals(2, result2)
    }
}