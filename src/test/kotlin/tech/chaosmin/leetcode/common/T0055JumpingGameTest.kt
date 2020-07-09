package tech.chaosmin.leetcode.common

import org.junit.Assert
import org.junit.jupiter.api.Test
import tech.chaosmin.leetcode.common.T0055JumpingGame

/**
 * 示例 1:
 * 输入: [2,3,1,1,4]
 * 输出: true
 * 解释: 我们可以先跳 1 步，从位置 0 到达 位置 1, 然后再从位置 1 跳 3 步到达最后一个位置。
 *
 * 示例 2:
 * 输入: [3,2,1,0,4]
 * 输出: false
 * 解释: 无论怎样，你总会到达索引为 3 的位置。但该位置的最大跳跃长度是 0 ， 所以你永远不可能到达最后一个位置。
 *
 * @author romani min
 * @since 2020/4/17
 */
internal class T0055JumpingGameTest {

    @Test
    fun canJump() {
        val testCase1 = intArrayOf(2, 3, 1, 1, 4)
        val result1 = T0055JumpingGame.canJump(testCase1)
        Assert.assertEquals(true, result1)

        val testCase2 = intArrayOf(3, 2, 1, 0, 4)
        val result2 = T0055JumpingGame.canJump(testCase2)
        Assert.assertEquals(false, result2)
    }
}