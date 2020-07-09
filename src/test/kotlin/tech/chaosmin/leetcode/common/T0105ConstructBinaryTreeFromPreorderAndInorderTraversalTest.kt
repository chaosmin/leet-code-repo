package tech.chaosmin.leetcode.common

import org.junit.Assert
import org.junit.jupiter.api.Test
import tech.chaosmin.leetcode.common.T0105ConstructBinaryTreeFromPreorderAndInorderTraversal

/**
 * @author romani min
 * @since 2020/5/22
 */
internal class T0105ConstructBinaryTreeFromPreorderAndInorderTraversalTest {

    @Test
    fun buildTree() {
        val preorder = intArrayOf(3, 9, 20, 15, 7)
        val inorder = intArrayOf(9, 3, 15, 20, 7)
        val result = T0105ConstructBinaryTreeFromPreorderAndInorderTraversal.buildTree(preorder, inorder)
        Assert.assertEquals(3, result?.`val`)
        Assert.assertEquals(9, result?.left?.`val`)
        Assert.assertEquals(20, result?.right?.`val`)
        Assert.assertEquals(15, result?.right?.left?.`val`)
        Assert.assertEquals(7, result?.right?.right?.`val`)
    }
}