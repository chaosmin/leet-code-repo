package tech.chaosmin.leetcode.common

/**
 * 560. Subarray Sum Equals K | Difficulty: medium
 * Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.
 *
 * @author romani min
 * @since 2020/5/15
 */
object T0560SubarraySumEqualsK {
    fun subarraySum(nums: IntArray, k: Int): Int {
        var count = 0
        var pre = 0
        val map = mutableMapOf<Int, Int>().apply {
            this[0] = 1
        }
        for (i in nums.indices) {
            pre += nums[i]
            if (map.containsKey(pre - k)) {
                count += map.get(pre - k) ?: 0
            }
            map[pre] = map.getOrDefault(pre, 0) + 1
        }
        return count
    }
}