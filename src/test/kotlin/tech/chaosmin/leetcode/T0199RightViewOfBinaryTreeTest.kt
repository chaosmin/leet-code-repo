package tech.chaosmin.leetcode

import org.junit.Assert
import org.junit.jupiter.api.Test
import tech.chaosmin.leetcode.base.TreeNode

/**
 * 示例:
 * 输入: [1,2,3,null,5,null,4]
 * 输出: [1, 3, 4]
 *
 * @author romani min
 * @since 2020/4/22
 */
internal class T0199RightViewOfBinaryTreeTest {

    @Test
    fun rightSideView() {
        val testCase = TreeNode(1).apply {
            this.left = TreeNode(2).apply {
                this.right = TreeNode(5)
            }
            this.right = TreeNode(3).apply {
                this.right = TreeNode(4)
            }
        }
        val result = T0199RightViewOfBinaryTree.rightSideView(testCase)
        Assert.assertArrayEquals(intArrayOf(1, 3, 4), result.toIntArray())

        val testCase2 = TreeNode(1).apply {
            this.left = TreeNode(2).apply {
                this.right = TreeNode(4)
            }
            this.right = TreeNode(3)
        }
        val result2 = T0199RightViewOfBinaryTree.rightSideView(testCase2)
        Assert.assertArrayEquals(intArrayOf(1, 3, 4), result2.toIntArray())
    }
}