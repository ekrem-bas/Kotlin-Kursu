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

    // Siniflarda Map ve Filter kullanimi
    val sanatcilar = arrayListOf<Sanatci>(
        Sanatci("sanatci_1", 35, "gitar"),
        Sanatci("sanatci_2", 32, "bateri"),
        Sanatci("sanatci_3", 24, "piyano")
    )

    // 30 yasindan buyuk sanatcilarin enstrumanlari
    val otuzdanBuyukSanatcilarinEnsturmanlari =
        sanatcilar.filter { it.yas > 30 }.map { it.ensturman }

    // 33 yasindan kucuk sanatcilarin isimleri
    val otuzUcYasindanKucukSanatcilar =
        sanatcilar.filter { it.yas < 33 }.map { it.isim }

    // Scope Fonksiyonlari
    println("------Scope Functions--------")

    // let
    var benimInteger: Int? = null

    // eger benimInteger null degilse onu yazdir 'let' (ya da baska bir sey yap vs)
    benimInteger?.let {
        println(it)
    }

    // eger benimInteger null degilse onun degerine 1 ekle ve yeniIntegerin degerine ata
    // eger benimInteger null ise yeniInteger degerini 0 yap (elvis operator)
    val yeniInteger = benimInteger?.let { it + 1 } ?: 0
    println(yeniInteger)

    // also
    // once 30 yasindan buyuk sanatcilari al 'sonra' onların isimlerini yazdir (bir seyi yap ustune sunu da yap)
    sanatcilar.filter { it.yas > 30 }.also { it.forEach { println(it.isim) } }
}

fun yazdigimiYazdir(string: String) {
    println(string)
}