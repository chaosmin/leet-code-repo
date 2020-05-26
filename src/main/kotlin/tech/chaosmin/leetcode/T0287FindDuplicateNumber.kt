package tech.chaosmin.leetcode

/**
 * 287. Find the Duplicate Number | Difficulty: medium
 *
 * Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.
 *
 * ************************************
 *
 * 执行用时 :252 ms, 在所有 Kotlin 提交中击败了36.36%的用户
 * 内存消耗 :34.1 MB, 在所有 Kotlin 提交中击败了100.00%的用户
 *
 * @author romani min
 * @since 2020/5/26
 */
object T0287FindDuplicateNumber {
    fun findDuplicate(nums: IntArray): Int {
        var slow = 0
        var fast = 0
        do {
            slow = nums[slow]
            fast = nums[nums[fast]]
        } while (slow != fast)
        slow = 0
        while (slow != fast) {
            slow = nums[slow]
            fast = nums[fast]
        }
        return slow
    }
}