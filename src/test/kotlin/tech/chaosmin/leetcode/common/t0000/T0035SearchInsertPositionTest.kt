package tech.chaosmin.leetcode.common.t0000

import com.alibaba.fastjson.JSON
import org.junit.Assert
import org.junit.jupiter.api.Test

/**
 * @author romani min
 * @since 2020/7/17
 */
internal class T0035SearchInsertPositionTest {

    @Test
    fun searchInsert() {
        val testCase1 = intArrayOf(1, 3, 5, 6)
        println("TEST CASE: ${JSON.toJSONString(testCase1)}, 5")
        val result1 = T0035SearchInsertPosition.searchInsert(testCase1, 5)
        Assert.assertEquals(2, result1)

        val testCase2 = intArrayOf(1, 3, 5, 6)
        println("TEST CASE: ${JSON.toJSONString(testCase2)}, 2")
        val result2 = T0035SearchInsertPosition.searchInsert(testCase2, 2)
        Assert.assertEquals(1, result2)

        val testCase3 = intArrayOf(1, 3, 5, 6)
        println("TEST CASE: ${JSON.toJSONString(testCase3)}, 7")
        val result3 = T0035SearchInsertPosition.searchInsert(testCase3, 7)
        Assert.assertEquals(4, result3)

        val testCase4 = intArrayOf(1, 3, 5, 6)
        println("TEST CASE: ${JSON.toJSONString(testCase4)}, 0")
        val result4 = T0035SearchInsertPosition.searchInsert(testCase4, 0)
        Assert.assertEquals(0, result4)
    }
}