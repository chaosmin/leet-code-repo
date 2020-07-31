package tech.chaosmin.leetcode.common.t0016

/**
 * 面试题 08.03. 魔术索引 | 难度：简单
 *
 * 魔术索引。 在数组A[0...n-1]中，有所谓的魔术索引，满足条件A[i] = i。
 * 给定一个有序整数数组，编写一种方法找出魔术索引，若有的话，在数组A中找出一个魔术索引，如果没有，则返回-1。若有多个魔术索引，返回索引值最小的一个。
 *
 * ************************************
 *
 * 执行用时：252 ms, 在所有 Kotlin 提交中击败了100.00%的用户
 * 内存消耗：35.6 MB, 在所有 Kotlin 提交中击败了100.00%的用户
 *
 * @author romani min
 * @since 2020/7/31
 */
object T1685MagicIndex {
    fun findMagicIndex(nums: IntArray): Int {
        nums.forEachIndexed { index, i ->
            if (index == i) {
                return index
            }
        }
        return -1
    }
}