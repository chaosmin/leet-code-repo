package tech.chaosmin.leetcode

import org.junit.Assert
import org.junit.jupiter.api.Test

/**
 * 示例 1：
 * 输入： 2 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 *
 * 示例 2：
 * 输入： 3 输出： 3
 * 解释： 有三种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶 + 1 阶
 * 2.  1 阶 + 2 阶
 * 3.  2 阶 + 1 阶
 *
 * @author romani min
 * @since 2020/4/27
 */
internal class T0070ClimbingStairsTest {

    @Test
    fun climbStairs() {
        val testCase1 = 2
        val result1 = T0070ClimbingStairs.climbStairs(testCase1)
        Assert.assertEquals(2, result1)
        val testCase2 = 3
        val result2 = T0070ClimbingStairs.climbStairs(testCase2)
        Assert.assertEquals(3, result2)
    }
}