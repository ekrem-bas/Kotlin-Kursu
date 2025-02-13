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

    // NULLABLITIY
    val kullaniciGirdisi = "giris"
    // giris eger int olabiliyosa o deger olamiyorsa null
    val kullaniciGirisiInteger = kullaniciGirdisi.toIntOrNull()
    //println(kullaniciGirisiInteger * 2) // hata (eger null ise nasil 2 ile carpsin)

    if (kullaniciGirisiInteger != null) {
        println("kullanicinin girdigi sayinin iki kati: ${kullaniciGirisiInteger * 2}")
    } else {
        println("kullanici sayisal bir deger girmedi...")
    }

    var benimDouble: Double? // nullable double tanimi
    //var benimDouble: Double? = null // nullable degiskenler initialize da edilebilir

    val kullaniciGirdisiDouble = kullaniciGirdisi.toDoubleOrNull()

    // !!
    // ne olursa olsun bu islemi yap ben null olmadigini garanti ediyorum
    // uygulama cokebilir
    //kullaniciGirdisiDouble!!.div(2)

    // ?
    // eger bu deger null degilse bu islemi yap
    // her zaman kullanilamayabilir, kullanildiginda uygulama cokmez
    kullaniciGirdisiDouble?.div(2)

    if (kullaniciGirdisiDouble != null) {
        println(kullaniciGirdisiDouble / 2)
    }

    //elvis operatoru
    // eger ?: dan onceki degisken null degilse onu
    // null ise ?: dan sonraki degeri dondur
    println(kullaniciGirdisiDouble?.div(2) ?: 20)

    kullaniciGirdisiDouble?.let {
        // deger null degilse bu {...} ici calisir
        println(it * 2)
    }

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
