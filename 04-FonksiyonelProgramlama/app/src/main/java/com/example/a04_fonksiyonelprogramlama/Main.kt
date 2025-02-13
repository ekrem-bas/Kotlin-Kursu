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

}

fun yazdigimiYazdir(string: String) {
    println(string)
}