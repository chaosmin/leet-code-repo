package tech.chaosmin.leetcode.common.t0001

import org.junit.Assert
import org.junit.jupiter.api.Test
import tech.chaosmin.leetcode.base.TreeNode

internal class T0145BinaryTreePostorderTraversalTest {

    @Test
    fun postorderTraversal() {
        val testCase = TreeNode(1).apply {
            this.right = TreeNode(2).apply {
                this.left = TreeNode(3)
            }
        }
        val result = T0145BinaryTreePostorderTraversal.postorderTraversal(testCase)
        Assert.assertArrayEquals(intArrayOf(3, 2, 1), result.toIntArray())
    }
}