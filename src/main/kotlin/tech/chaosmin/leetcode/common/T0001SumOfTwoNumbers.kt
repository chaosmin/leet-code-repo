package tech.chaosmin.leetcode.common

/**
 * 1. 两数之和 | 难度：简单
 *
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * @author romani min
 * @since 2020/4/13
 */
object T0001SumOfTwoNumbers {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var complement: Int
        val map = hashMapOf<Int, Int>()
        for (i in nums.indices) {
            // 用目标值和nums数组中元素相减
            complement = target - nums[i]
            // 判断哈希表中是否有相减值 complement
            if (map.containsKey(complement)) {
                // 如果有的话返回相应的下标
                return intArrayOf(map[complement]!!.toInt(), i)
            }
            // 如果没有  把数组nums[i]中遍历到的元素放入到哈希表中
            map[nums[i]] = i
        }
        return intArrayOf()
    }
}