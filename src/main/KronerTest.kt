package main

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class KronerTest {

    @Test
    fun testMultiplication() {
        val five = Kroner(5)
        var product: Kroner = five.times(2)
        assertEquals(10, product.amount)

        product = five.times(3)
        assertEquals(15, product.amount)
    }
}