package tech.chaosmin.leetcode.common.t0001

import com.alibaba.fastjson.JSON
import org.junit.Assert
import org.junit.jupiter.api.Test

/**
 * @author romani min
 * @since 2020/7/20
 */
internal class T0167TwoSumIIAndInputArraySortedTest {

    @Test
    fun twoSum() {
        val testCase = intArrayOf(2, 7, 11, 15)
        println("TEST CASE: ${JSON.toJSONString(testCase)}, 9")
        val result = T0167TwoSumIIAndInputArraySorted.twoSum(testCase, 9)
        Assert.assertArrayEquals(intArrayOf(1, 2), result)
    }
}