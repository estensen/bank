package test

import junit.framework.TestCase.*
import main.Bank
import main.Expression
import main.Money
import main.Sum
import org.junit.Test

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
        assertFalse(Money("NOK", 5) == Money("USD", 5))
    }

    @Test
    fun isCurrency() {
        assertEquals("NOK", Money("NOK", 1).currency())
        assertEquals("USD", Money("USD", 1).currency())
    }

    @Test
    fun addition() {
        val sum = Sum(Money("NOK", 5), Money("NOK", 10))
        val bank = Bank()
        val reduced = bank.reduce("NOK", sum)
        assertEquals(Money("NOK", 15), reduced)
    }

    @Test
    fun reduce() {
        val bank = Bank()
        val result = bank.reduce("NOK", Money("NOK", 1))
        assertEquals(Money("NOK", 1), result)
    }
}
