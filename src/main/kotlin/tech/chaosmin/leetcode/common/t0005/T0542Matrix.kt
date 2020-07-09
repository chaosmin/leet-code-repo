package tech.chaosmin.leetcode.common.t0005

/**
 * 542. 0 1 矩阵 | 难度：中等
 *
 * 给定一个由 0 和 1 组成的矩阵，找出每个元素到最近的 0 的距离。
 * 两个相邻元素间的距离为 1 。
 *
 * @author romani min
 * @since 2020/4/15
 */
object T0542Matrix {
    fun updateMatrix(matrix: Array<IntArray>): Array<IntArray> {
        val m = matrix.size
        val n = matrix[0].size
        val result = Array(m) { IntArray(n) { Int.MAX_VALUE / 2 } }
        matrix.forEachIndexed { x, row ->
            row.forEachIndexed { y, value ->
                if (value == 0) {
                    result[x][y] = 0
                }
            }
        }
        // 水平向左移动 + 竖直向上移动
        for (i in 0 until m) {
            for (j in 0 until n) {
                if (i - 1 >= 0) {
                    result[i][j] = Math.min(result[i][j], result[i - 1][j] + 1)
                }
                if (j - 1 >= 0) {
                    result[i][j] = Math.min(result[i][j], result[i][j - 1] + 1)
                }
            }
        }
        // 水平向右移动 + 竖直向下移动
        for (i in m - 1 downTo 0) {
            for (j in n - 1 downTo 0) {
                if (i + 1 < m) {
                    result[i][j] = Math.min(result[i][j], result[i + 1][j] + 1)
                }
                if (j + 1 < n) {
                    result[i][j] = Math.min(result[i][j], result[i][j + 1] + 1)
                }
            }
        }
        return result
    }
}