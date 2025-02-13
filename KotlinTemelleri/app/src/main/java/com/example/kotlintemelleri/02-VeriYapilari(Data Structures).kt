package com.example.kotlintemelleri

fun main() {
    println("----------Veri Yapilari----------")

    // Diziler - Arrays
    println("-------Array-------")

    val stringOrnegi = "ekrem"

    val benimDizim = arrayOf(stringOrnegi, "emre", "zeynep", "fatih", "osman")

    println(benimDizim[0])
    println(benimDizim[1])
    println(benimDizim.last())

    benimDizim[1] = "sam"

    println(benimDizim[1])
    println(benimDizim.get(3)) // benimDizim[3]

    //benimDizim[5] = "yeni eleman" // yeni eleman ekleyemezsin index out of bounds
    //println(benimDizim[5]) // index out b-of bounds

    val numaraDizisi = arrayOf(1, 10, 20, 15, 2, 4)
    println(numaraDizisi[3] * 10)

    val karisikDizi = arrayOf(10, 3.14, 20, "sam", false, true)
    println(karisikDizi[2])

    println("-------ArrayList-------")

    val isimListesi = arrayListOf("ekrem", "emre", "zeynep")

    println(isimListesi[0])
    println(isimListesi[1])
    println(isimListesi[2])

    println(isimListesi.size)
    isimListesi.add("mahmut")
    println(isimListesi.get(3))
    isimListesi[3] = "mehmet"
    println(isimListesi.get(3))

    //isimListesi.removeAt(3) // verilen indexteki değeri sil

    val numaraListesi = arrayListOf<Int>() // integer tipinde array list
    val digerOrnekListe = ArrayList<Int>() // integer tipinde array list

    numaraListesi.add(10)
    numaraListesi.add(20)
    numaraListesi.add(30)

    digerOrnekListe.add(40)
    digerOrnekListe.add(50)
    digerOrnekListe.add(60)

    println(numaraListesi[1] * digerOrnekListe[2])

    val karisikListe = arrayListOf(10, 3.14, "emre", true)
    val karisikBosListe = arrayListOf<Any>()
    karisikBosListe.add(10)
    karisikBosListe.add("kerem")
    karisikBosListe.add(false)

    println(karisikBosListe.get(0))

    println("----------Set----------")
    // unique eleman barindirirlar (ayni veriden birden fazla olmaz)
    // index mantigina sahip degillerdir

    val ornekDizi = arrayOf(10, 10, 10, 10, 20, 30, 40)

    println(ornekDizi[0])
    println(ornekDizi[1])

    val ornekSet = setOf(10, 10, 10, 10, 20, 30, 40)
    println(ornekSet.size) // 4 (10, 20, 30, 40)

    //ornekSet[0] // yanlis
    //ornekSet.get(0) // yanlis (get fonksiyonu setOf yok)
    //ornekSet.add() // yanlis (add fonksiyonu setOf yok)

    ornekSet.forEach {
        println(it) // it: iterator forEach kendiliginden tanimli
    }

    val bosSetOrnegi = HashSet<String>()

    bosSetOrnegi.add("Sam")
    bosSetOrnegi.add("Sam")
    bosSetOrnegi.add("Sam")
    bosSetOrnegi.add("Sam")
    bosSetOrnegi.add("Julie")

    bosSetOrnegi.forEach {
        println(it)
    }

    // duplicate olan diziyi duplicate olmayan hashSet haline getir
    val ornekTekilSet = ornekDizi.toHashSet()
    ornekTekilSet.forEach {
        println(it)
    }

    println("----------Map---------")

    // Anahtar - Değer Eşleşmesi

    val yemekDizisi = arrayListOf("Elma", "Armut", "Karpuz")
    val kaloriDizisi = arrayListOf(100, 150, 200)

    println("${yemekDizisi[1]}'nın kalorisi ${kaloriDizisi[1]}")

    val yemekKaloriMapi = hashMapOf<String, Int>() // str, int hashMap
    yemekKaloriMapi.put("Elma", 100)
    yemekKaloriMapi.put("Armut", 150)
    yemekKaloriMapi.put("Karpuz", 200)
    yemekKaloriMapi.put("Kayisi", 500)

    yemekKaloriMapi.remove("Kayisi")
    println(yemekKaloriMapi.get("Kayisi")) // null

    println(yemekKaloriMapi["Elma"])
    println(yemekKaloriMapi.get("Armut"))

    yemekKaloriMapi.put("Elma", 300) // 100 olan degeri 300 yapar
    println(yemekKaloriMapi.get("Elma"))

    yemekKaloriMapi.replace("Elma", 300) // 100 olan degeri 300 yapar

    val ornekHashMap = HashMap<String, String>() // str, str hashMap
    ornekHashMap.put("ekrem", "emre")
    ornekHashMap.put("abc", "def")
}