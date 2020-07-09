package tech.chaosmin.leetcode.common.t0001

import org.junit.Assert
import org.junit.jupiter.api.Test

/**
 * @author romani min
 * @since 2020/5/25
 */
internal class T0146LRUCacheTest {

    @Test
    fun test() {
        val cache = LRUCache(2 /* 缓存容量 */)
        cache.put(1, 1)
        // cache.printNode("PUT(1, 1)")
        cache.put(2, 2)
        // cache.printNode("PUT(2, 2)")
        Assert.assertEquals(1, cache.get(1))
        // cache.printNode("GET(1   )")
        // 该操作会使得密钥 2 作废
        cache.put(3, 3)
        // cache.printNode("PUT(3, 3)")
        // 返回 -1 (未找到)
        Assert.assertEquals(-1, cache.get(2))
        // cache.printNode("GET(2   )")
        // 该操作会使得密钥 1 作废
        cache.put(4, 4)
        // cache.printNode("PUT(4, 4)")
        // 返回 -1 (未找到)
        Assert.assertEquals(-1, cache.get(1))
        // cache.printNode("GET(1   )")
        Assert.assertEquals(3, cache.get(3))
        // cache.printNode("GET(3   )")
        Assert.assertEquals(4, cache.get(4))
        // cache.printNode("GET(4   )")
    }
}