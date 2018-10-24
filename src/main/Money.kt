package main

data class Money(val currencyCode: String, val amount: Int) : Expression {

    fun times(multiplier: Int): Money {
        return Money(currencyCode, amount * multiplier)
    }

    fun plus(added: Money): Expression {
        return Sum(this, added)
    }

    override fun reduce(to: String): Money {
        return this
    }

    fun currency(): String {
        return currencyCode
    }
}
fun main(args : Array<String>) {
    println("Hello world!")
}
