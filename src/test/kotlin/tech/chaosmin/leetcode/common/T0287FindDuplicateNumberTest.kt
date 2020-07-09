package tech.chaosmin.leetcode.common

import org.junit.Assert
import org.junit.jupiter.api.Test
import tech.chaosmin.leetcode.common.T0287FindDuplicateNumber

/**
 * @author romani min
 * @since 2020/5/26
 */
internal class T0287FindDuplicateNumberTest {

    @Test
    fun findDuplicate() {
        val result = T0287FindDuplicateNumber.findDuplicate(intArrayOf(1, 3, 4, 2, 2))
        Assert.assertEquals(2, result)

        val result2 = T0287FindDuplicateNumber.findDuplicate(intArrayOf(3, 1, 3, 4, 2))
        Assert.assertEquals(3, result2)
    }
}