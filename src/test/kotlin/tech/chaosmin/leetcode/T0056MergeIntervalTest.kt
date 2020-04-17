package tech.chaosmin.leetcode

import org.junit.Assert
import org.junit.jupiter.api.Test

/**
 * 示例1
 * 输入: [[1,3],[2,6],[8,10],[15,18]]
 * 输出: [[1,6],[8,10],[15,18]]
 * 解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 *
 * 示例2
 * 输入: [[1,4],[4,5]]
 * 输出: [[1,5]]
 * 解释: 区间 [1,4] 和 [4,5] 可被视为重叠区间。
 *
 * @author romani min
 * @since 2020/4/16
 */
internal class T0056MergeIntervalTest {

    @Test
    fun merge() {
        val testCase1 = arrayOf(intArrayOf(1, 3), intArrayOf(2, 6), intArrayOf(8, 10), intArrayOf(15, 18))
        val result1 = T0056MergeInterval.merge(testCase1)
        Assert.assertEquals(1, result1[0][0])
        Assert.assertEquals(6, result1[0][1])
        Assert.assertEquals(8, result1[1][0])
        Assert.assertEquals(10, result1[1][1])
        Assert.assertEquals(15, result1[2][0])
        Assert.assertEquals(18, result1[2][1])

        val testCase2 = arrayOf(intArrayOf(1, 4), intArrayOf(4, 5))
        val result2 = T0056MergeInterval.merge(testCase2)
        Assert.assertEquals(1, result2[0][0])
        Assert.assertEquals(5, result2[0][1])
    }
}