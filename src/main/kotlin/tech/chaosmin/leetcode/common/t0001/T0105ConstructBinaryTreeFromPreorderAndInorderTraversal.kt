package tech.chaosmin.leetcode.common.t0001

import tech.chaosmin.leetcode.base.TreeNode

/**
 * 105. Construct Binary Tree from Preorder and Inorder Traversal | Difficulty: medium
 *
 * Given preorder and inorder traversal of a tree, construct the binary tree.
 *
 * Note:
 * You may assume that duplicates do not exist in the tree.
 *
 * ************************************
 *
 * 执行用时 :268 ms, 在所有 Kotlin 提交中击败了38.10%的用户
 * 内存消耗 :42.2 MB, 在所有 Kotlin 提交中击败了100.00%的用户
 *
 * @author romani min
 * @since 2020/5/22
 */
object T0105ConstructBinaryTreeFromPreorderAndInorderTraversal {
    fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
        return when {
            preorder.isEmpty() -> null
            preorder.size == 1 -> TreeNode(preorder[0])
            else -> {
                val root = preorder[0]
                val midIndex = inorder.indexOf(root)
                val leftI = inorder.copyOfRange(0, midIndex)
                val rightI = inorder.copyOfRange(midIndex + 1, inorder.size)

                val leftP = preorder.copyOfRange(1, leftI.size + 1)
                val rightP = preorder.copyOfRange(leftI.size + 1, preorder.size)
                TreeNode(root).apply {
                    this.left =
                        buildTree(
                            leftP,
                            leftI
                        )
                    this.right =
                        buildTree(
                            rightP,
                            rightI
                        )
                }
            }
        }
    }
}