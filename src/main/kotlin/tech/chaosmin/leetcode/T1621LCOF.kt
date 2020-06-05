package tech.chaosmin.leetcode

import com.alibaba.fastjson.JSON

/**
 * 面试题29. 顺时针打印矩阵 | 难度：简单
 *
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 *
 * ************************************
 *
 * 执行用时 :280 ms, 在所有 Kotlin 提交中击败了68.42%的用户
 * 内存消耗 :36.7 MB, 在所有 Kotlin 提交中击败了100.00%的用户
 *
 * @author romani min
 * @since 2020/6/5
 */
object T1621LCOF {
    fun spiralOrder(matrix: Array<IntArray>): IntArray {
        if (matrix.isEmpty() || matrix[0].isEmpty()) {
            return IntArray(0)
        }
        val maxElement = matrix[0].size * matrix.size
        val result = IntArray(maxElement)
        var index = 0
        var left = 0
        var right = matrix[0].size - 1
        var top = 0
        var bottom = matrix.size - 1

        while (index < maxElement) {
            for (i in left..right) {
                result[index++] = matrix[top][i]
            }
            if (index == maxElement) {
                break
            }
            for (i in top + 1..bottom) {
                result[index++] = matrix[i][right]
            }
            if (index == maxElement) {
                break
            }
            for (i in right - 1 downTo left) {
                result[index++] = matrix[bottom][i]
            }
            if (index == maxElement) {
                break
            }
            for (i in bottom - 1 downTo top + 1) {
                result[index++] = matrix[i][left]
            }
            if (index == maxElement) {
                break
            }

            left += 1
            right -= 1
            top += 1
            bottom -= 1
        }
        return result
    }
}