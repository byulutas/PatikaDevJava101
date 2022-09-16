public class Ders {
    String adı,derskodu,turu;
    int not,sozluNotu;
    Ogretmen ogretmen;

    Ders(String ad, String kodu, String turu) {
        this.adı = ad;
        this.derskodu= kodu;
        this.turu = turu;
        this.not = 0;


    }

    void OgretmenEkle(Ogretmen ogretmen) {
        if (ogretmen.brans.equals(turu)) {
            this.ogretmen = ogretmen;

        } else {
            System.out.println("Öğretmen ve Bölüm dersleri uyuşmuyor!");
        }
    }

    void OgretmenYazdir() {
        this.ogretmen.yazdir();
    }

}
