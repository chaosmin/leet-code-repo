package tech.chaosmin.leetcode.common

import tech.chaosmin.leetcode.base.TreeNode
import java.util.*

/**
 * 297. 二叉树的序列化与反序列化 | 难度：困难
 *
 * 序列化是将一个数据结构或者对象转换为连续的比特位的操作，进而可以将转换后的数据存储在一个文件或者内存中，同时也可以通过网络传输到另一个计算机环境，采取相反方式重构得到原数据。
 *
 * 请设计一个算法来实现二叉树的序列化与反序列化。这里不限定你的序列 / 反序列化算法执行逻辑，你只需要保证一个二叉树可以被序列化为一个字符串并且将这个字符串反序列化为原始的树结构。
 *
 * ************************************
 *
 * 执行用时 :344 ms, 在所有 Kotlin 提交中击败了60.00%的用户
 * 内存消耗 :37.8 MB, 在所有 Kotlin 提交中击败了100.00%的用户
 *
 * @author romani min
 * @since 2020/6/16
 */
object T0297SerializeAndDeserializeBinaryTree {
    // Encodes a URL to a shortened URL.
    fun serialize(root: TreeNode?): String {
        return serialize(
            root,
            StringJoiner(",")
        ).toString()
    }

    // Decodes your encoded data to tree.
    fun deserialize(data: String): TreeNode? {
        return if (data.isEmpty()) {
            null
        } else {
            val list = data.split(",").toMutableList()
            deserialize(list)
        }
    }

    private fun serialize(root: TreeNode?, str: StringJoiner): StringJoiner {
        if (root == null) {
            str.add("null")
        } else {
            str.add(root.`val`.toString())
            serialize(
                root.left,
                str
            )
            serialize(
                root.right,
                str
            )
        }
        return str
    }

    private fun deserialize(list: MutableList<String>): TreeNode? {
        val first = list.removeAt(0)
        if (first == "null") {
            return null
        }
        return TreeNode(first.toInt()).apply {
            left =
                deserialize(list)
            right =
                deserialize(list)
        }
    }
}