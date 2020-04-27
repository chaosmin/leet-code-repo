package tech.chaosmin.leetcode

/**
 * 33. 搜索旋转排序数组 | 难度：中等
 *
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 * 搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
 * 你可以假设数组中不存在重复的元素。
 * 你的算法时间复杂度必须是 O(log n) 级别。
 *
 *
 * ************************************
 *
 * 执行用时 :208 ms, 在所有 Kotlin 提交中击败了63.16%的用户
 * 内存消耗 :34.9 MB, 在所有 Kotlin 提交中击败了100.00%的用户
 *
 * @author romani min
 * @since 2020/4/27
 */
object T0033SearchRotationSortedArray {
    fun search(nums: IntArray, target: Int): Int {
        return if (nums.isEmpty()) -1
        else if (nums.size == 1 && target != nums.first()) -1
        else {
            var l = 0
            var r = nums.size - 1
            while (l <= r) {
                val mid = (l + r) / 2
                if (nums[mid] == target) {
                    return mid
                } else if (nums[0] <= nums[mid]) {
                    if (nums[0] <= target && target < nums[mid]) {
                        r = mid - 1
                    } else {
                        l = mid + 1
                    }
                } else {
                    if (nums[mid] < target && target <= nums[nums.size - 1]) {
                        l = mid + 1
                    } else {
                        r = mid - 1
                    }
                }
            }
            -1
        }
    }
}