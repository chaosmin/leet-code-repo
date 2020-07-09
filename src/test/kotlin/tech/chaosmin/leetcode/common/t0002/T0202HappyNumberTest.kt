package tech.chaosmin.leetcode.common.t0002

import org.junit.Assert
import org.junit.jupiter.api.Test

/**
 * 示例：
 * 输入：19
 * 输出：true
 * 解释：
 * 1^2 + 9^2 = 82
 * 8^2 + 2^2 = 68
 * 6^2 + 8^2 = 100
 * 1^2 + 0^2 + 0^2 = 1
 *
 * @author romani min
 * @since 2020/4/30
 */
internal class T0202HappyNumberTest {

    @Test
    fun isHappy() {
        val testCase = 19
        val result = T0202HappyNumber.isHappy(testCase)
        Assert.assertEquals(true, result)
    }
}