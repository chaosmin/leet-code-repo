package tech.chaosmin.leetcode.common.t0016

import org.junit.Assert
import org.junit.jupiter.api.Test

/**
 * @author romani min
 * @since 2020/7/9
 */
internal class T1690ReSpaceTest {

    @Test
    fun respace() {
        val testSentence = "jesslookedjustliketimherbrother"
        val result = T1690ReSpace.respace(arrayOf("looked", "just", "like", "her", "brother"), testSentence)
        Assert.assertEquals(7, result)
    }
}