package tech.chaosmin.leetcode

import org.junit.Assert
import org.junit.jupiter.api.Test
import tech.chaosmin.leetcode.base.MountainArray

/**
 * 示例 1：
 * 输入：array = [1,2,3,4,5,3,1], target = 3
 * 输出：2
 * 解释：3 在数组中出现了两次，下标分别为 2 和 5，我们返回最小的下标 2。
 *
 * 示例 2：
 * 输入：array = [0,1,2,4,2,1], target = 3
 * 输出：-1
 * 解释：3 在数组中没有出现，返回 -1。
 *
 * @author romani min
 * @since 2020/4/29
 */
internal class T1905FindValueInMountainArrayTest {

    @Test
    fun findInMountainArray() {
        val testCase1 = MountainArray(intArrayOf(1, 2, 3, 4, 5, 3, 1))
        val result1 = T1905FindValueInMountainArray.findInMountainArray(3, testCase1)
        Assert.assertEquals(2, result1)

        val testCase2 = MountainArray(intArrayOf(0, 1, 2, 4, 2, 1))
        val result2 = T1905FindValueInMountainArray.findInMountainArray(3, testCase2)
        Assert.assertEquals(-1, result2)
    }
}