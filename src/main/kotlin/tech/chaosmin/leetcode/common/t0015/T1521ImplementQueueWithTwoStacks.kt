package tech.chaosmin.leetcode.common.t0015

import java.util.*

/**
 * 剑指 Offer 09. 用两个栈实现队列 | 难度：简单
 *
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 *
 * @author romani min
 * @since 2020/6/30
 */
object T1521ImplementQueueWithTwoStacks {
    class CQueue {
        private val shot = Stack<Int>()
        private val ahh = Stack<Int>()

        fun appendTail(value: Int) {
            ahh.push(value)
        }

        fun deleteHead(): Int {
            return when {
                shot.isNotEmpty() -> shot.pop()
                ahh.isNotEmpty() -> {
                    while (ahh.isNotEmpty()) {
                        shot.push(ahh.pop())
                    }
                    return shot.pop()
                }
                else -> -1
            }
        }
    }
}