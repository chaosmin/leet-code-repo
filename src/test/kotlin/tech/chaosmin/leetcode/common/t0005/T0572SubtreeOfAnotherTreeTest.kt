package tech.chaosmin.leetcode.common.t0005

import org.junit.Assert
import org.junit.jupiter.api.Test
import tech.chaosmin.leetcode.base.TreeNode

/**
 * @author romani min
 * @since 2020/5/7
 */
internal class T0572SubtreeOfAnotherTreeTest {

    @Test
    fun isSubtree() {
        val testCase1s = TreeNode(3).apply {
            this.left = TreeNode(4).apply {
                this.left = TreeNode(1)
                this.right = TreeNode(2)
            }
            this.right = TreeNode(5)
        }
        val testCase1t = TreeNode(4).apply {
            this.left = TreeNode(1)
            this.right = TreeNode(2)
        }
        val result1 = T0572SubtreeOfAnotherTree.isSubtree(testCase1s, testCase1t)
        Assert.assertEquals(true, result1)

        val testCase2s = TreeNode(3).apply {
            this.left = TreeNode(4).apply {
                this.left = TreeNode(1)
                this.right = TreeNode(2).apply {
                    this.left = TreeNode(0)
                }
            }
            this.right = TreeNode(5)
        }
        val result2 = T0572SubtreeOfAnotherTree.isSubtree(testCase2s, testCase1t)
        Assert.assertEquals(false, result2)

        //

        val additionTestCaseS = TreeNode(12)
        val additionTestCaseT = TreeNode(2)
        val result = T0572SubtreeOfAnotherTree.isSubtree(additionTestCaseS, additionTestCaseT)
        Assert.assertEquals(false, result)
    }
}