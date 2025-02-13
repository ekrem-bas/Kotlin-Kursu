package com.example.a03_siniflarveoop

class Islemler {
    fun cikarma(x: Int, y: Int): Int {
        return x - y
    }

    // ayni isimde fonksiyon ama parametreler ve return type'lari farkli
    fun cikarma(x: Int, y: Int, z: Int, n: Int): Int {
        return x - (y + z + n)
    }

    // ayni fonksiyon ismi ama farkli parametre sayisi
    fun cikarma(x: Int, y: Int, z: Int): Int {
        return x - (y * z)
    }

    // function overloading
    // isim ayni parametre ve return type farkli
    fun cikarma(x: Double, y: Double): Double {
        return x - y
    }
}