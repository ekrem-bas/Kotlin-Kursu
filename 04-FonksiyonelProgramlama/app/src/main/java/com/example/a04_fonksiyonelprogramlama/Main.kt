package com.example.a04_fonksiyonelprogramlama

fun main() {

    println("-------Lambda-------")
    // normal fonksiyon cagirimi
    yazdigimiYazdir("Deneme")

    // yazdigimiYazdir fonksiyonunun Lambda kullanilmis hali
    val yazdigimiYazdirLambda = { verilenString: String -> println(verilenString) }
    yazdigimiYazdirLambda("Deneme Lambda")

    //val name = { parameters -> function body }
    val carpmaIslemi = { a: Int, b: Int -> a * b }
    val sonuc = carpmaIslemi(3, 4)
    println("carpma isleminin sonucu: $sonuc")

    //val name : (parameter types) -> return type = { parameters -> function body}
    val carpmaIkinciVersiyon: (Int, Int) -> Int = { a, b -> a * b }
    println(carpmaIkinciVersiyon(5, 4))

    println("------High Order Functions--------")

    // Filter
    val benimListem = arrayListOf(1, 3, 5, 7, 9, 11, 13, 15, 17, 19)

    // benimListemdeki 10dan kucuk sayilar
    val kucukSayilar = benimListem.filter { num -> num < 10 }

    // ayni islemin farkli gosterimi
    val kucukSayilarYeni = benimListem.filter { it < 10 }

    // Map
    val karesiAlinmisSayilar = benimListem.map { it * it } // { num -> num * num }

    // Map & Filter
    val mapFilterBirArada = benimListem.filter { it < 10 }.map { it * it }
}

fun yazdigimiYazdir(string: String) {
    println(string)
}