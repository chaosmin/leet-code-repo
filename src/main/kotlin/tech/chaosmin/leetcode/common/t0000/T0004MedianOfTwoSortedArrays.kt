package tech.chaosmin.leetcode.common.t0000

/**
 * 4. 寻找两个有序数组的中位数 | 难度：困难
 *
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 * 你可以假设 nums1 和 nums2 不会同时为空。
 *
 * ************************************
 *
 * 执行用时：284 ms, 在所有 Kotlin 提交中击败了95.71%的用户
 * 内存消耗：43 MB, 在所有 Kotlin 提交中击败了100.00%的用户
 *
 * @author romani min
 * @since 2020/4/21
 */
object T0004MedianOfTwoSortedArrays {
    private fun mergeArrays(nums1: IntArray, nums2: IntArray): IntArray {
        val result = IntArray(nums1.size + nums2.size)
        var p1 = nums1.size - 1
        var p2 = nums2.size - 1
        var p = nums1.size + nums2.size - 1
        while ((p1 >= 0) && (p2 >= 0)) {
            result[p--] = if (nums1[p1] < nums2[p2]) nums2[p2--] else nums1[p1--]
        }
        if (p1 < 0) {
            System.arraycopy(nums2, 0, result, 0, p2 + 1)
        } else {
            System.arraycopy(nums1, 0, result, 0, p1 + 1)
        }
        return result
    }

    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val mergedArray = mergeArrays(nums1, nums2)
        return if (mergedArray.size % 2 == 0) {
            (mergedArray[mergedArray.size / 2 - 1] + mergedArray[mergedArray.size / 2]) / 2.0
        } else {
            mergedArray[mergedArray.size / 2].toDouble()
        }
    }
}