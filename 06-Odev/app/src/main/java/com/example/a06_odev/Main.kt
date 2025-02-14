package com.example.a06_odev

fun main() {
    /*
        1) Calisanlar icin Calisan sinifi oluşturulacak
        2) Çalışanların isim, maaş, departman, yaş bilgilerini tutacağız
        3) Örnek 10 tane çalışan oluşturup, bir listede bu çalışanlar toplanacak (Main içinde yapabilirsiniz) (yazılım, finans, satış)
        4) İsim bilgileri sadece okunabilir olacak. calisan.isim = "sdfld" değişiklik yapılamayacak
        5) Maaş bilgileri okunabilir de olmayacak, yazılabilir de olmayacak. Sadece maasGoster denilen bir fonksiyonla okunabilecek.
           Bu fonksiyon içerisine aldığı objenin maaşını gösterecek.
        6) Main içerisinde -> yaşı 30'dan büyük olan ve departmanı yazılım olan kişilerin maaşlarını tutan bir liste yapınız. (maasGoster fonksiyonuyla yazdırsanız da olur)
        7) Main içerisinde -> yaşı 25'den küçük olan kişilerin sadece isimlerini tutan bir liste yapmanız yeterli olur.
     */

    val calisanlar = arrayListOf<Calisan>(
        Calisan("cailsan_1", 13500.0, "yazilim", 43),
        Calisan("cailsan_2", 3500.0, "finans", 35),
        Calisan("cailsan_3", 5500.0, "satis", 41),
        Calisan("cailsan_4", 14500.0, "yazilim", 38),
        Calisan("cailsan_5", 5500.0, "finans", 27),
        Calisan("cailsan_6", 1500.0, "satis", 28),
        Calisan("cailsan_7", 2500.0, "satis", 26),
        Calisan("cailsan_8", 6500.0, "finans", 30),
        Calisan("cailsan_9", 9500.0, "yazilim", 24),
        Calisan("cailsan_10", 6500.0, "yazilim", 21)
    )


    // 6. adimin cevabi
    val yazilimcilarinMaaslari =
        calisanlar.filter { it.yas > 30 && it.departman == "yazilim" }.map { it.getMaas() }

    for (maas in yazilimcilarinMaaslari) println(maas)

    // 7. adimin cevabi
    val gencCalisanlar = calisanlar.filter { it.yas < 25 }.map { it.isim }
    for (isim in gencCalisanlar) println(isim)
}