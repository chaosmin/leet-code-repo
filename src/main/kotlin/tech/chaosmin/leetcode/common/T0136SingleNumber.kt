package tech.chaosmin.leetcode.common

/**
 * 136. Single Number | Difficulty: simple
 *
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * ************************************
 *
 * 执行用时 :244 ms, 在所有 Kotlin 提交中击败了56.67%的用户
 * 内存消耗 :35.8 MB, 在所有 Kotlin 提交中击败了100.00%的用户
 *
 * @author romani min
 * @since 2020/5/14
 */
object T0136SingleNumber {
    fun singleNumber(nums: IntArray): Int {
        var result = 0
        for (num in nums) {
            result = result xor num
        }
        return result
    }
}