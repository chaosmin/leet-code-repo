package tech.chaosmin.leetcode

import org.junit.Assert
import org.junit.jupiter.api.Test

/**
 * @author romani min
 * @since 2020/6/23
 */
internal class T0067AddBinaryTest {

    @Test
    fun addBinary() {
        println("TEST CASE 1: 11 + 1")
        val result1 = T0067AddBinary.addBinary("11", "1")
        Assert.assertEquals("100", result1)

        println("TEST CASE 2: 1010 + 1011")
        val result2 = T0067AddBinary.addBinary("1010", "1011")
        Assert.assertEquals("10101", result2)

        println("TEST CASE 3: 0 + 0")
        val result3 = T0067AddBinary.addBinary("0", "0")
        Assert.assertEquals("0", result3)

        println("TEST CASE 4: 0 + 1")
        val result4 = T0067AddBinary.addBinary("0", "1")
        Assert.assertEquals("1", result4)
    }
}