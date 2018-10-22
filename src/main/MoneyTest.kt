package main

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MoneyTest {

    @Test
    fun multiplyAmount() {
        val fiveNOK = Money("NOK", 5)
        assertEquals(Money("NOK", 10), fiveNOK.times(2))
        assertEquals(Money("NOK", 15), fiveNOK.times(3))

        val fiveUSD = Money("USD", 5)
        assertEquals(Money("USD", 10), fiveUSD.times(2))
        assertEquals(Money("USD", 15), fiveUSD.times(3))
    }

    @Test
    fun equalityCheck() {
        assertTrue(Money("NOK", 5) == Money("NOK", 5))
        assertFalse(Money("NOK", 5) == Money("NOK", 6))

        assertTrue(Money("USD", 5) == Money("USD", 5))
        assertFalse(Money("USD", 5) == Money("USD", 6))
    }
}