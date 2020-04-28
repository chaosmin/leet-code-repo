package tech.chaosmin.leetcode

import org.junit.Assert
import org.junit.jupiter.api.Test

/**
 * 示例 1：
 * 输入：nums = [4,1,4,6]
 * 输出：[1,6] 或 [6,1]
 *
 * 示例 2：
 * 输入：nums = [1,2,10,4,1,4,3,3]
 * 输出：[2,10] 或 [10,2]
 *
 * @author romani min
 * @since 2020/4/28
 */
internal class T1608OccurrencesOfNumbersInArrayTest {

    @Test
    fun singleNumbers() {
        val testCase1 = intArrayOf(4, 1, 4, 6)
        val result1 = T1608OccurrencesOfNumbersInArray.singleNumbers(testCase1).sorted()
        Assert.assertEquals(1, result1[0])
        Assert.assertEquals(6, result1[1])

        val testCase2 = intArrayOf(1, 2, 10, 4, 1, 4, 3, 3)
        val result2 = T1608OccurrencesOfNumbersInArray.singleNumbers(testCase2).sorted()
        Assert.assertEquals(2, result2[0])
        Assert.assertEquals(10, result2[1])
    }
}