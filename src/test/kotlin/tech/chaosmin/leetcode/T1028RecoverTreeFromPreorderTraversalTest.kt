package tech.chaosmin.leetcode

import org.junit.Assert
import org.junit.jupiter.api.Test

/**
 * @author romani min
 * @since 2020/6/18
 */
internal class T1028RecoverTreeFromPreorderTraversalTest {

    @Test
    fun recoverFromPreorder() {
        println("TEST CASE ONE: 1-2--3--4-5--6--7")
        val result1 = T1028RecoverTreeFromPreorderTraversal.recoverFromPreorder("1-2--3--4-5--6--7")
        Assert.assertEquals(1, result1?.`val`)
        Assert.assertEquals(2, result1?.left?.`val`)
        Assert.assertEquals(5, result1?.right?.`val`)
        Assert.assertEquals(3, result1?.left?.left?.`val`)
        Assert.assertEquals(4, result1?.left?.right?.`val`)
        Assert.assertEquals(6, result1?.right?.left?.`val`)
        Assert.assertEquals(7, result1?.right?.right?.`val`)

        println("TEST CASE TWO: 1-2--3---4-5--6---7")
        val result2 = T1028RecoverTreeFromPreorderTraversal.recoverFromPreorder("1-2--3---4-5--6---7")
        Assert.assertEquals(1, result2?.`val`)
        Assert.assertEquals(2, result2?.left?.`val`)
        Assert.assertEquals(5, result2?.right?.`val`)
        Assert.assertEquals(3, result2?.left?.left?.`val`)
        Assert.assertEquals(6, result2?.right?.left?.`val`)
        Assert.assertEquals(4, result2?.left?.left?.left?.`val`)
        Assert.assertEquals(7, result2?.right?.left?.left?.`val`)

        println("TEST CASE THREE: 1-401--349---90--88")
        val result3 = T1028RecoverTreeFromPreorderTraversal.recoverFromPreorder("1-401--349---90--88")
        Assert.assertEquals(1, result3?.`val`)
        Assert.assertEquals(401, result3?.left?.`val`)
        Assert.assertEquals(349, result3?.left?.left?.`val`)
        Assert.assertEquals(88, result3?.left?.right?.`val`)
        Assert.assertEquals(90, result3?.left?.left?.left?.`val`)

        println("TEST CASE FOUR: 1")
        val result4 = T1028RecoverTreeFromPreorderTraversal.recoverFromPreorder("1")
        Assert.assertEquals(1, result4?.`val`)

        println("TEST CASE FIVE: 7-3")
        val result5 = T1028RecoverTreeFromPreorderTraversal.recoverFromPreorder("7-3")
        Assert.assertEquals(7, result5?.`val`)
        Assert.assertEquals(3, result5?.left?.`val`)
    }

    @Test
    fun extend() {
        println("EXTEND CASE: 8-6--9---10--4-7")
        val result1 = T1028RecoverTreeFromPreorderTraversal.recoverFromPreorder("8-6--9---10--4-7")
        Assert.assertEquals(8, result1?.`val`)
        Assert.assertEquals(6, result1?.left?.`val`)
        Assert.assertEquals(7, result1?.right?.`val`)
        Assert.assertEquals(9, result1?.left?.left?.`val`)
        Assert.assertEquals(4, result1?.left?.right?.`val`)
        Assert.assertEquals(10, result1?.left?.left?.left?.`val`)
    }
}