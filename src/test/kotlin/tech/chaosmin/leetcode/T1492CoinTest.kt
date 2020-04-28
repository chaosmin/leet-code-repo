package tech.chaosmin.leetcode

import org.junit.Assert
import org.junit.jupiter.api.Test

/**
 * 示例1:
 * 输入: n = 5
 * 输出：2
 * 解释: 有两种方式可以凑成总金额:5=5  5=1+1+1+1+1
 *
 * 示例2:
 * 输入: n = 10
 * 输出：4
 * 解释: 有四种方式可以凑成总金额:10=10  10=5+5  10=5+1+1+1+1+1  10=1+1+1+1+1+1+1+1+1+1
 *
 * @author romani min
 * @since 2020/4/23
 */
internal class T1492CoinTest {

    @Test
    fun waysToChange() {
        val testCase1 = 5
        val result1 = T1492Coin.waysToChange(testCase1)
        Assert.assertEquals(2, result1)

        val testCase2 = 10
        val result2 = T1492Coin.waysToChange(testCase2)
        Assert.assertEquals(4, result2)

        val testCase3 = 900750
        val result3 = T1492Coin.waysToChange(testCase3)
        Assert.assertEquals(504188296, result3)
    }
}