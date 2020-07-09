package tech.chaosmin.leetcode.common.t0016

import org.junit.Assert
import org.junit.jupiter.api.Test

/**
 * @author romani min
 * @since 2020/6/9
 */
internal class T1644TranslateNumbersIntoStringsTest {

    @Test
    fun translateNum() {
        val result = T1644TranslateNumbersIntoStrings.translateNum(12258)
        Assert.assertEquals(5, result)
    }
}