package tech.chaosmin.leetcode.explore.learn.array_and_string

/**
 * 给定一个整数类型的数组 nums，请编写一个能够返回数组 “中心索引” 的方法。
 * 我们是这样定义数组 中心索引 的：数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和。
 * 如果数组不存在中心索引，那么我们应该返回 -1。如果数组有多个中心索引，那么我们应该返回最靠近左边的那一个。
 *
 * @author romani min
 * @since 2020/7/8
 */
object PivotIndex {
    fun pivotIndex(nums: IntArray): Int {
        if (nums.isEmpty() || nums.size == 1) {
            return -1
        } else {
            for (i in nums.indices) {
                var left = 0
                var right = 0
                for (l in 0 until i) left += nums[l]
                for (r in i + 1 until nums.size) right += nums[r]
                if (left == right) return i
            }
            return -1
        }
    }
}