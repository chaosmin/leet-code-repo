package tech.chaosmin.leetcode.common.t0001

import org.junit.Assert
import org.junit.jupiter.api.Test
import tech.chaosmin.leetcode.base.TreeNode

/**
 * @author romani min
 * @since 2020/7/28
 */
internal class T0104MaximumDepthOfBinaryTreeTest {

    @Test
    fun maxDepth() {
        println("TEST CASE: ...")
        val testCase = TreeNode(3).apply {
            this.left = TreeNode(9)
            this.right = TreeNode(20).apply {
                this.left = TreeNode(15)
                this.right = TreeNode(7)
            }
        }
        val result = T0104MaximumDepthOfBinaryTree.maxDepth(testCase)
        Assert.assertEquals(3, result)

        println("TEST CASE: ...")
        val testCase2 = TreeNode(0)
        val result2 = T0104MaximumDepthOfBinaryTree.maxDepth(testCase2)
        Assert.assertEquals(1, result2)

        println("TEST CASE: ...")
        val testCase3 = TreeNode(1).apply {
            this.left = TreeNode(2).apply {
                this.left = TreeNode(4)
                this.right = TreeNode(5)
            }
            this.right = TreeNode(3)
        }
        val result3 = T0104MaximumDepthOfBinaryTree.maxDepth(testCase3)
        Assert.assertEquals(3, result3)

        println("TEST CASE: ...")
        val testCase4 = TreeNode(1).apply {
            this.left = TreeNode(2).apply {
                this.left = TreeNode(4)
            }
            this.right = TreeNode(3).apply {
                this.right = TreeNode(5)
            }
        }
        val result4 = T0104MaximumDepthOfBinaryTree.maxDepth(testCase4)
        Assert.assertEquals(3, result4)
    }
}