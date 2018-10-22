package main

data class Dollars(private val amount: Int) {

    fun times(multiplier: Int): Dollars {
        return Dollars(amount * multiplier)
    }
}