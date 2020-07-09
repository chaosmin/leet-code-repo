package tech.chaosmin.leetcode.common

import org.junit.Assert
import org.junit.jupiter.api.Test
import tech.chaosmin.leetcode.common.T1248StatisticsBeautifulSubarrays

/**
 * 示例 1：
 * 输入：nums = [1,1,2,1,1], k = 3
 * 输出：2
 * 解释：包含 3 个奇数的子数组是 [1,1,2,1] 和 [1,2,1,1] 。
 *
 * 示例 2：
 * 输入：nums = [2,4,6], k = 1
 * 输出：0
 * 解释：数列中不包含任何奇数，所以不存在优美子数组。
 *
 * 示例 3：
 * 输入：nums = [2,2,2,1,2,2,1,2,2,2], k = 2
 * 输出：16
 *
 * @author romani min
 * @since 2020/4/21
 */
internal class T1248StatisticsBeautifulSubarraysTest {

    @Test
    fun numberOfSubarrays() {
        val testCase1 = intArrayOf(1, 1, 2, 1, 1)
        val result1 = T1248StatisticsBeautifulSubarrays.numberOfSubarrays(testCase1, 3)
        Assert.assertEquals(2, result1)

        val testCase2 = intArrayOf(2, 4, 6)
        val result2 = T1248StatisticsBeautifulSubarrays.numberOfSubarrays(testCase2, 1)
        Assert.assertEquals(0, result2)

        val testCase3 = intArrayOf(2, 2, 2, 1, 2, 2, 1, 2, 2, 2)
        val result3 = T1248StatisticsBeautifulSubarrays.numberOfSubarrays(testCase3, 2)
        Assert.assertEquals(16, result3)
    }
}