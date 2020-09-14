package tech.chaosmin.leetcode.common.t0000

import org.junit.Assert
import org.junit.jupiter.api.Test
import tech.chaosmin.leetcode.base.TreeNode

internal class T0094BinaryTreeInorderTraversalTest {

    @Test
    fun inorderTraversal() {
        val testCase = TreeNode(1).apply {
            this.right = TreeNode(2).apply {
                this.left = TreeNode(3)
            }
        }
        val result = T0094BinaryTreeInorderTraversal.inorderTraversal(testCase)
        Assert.assertArrayEquals(intArrayOf(1, 3, 2), result.toIntArray())
    }
}