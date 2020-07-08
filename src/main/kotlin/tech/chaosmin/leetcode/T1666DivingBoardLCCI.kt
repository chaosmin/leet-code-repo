package tech.chaosmin.leetcode

/**
 * 面试题 16.11. 跳水板 | 难度：简单
 *
 * 你正在使用一堆木板建造跳水板。有两种类型的木板，其中长度较短的木板长度为shorter，长度较长的木板长度为longer。你必须正好使用k块木板。编写一个方法，生成跳水板所有可能的长度。
 * 返回的长度需要从小到大排列。
 *
 * ************************************
 *
 * 执行用时：452 ms, 在所有 Kotlin 提交中击败了20.00%的用户
 * 内存消耗：43.2 MB, 在所有 Kotlin 提交中击败了100.00%的用户
 *
 * @author romani min
 * @since 2020/7/8
 */
object T1666DivingBoardLCCI {
    fun divingBoard(shorter: Int, longer: Int, k: Int): IntArray {
        return when {
            k == 0 -> intArrayOf()
            shorter == longer -> intArrayOf(shorter * k)
            else -> {
                val result = mutableListOf<Int>()
                for (i in k downTo 0) {
                    result.add(shorter * i + longer * (k - i))
                }
                result.toIntArray()
            }
        }
    }
}