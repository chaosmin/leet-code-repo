package tech.chaosmin.leetcode.common

import org.junit.Assert
import org.junit.jupiter.api.Test
import tech.chaosmin.leetcode.common.T0837New21Game
import kotlin.math.pow

/**
 * @author romani min
 * @since 2020/6/3
 */
internal class T0837New21GameTest {

    @Test
    fun new21Game() {
        val result1 = T0837New21Game.new21Game(10, 1, 10)
        Assert.assertEquals(1.0, result1, 10.0.pow(-5.0))

        val result2 = T0837New21Game.new21Game(6, 1, 10)
        Assert.assertEquals(0.6, result2, 10.0.pow(-5.0))

        val result3 = T0837New21Game.new21Game(21, 17, 10)
        Assert.assertEquals(0.73278, result3, 10.0.pow(-5.0))
    }
}