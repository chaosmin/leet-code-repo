package tech.chaosmin.leetcode.common.t0007

import com.alibaba.fastjson.JSON
import org.junit.Assert
import org.junit.jupiter.api.Test

/**
 * @author romani min
 * @since 2020/7/16
 */
internal class T0785IsGraphBipartiteTest {

    @Test
    fun isBipartite() {
        val testCase1 = arrayOf(intArrayOf(1, 3), intArrayOf(0, 2), intArrayOf(1, 3), intArrayOf(0, 2))
        println("TEST CASE: ${JSON.toJSONString(testCase1)}")
        val result1 = T0785IsGraphBipartite.isBipartite(testCase1)
        Assert.assertEquals(true, result1)
        println()

        val testCase2 = arrayOf(intArrayOf(1, 2, 3), intArrayOf(0, 2), intArrayOf(0, 1, 3), intArrayOf(0, 2))
        println("TEST CASE: ${JSON.toJSONString(testCase2)}")
        val result2 = T0785IsGraphBipartite.isBipartite(testCase2)
        Assert.assertEquals(false, result2)
        println()

        val testCase3 = arrayOf(intArrayOf(1), intArrayOf(0, 3), intArrayOf(3), intArrayOf(1, 2))
        println("TEST CASE: ${JSON.toJSONString(testCase3)}")
        val result3 = T0785IsGraphBipartite.isBipartite(testCase3)
        Assert.assertEquals(true, result3)
        println()

        val testCase4 = arrayOf(intArrayOf(3), intArrayOf(2, 4), intArrayOf(1), intArrayOf(0, 4), intArrayOf(1, 3))
        println("TEST CASE: ${JSON.toJSONString(testCase4)}")
        val result4 = T0785IsGraphBipartite.isBipartite(testCase4)
        Assert.assertEquals(true, result4)
        println()

        val testCase5 = arrayOf(
            intArrayOf(),
            intArrayOf(2, 4, 6),
            intArrayOf(1, 4, 8, 9),
            intArrayOf(7, 8),
            intArrayOf(1, 2, 8, 9),
            intArrayOf(6, 9),
            intArrayOf(1, 5, 7, 8, 9),
            intArrayOf(3, 6, 9),
            intArrayOf(2, 3, 4, 6, 9),
            intArrayOf(2, 4, 5, 6, 7, 8)
        )
        println("TEST CASE: ${JSON.toJSONString(testCase5)}")
        val result5 = T0785IsGraphBipartite.isBipartite(testCase5)
        Assert.assertEquals(false, result5)
        println()

        val testCase6 = arrayOf(
            intArrayOf(1, 4),
            intArrayOf(0, 2),
            intArrayOf(1),
            intArrayOf(4),
            intArrayOf(0, 3)
        )
        println("TEST CASE: ${JSON.toJSONString(testCase6)}")
        val result6 = T0785IsGraphBipartite.isBipartite(testCase6)
        Assert.assertEquals(true, result6)
        println()
    }
}