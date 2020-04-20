package tech.chaosmin.leetcode

import com.alibaba.fastjson.JSON

/**
 * 200. 岛屿数量 | 难度：中等
 *
 * 给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
 * 岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。
 * 此外，你可以假设该网格的四条边均被水包围。
 *
 * ************************************
 *
 * 执行用时 :232 ms, 在所有 Kotlin 提交中击败了66.67%的用户
 * 内存消耗 :36 MB, 在所有 Kotlin 提交中击败了100.00%的用户
 *
 * @author romani min
 * @since 2020/4/20
 */
object T0200NumberOfIslands {
    private fun find(grid: Array<CharArray>, row: Int, column: Int) {
        val nr = grid.size - 1
        val nc = grid[0].size - 1
        if (grid[Math.min(row + 1, nr)][Math.min(column, nc)] == '1') {
            grid[Math.min(row + 1, nr)][Math.min(column, nc)] = '0'
            find(grid, row + 1, column)
        }
        if (grid[Math.min(Math.max(row - 1, 0), nr)][Math.min(column, nc)] == '1') {
            grid[Math.min(Math.max(row - 1, 0), nr)][Math.min(column, nc)] = '0'
            find(grid, Math.max(row - 1, 0), column)
        }
        if (grid[Math.min(row, nr)][Math.min(column + 1, nc)] == '1') {
            grid[Math.min(row, nr)][Math.min(column + 1, nc)] = '0'
            find(grid, row, column + 1)
        }
        if (grid[Math.min(row, nr)][Math.min(Math.max(column - 1, 0), nc)] == '1') {
            grid[Math.min(row, nr)][Math.min(Math.max(column - 1, 0), nc)] = '0'
            find(grid, row, Math.max(column - 1, 0))
        }
    }

    fun numIslands(grid: Array<CharArray>): Int {
        var count = 0
        grid.forEachIndexed { r, column ->
            column.forEachIndexed { c, value ->
                println(JSON.toJSONString(grid) + "\n")
                if (value == '1') {
                    count++
                    find(grid, r, c)
                }
            }
        }
        return count
    }
}