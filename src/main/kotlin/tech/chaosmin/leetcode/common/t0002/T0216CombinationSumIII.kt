package tech.chaosmin.leetcode.common.t0002

/**
 * 216. 组合总和 III | 难度：中等
 *
 * 找出所有相加之和为n的k个数的组合。组合中只允许含有1 - 9的正整数，并且每种组合中不存在重复的数字。
 * 说明：
 * 所有数字都是正整数。
 * 解集不能包含重复的组合。
 *
 * ************************************
 *
 * 执行用时：192 ms, 在所有 Kotlin 提交中击败了20.00%的用户
 * 内存消耗：34.2 MB, 在所有 Kotlin 提交中击败了25.00%的用户
 */
object T0216CombinationSumIII {
    fun combinationSum3(k: Int, n: Int): List<List<Int>> {
        val ans = mutableListOf<List<Int>>()
        for (mask in 0 until (1 shl 9)) {
            val temp = check(mask, k, n)
            if (temp != null) {
                ans.add(temp)
            }
        }
        return ans
    }

    private fun check(mask: Int, k: Int, n: Int): List<Int>? {
        val temp = mutableListOf<Int>()
        for (i in 0..8) {
            if (1 shl i and mask != 0) {
                temp.add(i + 1)
            }
        }
        return if ((temp.size == k) && temp.sum() == n) temp
        else null
    }
}