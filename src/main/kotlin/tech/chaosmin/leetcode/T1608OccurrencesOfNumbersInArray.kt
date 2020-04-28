package tech.chaosmin.leetcode

/**
 * 面试题56 - I. 数组中数字出现的次数 | 难度：中等
 *
 * 一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。
 *
 * ************************************
 *
 * 执行用时 :268 ms, 在所有 Kotlin 提交中击败了100.00%的用户
 * 内存消耗 :36.3 MB, 在所有 Kotlin 提交中击败了100.00%的用户
 *
 * @author romani min
 * @since 2020/4/28
 */
object T1608OccurrencesOfNumbersInArray {
    fun singleNumbers(nums: IntArray): IntArray {
        var xorSum = 0
        val result = IntArray(2) { 0 }
        nums.forEach { num ->
            xorSum = xorSum.xor(num)
        }
        val lowbit = xorSum.and(-xorSum)
        nums.forEach { num ->
            result[if (num.and(lowbit) > 0) 0 else 1] = result[if (num.and(lowbit) > 0) 0 else 1].xor(num)
        }
        return result
    }
}