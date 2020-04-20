package tech.chaosmin.leetcode

import org.junit.Assert
import org.junit.jupiter.api.Test

/**
 * 示例 1:
 * 输入:
 * 11110
 * 11010
 * 11000
 * 00000
 * 输出: 1
 *
 * 示例 2:
 * 输入:
 * 11000
 * 11000
 * 00100
 * 00011
 * 输出: 3
 * 解释: 每座岛屿只能由水平和/或竖直方向上相邻的陆地连接而成。
 *
 * @author romani min
 * @since 2020/4/20
 */
internal class T0200NumberOfIslandsTest {

    @Test
    fun numIslands() {
        println("====== TEST CASE 1 ======")
        val testCase1 = arrayOf(
            charArrayOf('1', '1', '1', '1', '0'),
            charArrayOf('1', '1', '0', '1', '0'),
            charArrayOf('1', '1', '0', '0', '0'),
            charArrayOf('0', '0', '0', '0', '0')
        )
        val result1 = T0200NumberOfIslands.numIslands(testCase1)
        Assert.assertEquals(1, result1)
        println("====== TEST CASE 2 ======")
        val testCase2 = arrayOf(
            charArrayOf('1', '1', '0', '0', '0'),
            charArrayOf('1', '1', '0', '0', '0'),
            charArrayOf('0', '0', '1', '0', '0'),
            charArrayOf('0', '0', '0', '1', '1')
        )
        val result2 = T0200NumberOfIslands.numIslands(testCase2)
        Assert.assertEquals(3, result2)
    }
}