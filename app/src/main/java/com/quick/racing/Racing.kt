package com.quick.racing

import java.util.*

fun main() {
    val h1 = Horse(100)
    h1.start()
}

class Horse(val steps:Int) : Thread() {
    override fun run() {
        for (i in 1..steps) {
            println(" ".repeat(i) + "馬")
            val ms = 200 + Random().nextInt(100)
            sleep(ms.toLong())
        }
    }
}