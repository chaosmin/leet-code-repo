package tech.chaosmin.leetcode

import org.junit.Assert
import org.junit.jupiter.api.Test

/**
 * @author romani min
 * @since 2020/6/8
 */
internal class T0990SatisfiabilityOfEqualityEquationsTest {

    @Test
    fun equationsPossible() {
        val result1 = T0990SatisfiabilityOfEqualityEquations.equationsPossible(arrayOf("a==b", "b!=a"))
        Assert.assertFalse(result1)

        val result2 = T0990SatisfiabilityOfEqualityEquations.equationsPossible(arrayOf("a==b", "b==a"))
        Assert.assertTrue(result2)

        val result3 = T0990SatisfiabilityOfEqualityEquations.equationsPossible(arrayOf("a==b", "b==c", "c==a"))
        Assert.assertTrue(result3)

        val result4 = T0990SatisfiabilityOfEqualityEquations.equationsPossible(arrayOf("a==b", "b!=c", "c==a"))
        Assert.assertFalse(result4)

        val result5 = T0990SatisfiabilityOfEqualityEquations.equationsPossible(arrayOf("c==c", "b==d", "x!=z"))
        Assert.assertTrue(result5)
    }
}