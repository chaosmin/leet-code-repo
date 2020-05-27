package tech.chaosmin.leetcode

/**
 * 974. SubArray Sums Divisible by K | Difficulty: medium
 * Given an array A of integers, return the number of (contiguous, non-empty) subarrays that have a sum divisible by K.
 *
 * ************************************
 *
 * 执行用时 :372 ms, 在所有 Kotlin 提交中击败了100.00%的用户
 * 内存消耗 :41.2 MB, 在所有 Kotlin 提交中击败了100.00%的用户
 *
 * @author romani min
 * @since 2020/5/27
 */
object T0974SubArraySumsDivisibleByK {
    fun subarraysDivByK(A: IntArray, K: Int): Int {
        val record = mutableMapOf<Int, Int>()
        record[0] = 1
        var sum = 0
        var result = 0
        A.forEach { num ->
            sum += num
            val m = (sum % K + K) % K
            val value = record.getOrDefault(m, 0)
            result += value
            record[m] = value + 1
        }
        return result
    }
}