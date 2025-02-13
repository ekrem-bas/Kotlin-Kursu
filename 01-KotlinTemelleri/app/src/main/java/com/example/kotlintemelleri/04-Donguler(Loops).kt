package com.example.kotlintemelleri

fun main() {
    println("--------- While Döngüsü ---------")

    var j = 0
    println("döngü başladı")
    while (j <= 10) {
        println(j)
        j += 1
    }
    println("döngü bitti")


    println("--------- For Döngüsü ---------")

    val baskaDizi = arrayListOf(5, 10, 15, 20, 25, 30)
    println(baskaDizi[0] / 5 * 3)
    println(baskaDizi[1] / 5 * 3)

    println("döngü başladı")
    for (numara in baskaDizi) {
        println(numara / 5 * 3)
    }
    println("döngü bitti")

    // range
    for (num in 0..9) {
        println(num * 10)
    }


    val benimStringDizim = ArrayList<String>()
    benimStringDizim.add("Emre")
    benimStringDizim.add("Zeynep")
    benimStringDizim.add("Atlas")

    for (kelime in benimStringDizim) {
        println(kelime.uppercase())
    }

    benimStringDizim.forEach { kelime -> // it yerine kendi istedigin kelimeyi de yazabilirsin
        println(kelime.uppercase())
    }
}