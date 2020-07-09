package tech.chaosmin.leetcode.common.t0016

import org.junit.Assert
import org.junit.jupiter.api.Test

/**
 * 示例 1:
 * 输入: [7,5,6,4]
 * 输出: 5
 *
 * @author romani min
 * @since 2020/4/24
 */
internal class T1601ReversePairInArrayTest {

    @Test
    fun reversePairs() {
        val testCase = intArrayOf(7, 5, 6, 4)
        val result = T1601ReversePairInArray.reversePairs(testCase)
        Assert.assertEquals(5, result)
    }
}