package tech.chaosmin.leetcode.common.t0003

import org.junit.jupiter.api.Test
import tech.chaosmin.leetcode.base.TreeNode

/**
 *
 *
 * @author romani min
 * @since 2020/8/5
 */
internal class T0337HouseRobberIIITest {

    @Test
    fun rob() {
        val testCase = TreeNode(3).apply {
            this.left = TreeNode(2).apply {
                this.right = TreeNode(3)
            }
            this.right = TreeNode(3).apply {
                this.right = TreeNode(1)
            }
        }
        val result1 = T0337HouseRobberIII.rob(testCase)
        org.junit.Assert.assertEquals(7, result1)

        val testCase2 = TreeNode(3).apply {
            this.left = TreeNode(4).apply {
                this.left = TreeNode(1)
                this.right = TreeNode(3)
            }
            this.right = TreeNode(5).apply {
                this.right = TreeNode(1)
            }
        }
        val result2 = T0337HouseRobberIII.rob(testCase2)
        org.junit.Assert.assertEquals(9, result2)
    }
}