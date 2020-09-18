package tech.chaosmin.leetcode.common.t0000

import java.util.*


/**
 * 47. 全排列 II | 难度：中等
 *
 * 给定一个可包含重复数字的序列，返回所有不重复的全排列。
 *
 * ************************************
 *
 * 执行用时：324 ms, 在所有 Kotlin 提交中击败了25.00%的用户
 * 内存消耗：34.7 MB, 在所有 Kotlin 提交中击败了100.00%的用户
 */
object T0047PermutationsII {
    private var vis = booleanArrayOf()

    fun permuteUnique(nums: IntArray): List<List<Int>> {
        val ans = mutableListOf<List<Int>>()
        val perm = mutableListOf<Int>()
        vis = BooleanArray(nums.size)
        Arrays.sort(nums)
        backtrack(nums, ans, 0, perm)
        return ans
    }

    private fun backtrack(nums: IntArray, ans: MutableList<List<Int>>, idx: Int, perm: MutableList<Int>) {
        if (idx == nums.size) {
            ans.add(ArrayList(perm))
            return
        }
        for (i in nums.indices) {
            if (vis[i] || i > 0 && nums[i] == nums[i - 1] && !vis[i - 1]) {
                continue
            }
            perm.add(nums[i])
            vis[i] = true
            backtrack(nums, ans, idx + 1, perm)
            vis[i] = false
            perm.removeAt(idx)
        }
    }
}