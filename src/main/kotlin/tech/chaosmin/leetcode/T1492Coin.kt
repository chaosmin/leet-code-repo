package tech.chaosmin.leetcode

/**
 * 面试题 08.11. 硬币 | 难度：中等
 *
 * 硬币。给定数量不限的硬币，币值为25分、10分、5分和1分，编写代码计算n分有几种表示法。(结果可能会很大，你需要将结果模上1000000007)
 *
 * @author romani min
 * @since 2020/4/23
 */
object T1492Coin {
    fun waysToChange(n: Int): Int {
        val mod = 1000000007L
        var ans = 0L

        var i = 0
        while (i * 25 <= n) {
            val rest = n - 25 * i
            val a = rest / 10
            val b = (rest % 10) / 5
            ans = (ans + (a + 1) * ((a + b + 1) % mod)) % mod
            i++
        }

        return ans.toInt()
    }
}