package tech.chaosmin.leetcode.common

/**
 * 15. 三数之和 | 难度：中等
 *
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
 * 注意：答案中不可以包含重复的三元组。
 *
 * @author romani min
 * @since 2020/6/12
 */
object T0015ThreeSum {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val length = nums.size
        val sortedNums = nums.sorted()
        val result = mutableListOf<List<Int>>()
        for (i in 0 until length) {
            if (i > 0 && sortedNums[i] == sortedNums[i - 1]) {
                continue
            }
            var k = length - 1
            val target = -sortedNums[i]
            for (j in i + 1 until length) {
                if (j > i + 1 && sortedNums[j] == sortedNums[j - 1]) {
                    continue
                }
                while (j < k && sortedNums[j] + sortedNums[k] > target) {
                    --k
                }
                if (j == k) {
                    break
                }
                if (sortedNums[j] + sortedNums[k] == target) {
                    result.add(listOf(sortedNums[i], sortedNums[j], sortedNums[k]))
                }
            }
        }
        return result
    }
}