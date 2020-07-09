package tech.chaosmin.leetcode.common

/**
 * 238. 除自身以外数组的乘积 | 难度：中等
 *
 * 给你一个长度为 n 的整数数组 nums，其中 n > 1，返回输出数组 output ，其中 output[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积。
 *
 * ************************************
 *
 * 执行用时 :284 ms, 在所有 Kotlin 提交中击败了100.00%的用户
 * 内存消耗 :43.8 MB, 在所有 Kotlin 提交中击败了100.00%的用户
 *
 * @author romani min
 * @since 2020/6/4
 */
object T0238ProductOfArrayExceptSelf {
    fun productExceptSelf(nums: IntArray): IntArray {
        val result = IntArray(nums.size) { 1 }
        var left = 1
        for (i in nums.indices) {
            result[i] = left
            left *= nums[i]
        }
        var right = 1
        for (i in nums.size - 1 downTo 0) {
            result[i] *= right
            right *= nums[i]
        }
        return result
    }
}