package tech.chaosmin.leetcode.common

import org.junit.Assert
import org.junit.jupiter.api.Test
import tech.chaosmin.leetcode.common.T1662SequenceSum

/**
 * @author romani min
 * @since 2020/6/2
 */
internal class T1662SequenceSumTest {

    @Test
    fun sumNums() {
        val result1 = T1662SequenceSum.sumNums(3)
        Assert.assertEquals(6, result1)

        val result2 = T1662SequenceSum.sumNums(9)
        Assert.assertEquals(45, result2)
    }
}