package com.example.kotlintemelleri

fun main() {
    println("------- If Kontrolleri ----------")

    println(3 > 5)

    var sayi = 10
    sayi = sayi + 1
    println(sayi)
    sayi++
    println(sayi)
    sayi--
    println(sayi)

    //kalanını bulma - remainder
    println(10 % 4)

    val skor = 60

    if (skor < 10) {
        println("oyunu kaybettiniz")
    } else if (skor >= 10 && skor < 20) {
        println("oyunda idare eder bir skor aldınız")
    } else if (skor >= 20 && skor < 30) {
        println("güzel bir skor elde ettiniz")
    } else {
        println("çok güzel bir skor elde ettiniz")
    }

    println("---------When---------")
    // diger dillerdeki switch-case yapisina benziyor

    val notRakam = 6
    var notString = ""

    when (notRakam) {
        0 -> notString = "Geçersiz not"
        1 -> notString = "Zayıf"
        2 -> notString = "Kötü"
        3 -> notString = "Orta"
        4 -> notString = "İyi"
        5 -> notString = "Pek iyi"
        else -> notString = "Böyle bir not bilmiyoruz"
    }
    println(notString)

    notString = when (notRakam) {
        0 -> "Geçersiz not"
        1 -> "Zayıf"
        2 -> "Kötü"
        3 -> "Orta"
        4 -> "İyi"
        5 -> "Pek iyi"
        else -> "Böyle bir not bilmiyoruz"
    }

    println(notString)
}