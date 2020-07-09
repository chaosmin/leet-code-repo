package tech.chaosmin.leetcode.common

import org.junit.Assert
import org.junit.jupiter.api.Test
import tech.chaosmin.leetcode.base.TreeNode

/**
 * 二叉树：[3,9,20,null,null,15,7],
 * 返回：[[3],[9,20],[15,7]]
 *
 * @author romani min
 * @since 2020/5/13
 */
internal class T0102BinaryTreeLevelOrderTraversalTest {

    @Test
    fun levelOrder() {
        val testCase = TreeNode(3).apply {
            this.left = TreeNode(9)
            this.right = TreeNode(20).apply {
                this.left = TreeNode(15)
                this.right = TreeNode(7)
            }
        }
        val result = T0102BinaryTreeLevelOrderTraversal.levelOrder(testCase)
        Assert.assertEquals(3, result[0][0])
        Assert.assertEquals(9, result[1][0])
        Assert.assertEquals(20, result[1][1])
        Assert.assertEquals(15, result[2][0])
        Assert.assertEquals(7, result[2][1])
    }
}