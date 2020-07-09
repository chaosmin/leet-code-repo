package tech.chaosmin.leetcode.common

import org.junit.Assert
import org.junit.jupiter.api.Test
import tech.chaosmin.leetcode.common.T0009PalindromeNumber

/**
 * @author romani min
 * @since 2020/6/10
 */
internal class T0009PalindromeNumberTest {

    @Test
    fun isPalindrome() {
        val result1 = T0009PalindromeNumber.isPalindrome(121)
        Assert.assertTrue(result1)

        val result2 = T0009PalindromeNumber.isPalindrome(-121)
        Assert.assertFalse(result2)

        val result3 = T0009PalindromeNumber.isPalindrome(10)
        Assert.assertFalse(result3)
    }
}