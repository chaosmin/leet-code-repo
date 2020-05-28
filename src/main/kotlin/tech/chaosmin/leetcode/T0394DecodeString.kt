package tech.chaosmin.leetcode

import java.util.*

/**
 * 394. 字符串解码 | 难度：中等
 *
 * 给定一个经过编码的字符串，返回它解码后的字符串。
 *
 * 编码规则为: k[encoded_string]，表示其中方括号内部的 encoded_string 正好重复 k 次。注意 k 保证为正整数。
 *
 * 你可以认为输入字符串总是有效的；输入字符串中没有额外的空格，且输入的方括号总是符合格式要求的。
 *
 * 此外，你可以认为原始数据不包含数字，所有的数字只表示重复的次数 k ，例如不会出现像 3a 或 2[4] 的输入。
 *
 * @author romani min
 * @since 2020/5/28
 */
object T0394DecodeString {
    fun decodeString(s: String): String {
        var origin = s
        val tails = Stack<Int>()
        var index = s.length - 1
        do {
            when (s.elementAt(index)) {
                ']' -> {
                    tails.push(index)
                    // println(JSON.toJSONString(tails))
                }
                '[' -> {
                    val head = index
                    val tail = tails.pop()
                    while (index > 0 && Character.isDigit(s.elementAt(index - 1))) {
                        index--
                    }
                    val replaceStr =
                        (1..s.substring(index, head).toInt()).joinToString("") {
                            s.substring(
                                head + 1, tail
                            )
                        }
                    // println(replaceStr)
                    print("$origin replace($index,${tail + 1}) => ")
                    origin = origin.replaceRange(index, tail + 1, replaceStr)
                    println(origin)
                }
            }
            index--
        } while (index >= 0)
        return origin
    }
}