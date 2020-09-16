package tech.chaosmin.leetcode.common.t0002

import org.junit.Assert
import org.junit.jupiter.api.Test
import tech.chaosmin.leetcode.base.TreeNode

internal class T0226InvertBinaryTreeTest {

    @Test
    fun invertTree() {
        val testCase = TreeNode(4).apply {
            this.left = TreeNode(2).apply {
                this.left = TreeNode(1)
                this.right = TreeNode(3)
            }
            this.right = TreeNode(7).apply {
                this.left = TreeNode(6)
                this.right = TreeNode(9)
            }
        }
        val result = T0226InvertBinaryTree.invertTree(testCase)
        Assert.assertEquals(4, result?.`val`)
        Assert.assertEquals(7, result?.left?.`val`)
        Assert.assertEquals(2, result?.right?.`val`)
        Assert.assertEquals(9, result?.left?.left?.`val`)
        Assert.assertEquals(6, result?.left?.right?.`val`)
        Assert.assertEquals(3, result?.right?.left?.`val`)
        Assert.assertEquals(1, result?.right?.right?.`val`)
    }
}