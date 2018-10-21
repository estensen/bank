package main

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class KronerTest {

    @Test
    fun testMultiplication() {
        val five = Kroner(5)
        val ten = five.times(2)
        assertEquals(10, five.amount)
    }
}