package com.example.a03_siniflarveoop

open class Kahraman(val isim: String, val ozelGuc: String) {
    // hem kahraman hem de bu siniftan turetilen nesneler kullanabilir
    fun kos() {
        println("su kahraman kostu: ${this.isim}")
    }
}