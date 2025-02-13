package com.example.kotlintemelleri

fun main() {
    println("Hello World")

    // Integer - Tam Sayi
    println("---------Integer--------")
    var x = 10
    println(x)
    println(x * 20)

    x = 30
    println(x * 20)

    var y = 5 // val olarak tanimlanabilir (sonradan degistirilmedi cunku)
    println(y)
    println(x + y)

    // implicit - kapali sekilde tanimlama (tipini tanimlamiyoruz)
    val z = 20 // const
    println(z * 50)

    val ornek: Long = 10
    println(ornek * 10)

    // explicit - acik sekilde tanimlama (tipini tanimliyoruz (Byte, Short, Int, Double))
    val ornekShort: Short = 20
    val ornekByte: Byte = 15
    val ornekInt: Int = 30
    println(ornekByte * ornekShort)

    val kullaniciyasi = 35 // tavsiye edilmez
    val kullanici_yasi = 35 // snake_case
    val kullaniciYasi = 35 // camelCase

    val m = 10
    val n = 20
    val sonuc = m + n
    println(sonuc)

    // Double - Float - Kesirli sayilar
    println("-------Double&Float-------")

    val pi = 3.14
    println(pi * 2)

    println(5 / 2)
    println(5.0 / 2.0)
    val ornekDouble = 3.0

    val sonucDouble = pi * ornekDouble
    println(sonucDouble)

    val ornekFloat: Float = 2.25f // Kotlin'de sonuna 'f' konulmasi gerekiyor
    println(ornekFloat * 2)

    // Unsigned Integer
    val unsignedByte: UByte = 10u
    val unsignedShort: UShort = 10u
    val unsignedInteger: UInt = 10u
    val unsignedLong: ULong = 10u

    // String -> metinler
    println("----------String--------")

    val benimString = "Benim String'im"
    println(benimString)

    val ornekString: String = "ornek"

    val isim = "ekrem"
    println(isim.uppercase())

    val soyisim = "bas"
    println(isim + " " + soyisim)

    val yas = "25"
    val ornekDeger = "20"
    println(yas + ornekDeger)

    val benimStr: String
    //benimStr.uppercase() // initialize edilmeden uppercase calistiramazsin
    benimStr = "benim stringim" //initialize, init, initialization

    // Conversion
    val yasInt = yas.toInt()
    val xLong = x.toLong()
    println(xLong)

    println(yasInt * 20)

    // Boolean
    println("------Boolean-------")

    var benimBool: Boolean = true
    benimBool = false

    println(3 > 5)
    println(3 < 5)
    println(4 == 4)

    val kullaniciYas = "35"
    println(kullaniciYas.toInt() > 18)
    /*
     <     kucuktur
     >     buyuktur
     <=    kucuk esit
     >=    buyuk esit
     ==    esittir
     !=    esit degildir
     &&    ve
     ||    veya
    */
    println("ekrem" == "ekrem")
    println(10 != 10)

    println(4 > 3 && 3 > 5)
    println(4 > 3 || 3 > 5)
}