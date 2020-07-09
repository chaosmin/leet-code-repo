package tech.chaosmin.leetcode.common.t0003

/**
 * 378. 有序矩阵中第K小的元素 | 难度：中等
 *
 * 给定一个 n x n 矩阵，其中每行和每列元素均按升序排序，找到矩阵中第 k 小的元素。
 * 请注意，它是排序后的第 k 小元素，而不是第 k 个不同的元素。
 *
 * ************************************
 *
 * 执行用时：344 ms, 在所有 Kotlin 提交中击败了80.00%的用户
 * 内存消耗：44.1 MB, 在所有 Kotlin 提交中击败了100.00%的用户
 *
 * @author romani min
 * @since 2020/7/2
 */
object T0378KthSmallestElementInSortedMatrix {
    fun kthSmallest(matrix: Array<IntArray>, k: Int): Int {
        val n = matrix.size
        var min = matrix[0][0]
        var max = matrix[n - 1][n - 1]
        while (min < max) {
            val mid: Int = min + (max - min shr 1)
            if (check(
                    matrix,
                    mid,
                    k
                )
            ) {
                max = mid
            } else {
                min = mid + 1
            }
        }
        return min
    }

    private fun check(matrix: Array<IntArray>, midValue: Int, k: Int): Boolean {
        var i = matrix.size - 1
        var j = 0
        var num = 0
        while (i >= 0 && j < matrix.size) {
            if (matrix[i][j] <= midValue) {
                num += i + 1
                j++
            } else {
                i--
            }
        }
        return num >= k
    }
}