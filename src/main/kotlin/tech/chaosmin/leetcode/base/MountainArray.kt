package tech.chaosmin.leetcode.base

/**
 * This is MountainArray's API interface.
 *
 * @author romani min
 * @since 2020/4/29
 */
class MountainArray(private val array: IntArray) {

    fun get(index: Int): Int {
        return array[index]
    }

    fun length(): Int {
        return array.size
    }
}