package main

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class KronerTest {

    @Test
    fun multiplyAmount() {
        val five = Kroner(5)
        assertEquals(Kroner(10), five.times(2))
        assertEquals(Kroner(15), five.times(3))
    }

    @Test
    fun equalityCheck() {
        assertTrue(Kroner(5) == Kroner(5))
        assertFalse(Kroner(5) == Kroner(6))
    }
}
