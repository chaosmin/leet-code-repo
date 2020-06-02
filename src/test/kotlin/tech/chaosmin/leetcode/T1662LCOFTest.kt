package tech.chaosmin.leetcode

import org.junit.Assert
import org.junit.jupiter.api.Test

/**
 * @author romani min
 * @since 2020/6/2
 */
internal class T1662LCOFTest {

    @Test
    fun sumNums() {
        val result1 = T1662LCOF.sumNums(3)
        Assert.assertEquals(6, result1)

        val result2 = T1662LCOF.sumNums(9)
        Assert.assertEquals(45, result2)
    }
}