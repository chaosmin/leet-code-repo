package tech.chaosmin.leetcode.common.t0016

import com.alibaba.fastjson.JSON
import org.junit.Assert
import org.junit.jupiter.api.Test

/**
 * @author romani min
 * @since 2020/7/31
 */
internal class T1685MagicIndexTest {

    @Test
    fun findMagicIndex() {
        val testCase1 = intArrayOf(0, 2, 3, 4, 5)
        println("TEST CASE: ${JSON.toJSONString(testCase1)}")
        val result1 = T1685MagicIndex.findMagicIndex(testCase1)
        Assert.assertEquals(0, result1)

        val testCase2 = intArrayOf(1, 1, 1)
        println("TEST CASE: ${JSON.toJSONString(testCase2)}")
        val result2 = T1685MagicIndex.findMagicIndex(testCase2)
        Assert.assertEquals(1, result2)

        val testCase3 = intArrayOf(0, 0, 2)
        println("TEST CASE: ${JSON.toJSONString(testCase3)}")
        val result3 = T1685MagicIndex.findMagicIndex(testCase3)
        Assert.assertEquals(0, result3)
    }
}