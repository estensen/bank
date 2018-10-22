package main

data class Kroner(private val amount: Int) {

    fun times(multiplier: Int): Kroner {
        return Kroner(amount * multiplier)
    }
}
