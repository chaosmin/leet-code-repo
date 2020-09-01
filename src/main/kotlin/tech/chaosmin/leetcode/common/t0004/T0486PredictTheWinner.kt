package tech.chaosmin.leetcode.common.t0004

/**
 * 486. 预测赢家 | 难度：中等
 *
 * 给定一个表示分数的非负整数数组。 玩家 1 从数组任意一端拿取一个分数，随后玩家 2 继续从剩余数组任意一端拿取分数，然后玩家 1 拿，…… 。
 * 每次一个玩家只能拿取一个分数，分数被拿取之后不再可取。直到没有剩余分数可取时游戏结束。最终获得分数总和最多的玩家获胜。
 * 给定一个表示分数的数组，预测玩家1是否会成为赢家。你可以假设每个玩家的玩法都会使他的分数最大化。
 *
 * ************************************
 *
 * 执行用时：164 ms, 在所有 Kotlin 提交中击败了100.00%的用户
 * 内存消耗：32.2 MB, 在所有 Kotlin 提交中击败了100.00%的用户
 */
object T0486PredictTheWinner {
    fun predictTheWinner(nums: IntArray): Boolean {
        val length = nums.size
        val matrix = Array(length) { IntArray(length) { Int.MIN_VALUE } }
        for (i in 0 until length) {
            matrix[i][i] = nums[i]
        }
        for (i in length - 2 downTo 0) {
            for (j in i + 1 until length) {
                matrix[i][j] = Math.max(nums[i] - matrix[i + 1][j], nums[j] - matrix[i][j - 1])
            }
        }
        return matrix[0][length - 1] >= 0
    }
}