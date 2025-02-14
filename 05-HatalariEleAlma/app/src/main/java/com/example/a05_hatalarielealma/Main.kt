package com.example.a05_hatalarielealma

fun main() {
    val ornekString = "35"

    // eger string icinde sayisal bir sey olmazsa hata firlatir uygulama coker
    val integerString = ornekString.toInt()

    val ornek1 = intOrNullFonksiyonu("35")
    val ornek2 = intOrNullFonksiyonu("deneme")
    println(ornek1)
    println(ornek2)
}

fun intOrNullFonksiyonu(str: String): Int? {
    try {
        val sayi = str.toInt()
        return sayi
    } catch (e: Exception) {
        e.printStackTrace()
    }
    return null
}