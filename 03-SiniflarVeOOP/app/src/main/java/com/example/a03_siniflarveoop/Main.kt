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
}