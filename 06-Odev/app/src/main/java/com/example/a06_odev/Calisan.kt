package com.example.a06_odev

class Calisan(val isim: String, private val maas: Double, val departman: String, val yas: Int) {

    fun getMaas(): Double {
        return this.maas
    }

    fun maasGoster() {
        println(this.maas)
    }
}