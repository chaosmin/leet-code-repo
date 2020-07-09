package tech.chaosmin.leetcode.common

import org.junit.Assert
import org.junit.jupiter.api.Test
import tech.chaosmin.leetcode.common.T0983LowestFare

/**
 * 示例 1：
 * 输入：days = [1,4,6,7,8,20], costs = [2,7,15]
 * 输出：11
 * 解释：
 * 例如，这里有一种购买通行证的方法，可以让你完成你的旅行计划：
 * 在第 1 天，你花了 costs[0] = $2 买了一张为期 1 天的通行证，它将在第 1 天生效。
 * 在第 3 天，你花了 costs[1] = $7 买了一张为期 7 天的通行证，它将在第 3, 4, ..., 9 天生效。
 * 在第 20 天，你花了 costs[0] = $2 买了一张为期 1 天的通行证，它将在第 20 天生效。
 * 你总共花了 $11，并完成了你计划的每一天旅行。
 *
 * 示例 2：
 * 输入：days = [1,2,3,4,5,6,7,8,9,10,30,31], costs = [2,7,15]
 * 输出：17
 * 解释：
 * 例如，这里有一种购买通行证的方法，可以让你完成你的旅行计划：
 * 在第 1 天，你花了 costs[2] = $15 买了一张为期 30 天的通行证，它将在第 1, 2, ..., 30 天生效。
 * 在第 31 天，你花了 costs[0] = $2 买了一张为期 1 天的通行证，它将在第 31 天生效。
 * 你总共花了 $17，并完成了你计划的每一天旅行。
 *
 * @author romani min
 * @since 2020/5/6
 */
internal class T0983LowestFareTest {

    @Test
    fun mincostTickets() {
        val testCaseDays1 = intArrayOf(1, 4, 6, 7, 8, 20)
        val testCaseCost1 = intArrayOf(2, 7, 15)
        val result1 = T0983LowestFare.mincostTickets(testCaseDays1, testCaseCost1)
        Assert.assertEquals(11, result1)

        val testCaseDays2 = intArrayOf(1, 2, 3, 4, 6, 7, 8, 9, 10, 30, 31)
        val testCaseCost2 = intArrayOf(2, 7, 15)
        val result2 = T0983LowestFare.mincostTickets(testCaseDays2, testCaseCost2)
        Assert.assertEquals(17, result2)
    }
}