package com.example.a03_siniflarveoop

// var isim: objenin var degiskeni sonradan degistirilebilir (Sanatci.isim = "...")
// val yas: obje olusuturulurken constructor icine deger girilir ama sonra degistirilemez
class Sanatci(var isim: String, val yas: Int, var enstruman: String) {

    var sacRengi = "" // her yerden erisilip degistirilebilir
    private var tur = "insan" // disaridan erisilemez ve degistirilemez

    // encapsulation farkli bir gosterim
//    var gozRengi = ""
//        private set // obje uzerinden degistirilemez
//        public get // obje uzerinden degeri okunabilir
    private var gozRengi = ""

    // java tarzi getter ve setter
    fun setGozRengi(yeniGozRengi: String) {
        this.gozRengi = yeniGozRengi
    }

    fun getGozRengi() {
        println(this.gozRengi)
        // return this.gozRengi (fun getGozRengi() : String {...})
    }

    fun turuYazdir() { // public getter
        println(this.tur)
    }

    fun sarkiSoyle() {
        println("su sanatci sarki soyledi: ${this.isim}.")
    }

    // init fonksiyonu cok kullanilan bir sey degil
    // siniftan nesne turetildigi gibi calisir
    init {
        println("init cagirildi")
    }
}