package main

data class Money(private val currencyCode: String, private val amount: Int) {

    fun times(multiplier: Int): Money {
        return Money(currencyCode, amount * multiplier)
    }

}
fun main(args : Array<String>) {
    println("Hello world!")
}
