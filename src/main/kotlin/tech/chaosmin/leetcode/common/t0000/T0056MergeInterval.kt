package tech.chaosmin.leetcode.common.t0000

/**
 * 56. 合并区间 | 难度：中等
 *
 * 给出一个区间的集合，请合并所有重叠的区间。
 *
 * ************************************
 *
 * 执行用时 : 316 ms, 在所有 Kotlin 提交中击败了56.25%的用户
 * 内存消耗 : 36.6 MB, 在所有 Kotlin 提交中击败了100.00%的用户
 *
 * @author romani min
 * @since 2020/4/16
 */
object T0056MergeInterval {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        var result = emptyArray<IntArray>()
        intervals.sortedArrayWith(Comparator { o1, o2 ->
            if (o1[0] == o2[0]) o1[1].compareTo(o2[1])
            else o1[0].compareTo(o2[0])
        }
        ).forEach { interval ->
            if (result.isEmpty() || result.last()[1] < interval[0]) {
                result = result.plus(interval)
            } else {
                result.last()[1] = Math.max(result.last()[1], interval[1])
            }
        }
        return result
    }
}