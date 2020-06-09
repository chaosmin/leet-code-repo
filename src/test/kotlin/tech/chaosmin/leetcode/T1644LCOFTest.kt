package tech.chaosmin.leetcode

import org.junit.Assert
import org.junit.jupiter.api.Test

/**
 * @author romani min
 * @since 2020/6/9
 */
internal class T1644LCOFTest {

    @Test
    fun translateNum() {
        val result = T1644LCOF.translateNum(12258)
        Assert.assertEquals(5, result)
    }
}