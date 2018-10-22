package main

class Kroner(var amount: Int) {

    fun times(multiplier: Int): Kroner {
        return Kroner(amount * multiplier)
    }
}