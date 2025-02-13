package com.example.a03_siniflarveoop

fun main() {
    val sanatci1 = Sanatci("sanatci_1", 25, "gitar")
    println(sanatci1.isim)
    sanatci1.isim = "SANATCI_1"
    println(sanatci1.isim)
    sanatci1.sarkiSoyle()

    // inheritance
    val kahraman = Kahraman("kahraman_1", "gorunmezlik")
    kahraman.kos()

    val muhKahraman = MuhtesemKahraman("muhKahraman_1", "ucmak")
    muhKahraman.kos()
    muhKahraman.muhtesemFonksiyon()

    // polymorphism
    // statik polymorphism
    val islemler = Islemler()
    println(islemler.cikarma(12, 5))
    println(islemler.cikarma(12, 5, 3))
    println(islemler.cikarma(24, 3, 5, 8))
    println(islemler.cikarma(12.3, 4.9))

    // dinamik polymorphism
    val kedi = Hayvan()
    val kopek = Kopek()
    val ornekDizi = arrayOf(kedi, kopek)
    ornekDizi.forEach {
        it.sesCikar()
    }

    // abstraction (Abstract Class, Interface)
    //val insan = Insan() // hata: Cannot create an instance of an abstract class
    // test fonksiyonu insan abstract sinifinda (Sanatci : Insan)
    //sanatci1.test()

}