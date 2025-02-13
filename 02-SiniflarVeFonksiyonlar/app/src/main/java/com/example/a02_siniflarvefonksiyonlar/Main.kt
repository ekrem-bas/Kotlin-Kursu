package com.example.a02_siniflarvefonksiyonlar

var x = 0

fun main() {
    birinciFonksiyon()
    cikarma(15, 5)
    cikarma(25, 45)
    println("5 + 15 = ${toplama(5, 15)}")
    println("-48 + 35 = ${toplama(-48, 35)}")
    println("x degeri: ${x}")

    val insan1 = Insan("isim", 34, "meslek")
    println(insan1.isim)
    println(insan1.yas)


}

fun birinciFonksiyon() {
    println("Birinci fonksiyon calistirildi...")
    x += 10
}

fun ikinciFonskiyon() {
    println("ikinci fonksiyon calistirildi...")
    x += 20
}

// parametreli fonksiyonlar
fun cikarma(num1: Int, num2: Int) {
    println("Cikarma sonucu: ${num1 - num2}")
}

// return fonksiyonlar
fun toplama(num1: Int, num2: Int): Int {
    return num1 + num2
}
