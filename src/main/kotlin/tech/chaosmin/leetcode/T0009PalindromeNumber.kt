package tech.chaosmin.leetcode

/**
 * 9. 回文数 | 难度：简单
 *
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * ************************************
 *
 * 执行用时 :256 ms, 在所有 Kotlin 提交中击败了61.64%的用户
 * 内存消耗 :34.4 MB, 在所有 Kotlin 提交中击败了100.00%的用户
 *
 * @author romani min
 * @since 2020/6/10
 */
object T0009PalindromeNumber {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false
        }
        var temp = x
        var revertedNumber = 0
        while (temp > revertedNumber) {
            revertedNumber = revertedNumber * 10 + temp % 10
            temp /= 10
        }
        return temp == revertedNumber || temp == revertedNumber / 10
    }
}