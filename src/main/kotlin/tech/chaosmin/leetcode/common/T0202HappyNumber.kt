package tech.chaosmin.leetcode.common

/**
 * 202. 快乐数 | 难度：简单
 *
 * 编写一个算法来判断一个数 n 是不是快乐数。
 * 「快乐数」定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为1，也可能是 无限循环 但始终变不到1。如果 可以变为1，那么这个数就是快乐数。
 * 如果 n 是快乐数就返回 True ；不是，则返回 False 。
 *
 * ************************************
 *
 * 执行用时 :176 ms, 在所有 Kotlin 提交中击败了57.14%的用户
 * 内存消耗 :31.7 MB, 在所有 Kotlin 提交中击败了100.00%的用户
 *
 * @author romani min
 * @since 2020/4/30
 */
object T0202HappyNumber {
    fun next(n: Int): Int {
        var result = 0
        var number = n
        while (number > 0) {
            val t = number % 10
            result += t * t
            number /= 10
        }
        return result
    }

    fun isHappy(n: Int): Boolean {
        var tortoise = n
        var rabbit = next(n)
        while (rabbit != 1 && tortoise != rabbit) {
            tortoise = next(tortoise)
            rabbit = next(
                next(rabbit)
            )
        }
        return rabbit == 1
    }
}