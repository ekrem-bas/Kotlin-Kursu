package com.example.a03_siniflarveoop

fun main() {
    var sanatci1 = Sanatci("sanatci_1", 25, "gitar")
    println(sanatci1.isim)
    sanatci1.isim = "SANATCI_1"
    println(sanatci1.isim)
    sanatci1.sarkiSoyle()
}