public class Main {
    public static void main(String[] args) {

        Ogretmen t1 = new Ogretmen("Ali Yılmaz", "0967", " Mat");
        Ogretmen t2 = new Ogretmen("ERTAN", "032", "FZK");
        Ogretmen t3 = new Ogretmen("İsmail", "99", "BİO");

        Ders mat = new Ders("Matematik", "101", " Mat");
        mat.OgretmenEkle(t1);


        Ders fizik = new Ders("Fizik", "102", "FZK");
        fizik.OgretmenEkle(t2);


        Ders biyoloji = new Ders("Biyoloji", "103", "BİO");
        biyoloji.OgretmenEkle(t3);

        Ogrenci s1 = new Ogrenci("Ahmet", "1", "4", mat, fizik, biyoloji);
        s1.TopluSinavNotUEkle(50, 90, 100);
        s1.Durum();
        s1.TopluSozluNotuEkle(80,90,100);

        Ogrenci s2 = new Ogrenci("Mehmet", "2", "1", mat, fizik, biyoloji);
        s2.TopluSinavNotUEkle(94,48,76);
        s2.Durum();
        s2.TopluSozluNotuEkle(70,80,95);

        Ogrenci s3=new Ogrenci("Hasan","3","3",mat,fizik,biyoloji);
        s3.TopluSinavNotUEkle(17,68,67);
        s3.Durum();
        s3.TopluSozluNotuEkle(60,80,90);


    }

}
