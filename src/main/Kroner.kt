package main

class Kroner(var amount: Int) {

    fun times(multiplier: Int) {
        amount *= multiplier
    }
}