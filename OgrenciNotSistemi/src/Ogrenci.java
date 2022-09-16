public class Ogrenci {
    String ad,ogrenciNo,sinifi;
    Ders d1,d2,d3;
    double ortalama,ortalama1,ortalama2,ortalama3;
    boolean durum;

    Ogrenci(String ad, String ogrenciNo, String sinifi,  Ders d1, Ders d2, Ders d3) {
        this.ad = ad;
        this.ogrenciNo = ogrenciNo;
        this.sinifi = sinifi;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.ortalama = 0.0;
        this.durum = false;
    }
    void TopluSinavNotUEkle(int not1, int not2, int not3) {
        if (not1 >= 0 && not1 <= 100) {
            this.d1.not = not1;
        }
        if (not2 >= 0 && not2 <= 100) {
            this.d2.not = not2;

        }
        if (not3 >= 0 && not3 <= 100) {
            this.d3.not = not3;
        }
    }

    void TopluSozluNotuEkle(int sozluNotu1, int sozluNotu2, int sozluNotu3) {
        if (sozluNotu1 >= 0 && sozluNotu1 <= 100) {
            this.d1.sozluNotu = sozluNotu1;
        }
        if (sozluNotu2 >= 0 && sozluNotu2 <= 100) {
            this.d2.sozluNotu = sozluNotu2;
        }
        if (sozluNotu3 >= 0 && sozluNotu3 <= 100) {
            this.d3.sozluNotu = sozluNotu3;

        }
        System.out.println("Sözlü notu ortalamanız :" + (sozluNotu1 + sozluNotu2 + sozluNotu3) / 3);

    }
    void Durum() {
        System.out.println("-------------------------------------------------------------------------------------");
        OrtalamaHesapla();
        if (this.ortalama > 55) {
            System.out.println("Tebrikler geçtiniz !");
            this.durum = true;
        } else {
            System.out.println("Maalesef kaldınız :( ");
            this.durum = false;
        }
        NotYazdir();
    }

    void OrtalamaHesapla() {
        ortalama1= this.d1.not * 0.8 + this.d1.sozluNotu * 0.2;
        ortalama2 = this.d2.not * 0.8 + this.d2.sozluNotu * 0.2;
        ortalama3 = this.d3.not * 0.8 + this.d3.sozluNotu * 0.2;
        this.ortalama = (ortalama1 + ortalama2 + ortalama3) / 3.0;


    }


    void NotYazdir() {

        System.out.println("Öğrenci  :" + this.ad);
        System.out.println(this.d1.adı + " Notu :" + this.d1.not);
        System.out.println(this.d2.adı + " Notu :" + this.d2.not);
        System.out.println(this.d3.adı + " Notu :" + this.d3.not);
        System.out.println("Ortalamanız :" + this.ortalama);
    }

}
