package tech.chaosmin.leetcode.common.t0000

/**
 * 35. 搜索插入位置 | 难度：简单
 *
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 你可以假设数组中无重复元素。
 *
 * @author romani min
 * @since 2020/7/17
 */
object T0035SearchInsertPosition {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var i = 0
        var j = nums.size - 1
        var result = nums.size
        while (i <= j) {
            val mid = (j - i shr 1) + i
            if (target <= nums[mid]) {
                result = mid
                j = mid - 1
            } else {
                i = mid + 1
            }
        }
        return result
    }
}