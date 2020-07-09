package tech.chaosmin.leetcode.base

/**
 * 字典树 Trie
 *
 * @author romani min
 * @since 2020/7/9
 */
class Trie {
    val next = Array<Trie?>(26) { null }
    var end: Boolean = false

    fun insert(s: String) {
        var curPos = this
        for (i in s.length - 1 downTo 0) {
            val t = s.elementAt(i) - 'a'
            if (curPos.next[t] == null) {
                curPos.next[t] = Trie()
            }
            curPos = curPos.next[t]!!
        }
        curPos.end = true
    }
}