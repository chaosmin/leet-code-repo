package tech.chaosmin.leetcode

/**
 * 55. 跳跃游戏 | 难度：中等
 *
 * 给定一个非负整数数组，你最初位于数组的第一个位置。
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * 判断你是否能够到达最后一个位置。
 *
 * ************************************
 *
 * 执行用时 :244 ms, 在所有 Kotlin 提交中击败了66.67%的用户
 * 内存消耗 :35.8 MB, 在所有 Kotlin 提交中击败了100.00%的用户
 *
 * @author romani min
 * @since 2020/4/17
 */
object T0055JumpingGame {
    fun canJump(nums: IntArray): Boolean {
        var maxPosition = 0
        nums.forEachIndexed { index, i ->
            if (index <= maxPosition) {
                maxPosition = Math.max(index + i, maxPosition)
            } else {
                return false
            }
        }
        return true
    }
}