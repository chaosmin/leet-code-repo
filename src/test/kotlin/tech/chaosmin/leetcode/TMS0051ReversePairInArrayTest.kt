package tech.chaosmin.leetcode

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
internal class TMS0051ReversePairInArrayTest {

    @Test
    fun reversePairs() {
        val testCase = intArrayOf(7, 5, 6, 4)
        val result = TMS0051ReversePairInArray.reversePairs(testCase)
        Assert.assertEquals(5, result)
    }
}