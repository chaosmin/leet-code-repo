package tech.chaosmin.leetcode

import org.junit.Assert
import org.junit.jupiter.api.Test
import tech.chaosmin.leetcode.base.TreeNode

/**
 * @author romani min
 * @since 2020/6/16
 */
internal class T0297SerializeAndDeserializeBinaryTreeTest {

    @Test
    fun serialize() {
        val testCase = TreeNode(1).apply {
            this.left = TreeNode(2).apply {
                this.left = TreeNode(3)
                this.right = TreeNode(4)
            }
            this.right = TreeNode(5)
        }
        val serialize = T0297SerializeAndDeserializeBinaryTree.serialize(testCase)
        Assert.assertEquals("1,2,3,null,null,4,null,null,5,null,null", serialize)
    }

    @Test
    fun deserialize() {
        val deserialize = T0297SerializeAndDeserializeBinaryTree.deserialize("1,2,3,null,null,4,null,null,5,null,null")
        Assert.assertEquals(1, deserialize?.`val`)
        Assert.assertEquals(2, deserialize?.left?.`val`)
        Assert.assertEquals(5, deserialize?.right?.`val`)
        Assert.assertEquals(3, deserialize?.left?.left?.`val`)
        Assert.assertEquals(4, deserialize?.left?.right?.`val`)
    }
}