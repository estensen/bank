package main

class Bank {
    fun reduce(to: String, source: Expression): Money {
        return source.reduce(to)
    }
}
