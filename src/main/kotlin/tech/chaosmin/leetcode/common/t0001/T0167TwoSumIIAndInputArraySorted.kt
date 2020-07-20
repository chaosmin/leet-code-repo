package tech.chaosmin.leetcode.common.t0001

/**
 * 167. 两数之和 II - 输入有序数组 | 难度：简单
 *
 * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
 * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
 *
 * 说明:
 *
 * 返回的下标值（index1 和 index2）不是从零开始的。
 * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
 *
 * ************************************
 *
 * 执行用时：220 ms, 在所有 Kotlin 提交中击败了68.42%的用户
 * 内存消耗：34.7 MB, 在所有 Kotlin 提交中击败了100.00%的用户
 *
 * @author romani min
 * @since 2020/7/20
 */
object T0167TwoSumIIAndInputArraySorted {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var i = 0
        var j = numbers.size - 1
        while (i < j) {
            val sum = numbers[i] + numbers[j]
            when {
                sum == target -> return intArrayOf(i + 1, j + 1)
                sum < target -> i++
                else -> j--
            }
        }
        return intArrayOf(i + 1, j + 1)
    }
}