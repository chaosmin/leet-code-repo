package tech.chaosmin.leetcode.common

/**
 * 1248. 统计「优美子数组」 | 难度：中等
 *
 * 给你一个整数数组 nums 和一个整数 k。
 * 如果某个 连续 子数组中恰好有 k 个奇数数字，我们就认为这个子数组是「优美子数组」。
 * 请返回这个数组中「优美子数组」的数目。
 *
 * ************************************
 *
 * 执行用时 :492 ms, 在所有 Kotlin 提交中击败了100.00%的用户
 * 内存消耗 :43.1 MB, 在所有 Kotlin 提交中击败了100.00%的用户
 *
 * @author romani min
 * @since 2020/4/21
 */
object T1248StatisticsBeautifulSubarrays {
    fun numberOfSubarrays(nums: IntArray, k: Int): Int {
        val cnt = IntArray(nums.size + 1) { 0 }
        var odd = 0
        var ans = 0
        cnt[0] = 1
        nums.forEach { num ->
            odd += num.and(1)
            ans += if (odd >= k) cnt[odd - k] else 0
            cnt[odd] += 1
        }
        return ans
    }
}