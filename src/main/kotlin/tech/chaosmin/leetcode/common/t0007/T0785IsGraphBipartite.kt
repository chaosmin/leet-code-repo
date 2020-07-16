package tech.chaosmin.leetcode.common.t0007


/**
 * 785. 判断二分图 | 难度：中等
 *
 * 给定一个无向图graph，当这个图为二分图时返回true。
 *
 * 如果我们能将一个图的节点集合分割成两个独立的子集A和B，并使图中的每一条边的两个节点一个来自A集合，一个来自B集合，我们就将这个图称为二分图。
 *
 * graph将会以邻接表方式给出，graph[i]表示图中与节点i相连的所有节点。每个节点都是一个在0到graph.length-1之间的整数。这图中没有自环和平行边： graph[i] 中不存在i，并且graph[i]中没有重复的值。
 *
 * ************************************
 *
 * 执行用时：344 ms, 在所有 Kotlin 提交中击败了20.00%的用户
 * 内存消耗：35.9 MB, 在所有 Kotlin 提交中击败了100.00%的用户
 *
 * @author romani min
 * @since 2020/7/16
 */
object T0785IsGraphBipartite {
    private const val UNCOLORED = 0
    private const val RED = 1
    private const val GREEN = 2
    private var color: Array<Int>? = null
    private var valid = false

    fun isBipartite(graph: Array<IntArray>): Boolean {
        valid = true
        color = Array(graph.size) { UNCOLORED }
        for (i in graph.indices) {
            if (color!![i] == UNCOLORED) {
                dfs(i, RED, graph)
            }
        }
        return valid
    }

    private fun dfs(node: Int, c: Int, graph: Array<IntArray>) {
        color!![node] = c
        val cNei = if (c == RED) GREEN else RED
        for (neighbor in graph[node]) {
            if (color!![neighbor] == UNCOLORED) {
                dfs(neighbor, cNei, graph)
                if (!valid) {
                    return
                }
            } else if (color!![neighbor] != cNei) {
                valid = false
                return
            }
        }
    }
}