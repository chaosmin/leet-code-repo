package tech.chaosmin.leetcode

/**
 * 146. LRU Cache | Difficulty: medium
 *
 * Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and put.
 *
 * get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
 * put(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity, it should invalidate the least recently used item before inserting a new item.
 *
 * The cache is initialized with a positive capacity.
 *
 * Follow up:
 * Could you do both operations in O(1) time complexity?
 *
 * @author romani min
 * @since 2020/5/25
 */
object T0146LRUCache

class LRUCache(private val capacity: Int) {
    private val map = mutableMapOf<Int, Node>()
    private val head = Node()
    private val tail = Node()

    init {
        head.next = tail
        tail.prev = head
    }

    data class Node(var key: Int? = null, var value: Int? = null) {
        var prev: Node? = null
        var next: Node? = null
    }

    // private fun printNode(str: String) {
    // val stringJoiner = StringJoiner("-")
    //     var temp = head.next
    //     while (temp?.next != null) {
    //         stringJoiner.add(temp.value?.toString() ?: "")
    //         temp = temp.next!!
    //     }
    //     println("$str: $stringJoiner")
    // }

    fun get(key: Int): Int {
        val node = map[key]
        return if (node == null) -1
        else moveToHead(node).value ?: -1
    }

    fun put(key: Int, value: Int) {
        var node = map[key]
        if (node == null) {
            node = Node(key, value)
            map[key] = addToHead(node)
            if (map.size > this.capacity) {
                map.remove(removeTail()?.key)
            }
        } else {
            node.value = value
            moveToHead(node)
        }
    }

    private fun addToHead(node: Node): Node {
        node.prev = head
        node.next = head.next
        head.next?.prev = node
        head.next = node
        return node
    }

    private fun removeNode(node: Node): Node {
        node.prev?.next = node.next
        node.next?.prev = node.prev
        return node
    }

    private fun moveToHead(node: Node): Node {
        removeNode(node)
        addToHead(node)
        return node
    }

    private fun removeTail(): Node? {
        val node = tail.prev
        return if (node == null) null
        else removeNode(node)
    }
}