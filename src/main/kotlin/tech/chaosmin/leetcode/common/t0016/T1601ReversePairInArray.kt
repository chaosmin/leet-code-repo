package tech.chaosmin.leetcode.common.t0016

/**
 * 面试题51. 数组中的逆序对 | 难度：中等
 *
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组，求出这个数组中的逆序对的总数。
 *
 * ************************************
 *
 * 执行用时 :496 ms, 在所有 Kotlin 提交中击败了100.00%的用户
 * 内存消耗 :44.8 MB, 在所有 Kotlin 提交中击败了100.00%的用户
 *
 * @author romani mi
 * @since 2020/4/24
 */
object T1601ReversePairInArray {
    fun reversePairs(nums: IntArray): Int {
        val size = nums.size
        if (size < 2) {
            return 0
        }
        val temp = IntArray(size)
        return reversePairs(
            nums.clone(),
            0,
            size - 1,
            temp
        )
    }

    fun reversePairs(nums: IntArray, left: Int, right: Int, temp: IntArray): Int {
        if (left == right) {
            return 0
        }
        val mid = left + (right - left) / 2
        val leftPairs =
            reversePairs(
                nums,
                left,
                mid,
                temp
            )
        val rightPairs = reversePairs(
            nums,
            mid + 1,
            right,
            temp
        )
        if (nums[mid] <= nums[mid + 1]) {
            return leftPairs + rightPairs
        }
        val crossPairs: Int =
            mergeAndCount(
                nums,
                left,
                mid,
                right,
                temp
            )
        return leftPairs + rightPairs + crossPairs
    }

    fun mergeAndCount(nums: IntArray, left: Int, mid: Int, right: Int, temp: IntArray): Int {
        for (x in left..right) {
            temp[x] = nums[x]
        }
        var i = left
        var j = mid + 1

        var count = 0
        for (k in left..right) {
            when {
                i == mid + 1 -> {
                    nums[k] = temp[j]
                    j++
                }
                j == right + 1 -> {
                    nums[k] = temp[i]
                    i++
                }
                temp[i] <= temp[j] -> {
                    nums[k] = temp[i]
                    i++
                }
                else -> {
                    nums[k] = temp[j]
                    j++
                    count += (mid - i + 1)
                }
            }
        }
        return count
    }
}