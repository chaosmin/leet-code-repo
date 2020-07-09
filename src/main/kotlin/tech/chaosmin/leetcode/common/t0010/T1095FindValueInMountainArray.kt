package tech.chaosmin.leetcode.common.t0010

import tech.chaosmin.leetcode.base.MountainArray

/**
 * 1095. 山脉数组中查找目标值 | 难度：困难
 *
 * 给你一个 山脉数组 mountainArr，请你返回能够使得 mountainArr.get(index) 等于 target 最小 的下标 index 值。
 * 如果不存在这样的下标 index，就请返回 -1。
 *
 * 何为山脉数组？如果数组 A 是一个山脉数组的话，那它满足如下条件：
 * 首先，A.length >= 3
 * 其次，在 0 < i < A.length - 1 条件下，存在 i 使得：
 *
 * A[[0]] < A[[1]] < ... A[[i-1]] < A[[i]]
 *
 * A[[i]] > A[[i+1]] > ... > A[[A.length - 1]]
 *
 * 你将 不能直接访问该山脉数组，必须通过 MountainArray 接口来获取数据：
 * MountainArray.get(k) - 会返回数组中索引为k 的元素（下标从 0 开始）
 * MountainArray.length() - 会返回该数组的长度
 * 注意：
 * 对 MountainArray.get 发起超过 100 次调用的提交将被视为错误答案。此外，任何试图规避判题系统的解决方案都将会导致比赛资格被取消。
 * 为了帮助大家更好地理解交互式问题，我们准备了一个样例 “答案”：https://leetcode-cn.com/playground/RKhe3ave，请注意这 不是一个正确答案。
 *
 * ************************************
 *
 * 执行用时 :212 ms, 在所有 Kotlin 提交中击败了100.00%的用户
 * 内存消耗 :33.5 MB, 在所有 Kotlin 提交中击败了100.00%的用户
 *
 * @author romani min
 * @since 2020/4/29
 */
object T1095FindValueInMountainArray {
    private fun binarySearch(target: Int, mountainArr: MountainArray, left: Int, right: Int, side: Int): Int {
        var l = left
        var r = right
        while (l <= r) {
            val mid = (l + r) / 2
            val current = mountainArr.get(mid)
            when {
                current == target -> return mid
                (current * side) < (target * side) -> l = mid + 1
                else -> r = mid - 1
            }
        }
        return -1
    }

    fun findInMountainArray(target: Int, mountainArr: MountainArray): Int {
        var l = 0
        var r = mountainArr.length() - 1
        while (l < r) {
            val mid = (l + r) / 2
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) l = mid + 1
            else r = mid
        }
        val left = binarySearch(
            target,
            mountainArr,
            0,
            l,
            1
        )
        return if (left != -1) left
        else binarySearch(
            target,
            mountainArr,
            l + 1,
            mountainArr.length() - 1,
            -1
        )
    }
}