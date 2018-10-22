package main

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class DollarsTest {

    @Test
    fun multiplyAmount() {
        val five = Dollars(5)
        assertEquals(Dollars(10), five.times(2))
        assertEquals(Dollars(15), five.times(3))
    }

    @Test
    fun equalityCheck() {
        assertTrue(Dollars(5) == Dollars(5))
        assertFalse(Dollars(5) == Dollars(6))
    }
}