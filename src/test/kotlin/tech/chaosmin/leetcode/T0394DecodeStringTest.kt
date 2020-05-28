package tech.chaosmin.leetcode

import org.junit.Assert
import org.junit.jupiter.api.Test

/**
 * @author romani min
 * @since 2020/5/28
 */
internal class T0394DecodeStringTest {

    @Test
    fun decodeString() {
        println("TEST CASE ONE START: 3[a]2[bc]")
        val result1 = T0394DecodeString.decodeString("3[a]2[bc]")
        Assert.assertEquals("aaabcbc", result1)

        println("TEST CASE TWO START: 3[a2[c]]")
        val result2 = T0394DecodeString.decodeString("3[a2[c]]")
        Assert.assertEquals("accaccacc", result2)

        println("TEST CASE THREE START: 2[abc]3[cd]ef")
        val result3 = T0394DecodeString.decodeString("2[abc]3[cd]ef")
        Assert.assertEquals("abcabccdcdcdef", result3)
    }
}