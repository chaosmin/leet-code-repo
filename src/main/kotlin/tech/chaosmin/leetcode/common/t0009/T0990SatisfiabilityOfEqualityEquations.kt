package tech.chaosmin.leetcode.common.t0009

/**
 * 990. 等式方程的可满足性 | 难度：中等
 *
 * 给定一个由表示变量之间关系的字符串方程组成的数组，每个字符串方程 equations[i] 的长度为 4，并采用两种不同的形式之一："a==b" 或 "a!=b"。在这里，a 和 b 是小写字母（不一定不同），表示单字母变量名。
 * 只有当可以将整数分配给变量名，以便满足所有给定的方程时才返回 true，否则返回 false。 
 *
 * ************************************
 *
 * 执行用时 :196 ms, 在所有 Kotlin 提交中击败了100.00%的用户
 * 内存消耗 :34.4 MB, 在所有 Kotlin 提交中击败了100.00%的用户
 *
 * @author romani min
 * @since 2020/6/8
 */
object T0990SatisfiabilityOfEqualityEquations {
    fun equationsPossible(equations: Array<String>): Boolean {
        val unionFind =
            UnionFind(26)
        equations.filter { it[1] == '=' }.forEach {
            val index1 = it.elementAt(0) - 'a'
            val index2 = it.elementAt(3) - 'a'
            unionFind.union(index1, index2)
        }
        return !equations.filter { it[1] == '!' }.any {
            val index1 = it.elementAt(0) - 'a'
            val index2 = it.elementAt(3) - 'a'
            unionFind.isConnected(index1, index2)
        }
    }

    class UnionFind(val size: Int) {
        private val parent = IntArray(size)

        init {
            for (i in 0 until size) {
                parent[i] = i
            }
        }

        fun union(index1: Int, index2: Int) {
            parent[find(index1)] = find(index2)
        }

        fun isConnected(index1: Int, index2: Int): Boolean {
            return find(index1) == find(index2)
        }

        private fun find(index: Int): Int {
            var i = index
            while (parent[i] != i) {
                parent[i] = parent[parent[i]];
                i = parent[i];
            }
            return i
        }
    }
}