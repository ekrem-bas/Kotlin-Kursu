package com.example.a03_siniflarveoop

class Kopek : Hayvan() {

    fun havla() {
        println("kopek havladi")
    }

    // function overriding
    override fun sesCikar() {
        println("kopek ses cikardi")
    }
}